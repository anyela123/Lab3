package com.example.applab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Datos {

    private static String fichero = "pacientes.dat";
    private static ArrayList<Alumno> alumnos = new ArrayList<>();

    public static void guardarArrayList(Alumno a) {
        recuperarArrayList();
        alumnos.add(a);
        try {
            ObjectOutputStream ficheroSalida = new ObjectOutputStream(new FileOutputStream(fichero));
            ficheroSalida.writeObject(alumnos);
            ficheroSalida.flush();
            ficheroSalida.close();

        } catch (FileNotFoundException fnfe) {
        } catch (IOException ioe) {
        }

    }

    public static void recuperarArrayList() {
        try {
            ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream(fichero));
            alumnos = (ArrayList<Alumno>)ficheroEntrada.readObject();
            ficheroEntrada.close();

        } catch (FileNotFoundException fnfe) {
        } catch (IOException ioe) {
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Alumno buscarAlumno (String dni) {
        recuperarArrayList();
        for (Alumno i : alumnos) {
            if (i.dni.equalsIgnoreCase(dni)) {
                return i;
            }
        }
        return null;
    }
}

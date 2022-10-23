package com.example.applab;

import java.io.Serializable;

public class Alumno implements Serializable {

    public String dni;
    public String nombre;
    public String apellido;
    public String fNacimiento;
    public String colegio;
    public String carrera;

    public Alumno (String dni, String nombre, String apellido, String fNacimiento, String colegio,String carrera){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
        this.colegio = colegio;
        this.carrera = carrera;
    }

    public String Datos (){
        return "DNI: "+dni+
                "\n Nombres: "+nombre+
                "\n Apellidos: "+apellido+
                "\nFecha de nacimiento: "+fNacimiento+
                "\nColegio: "+colegio+
                "\nCarrera: "+carrera;
    }
}

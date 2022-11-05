package com.example.applab;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class SearchPostulantActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_postulant);
        EditText etDni = findViewById(R.id.etDniSearch);
        Button btnBuscar = findViewById(R.id.btnSearch);
        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Datos datos = new Datos();
                String bdni = etDni.getText().toString();
                Alumno alumno = datos.buscarAlumno(bdni);
                EditText dni = findViewById(R.id.etDni);
                EditText etNombre = findViewById(R.id.etName);
                EditText etApellido = findViewById(R.id.etLastname);
                EditText etFNacimiento = findViewById(R.id.etBirthday);
                EditText etColegio = findViewById(R.id.etSchool);
                EditText etCarrera = findViewById(R.id.etCareer);
                TextView encontro = findViewById(R.id.prueba);
                if (alumno != null) {
                    dni.setText(alumno.dni);
                    etNombre.setText(alumno.nombre);
                    etApellido.setText(alumno.apellido);
                    etFNacimiento.setText(alumno.fNacimiento);
                    etColegio.setText(alumno.colegio);
                    etCarrera.setText(alumno.carrera);
                    encontro.setText("Alumno Encontrado");
                }
                else{
                    dni.setText("null");
                    etNombre.setText("null");
                    etApellido.setText("null");
                    etFNacimiento.setText("null");
                    etColegio.setText("null");
                    etCarrera.setText("null");
                    encontro.setText("null");
                    encontro.setText("No se encontró al Alumno");
                }
            }
        });
    }
}
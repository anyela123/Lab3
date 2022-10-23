package com.example.applab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreatePostulantActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_postulant);

        EditText etDni = findViewById(R.id.etDni);
        EditText etNombre = findViewById(R.id.etName);
        EditText etApellido = findViewById(R.id.etLastname);
        EditText etFNacimiento = findViewById(R.id.etBirthday);
        EditText etColegio = findViewById(R.id.etSchool);
        EditText etCarrera = findViewById(R.id.etCareer);
        Button btnCreate = findViewById(R.id.btnCreate);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Datos datos = new Datos();
                Intent next = new Intent(getApplicationContext(), MainActivity.class);
                String dni = etDni.getText().toString();
                String nombre = etNombre.getText().toString();
                String apellido = etApellido.getText().toString();
                String nacimiento = etFNacimiento.getText().toString();
                String colegio = etColegio.getText().toString();
                String carrera = etCarrera.getText().toString();
                Alumno alumnoNuevo = new Alumno(dni,nombre,apellido,nacimiento,colegio,carrera);
                datos.guardarArrayList(alumnoNuevo);
                startActivity(next);
            }
        });
    }
}
package com.example.proyectonuevo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class CantidadProducto extends AppCompatActivity {

    DatabaseReference mRootReference;
    Button btnSubirDatos;
    EditText numeroCantidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cantidad_producto);

        btnSubirDatos = findViewById(R.id.btnSubirFirebase);
        mRootReference = FirebaseDatabase.getInstance().getReference();
        numeroCantidad = findViewById(R.id.edtxCantidad);

        btnSubirDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cantidad = Integer.parseInt(numeroCantidad.getText().toString());

                CargarDatosFirebase(cantidad);
            }
        });
    }

    private void CargarDatosFirebase(int cantidad) {
        Map<String, Object> datosComanda = new HashMap<>();
        datosComanda.put("cantidad", cantidad);
        //Solo se agregan los demas datos
        //datosComanda.put("comida1", comida1);

        mRootReference.child("Comanda").push().setValue(datosComanda);
    }

    public void regresar (View view){
        finish();
    }
}

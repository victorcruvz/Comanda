package com.example.proyectonuevo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NuevoPedidoComidaCostillas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_pedido_comida_costillas);
    }

    public void irCantidad(View view){
        Intent intent = new Intent(this, CantidadProducto.class);
        startActivity(intent);
    }

    public void regresar (View view){
        finish();
    }
}

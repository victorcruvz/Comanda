package com.example.proyectonuevo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NuevoPedido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_pedido);
    }

    public void regresar (View view){
        finish();
    }

    public void irPedidoNuevoComida(View view){
        Intent intent = new Intent(this, NuevoPedidoComida.class);
        startActivity(intent);
    }

    public void irCantidad(View view){
        Intent intent = new Intent(this, CantidadProducto.class);
        startActivity(intent);
    }
}

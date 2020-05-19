package com.example.proyectonuevo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NuevoPedidoComida extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_pedido_comida);
    }

    public void regresar (View view){
        finish();
    }

    public void irAlitas(View view){
        Intent intent = new Intent(this, NuevoPedidoComidaAlitas.class);
        startActivity(intent);
    }

    public void irPaquetes(View view){
        Intent intent = new Intent(this, NuevoPedidoComidaPaquetes.class);
        startActivity(intent);
    }

    public void irHamburguesas(View view){
        Intent intent = new Intent(this, NuevoPedidoComidaHamburguesas.class);
        startActivity(intent);
    }

    public void irBouneles(View view){
        Intent intent = new Intent(this, NuevoPedidoComidaBouneles.class);
        startActivity(intent);
    }

    public void irCostillas(View view){
        Intent intent = new Intent(this, NuevoPedidoComidaCostillas.class);
        startActivity(intent);
    }

    public void irPapas(View view){
        Intent intent = new Intent(this, NuevoPedidoComidaPapas.class);
        startActivity(intent);
    }

    public void irPromocion(View view){
        Intent intent = new Intent(this, NuevoPedidoComidaPromocion.class);
        startActivity(intent);
    }
}

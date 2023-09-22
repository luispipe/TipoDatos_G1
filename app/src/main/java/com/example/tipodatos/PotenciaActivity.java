package com.example.tipodatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PotenciaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potencia);

        //Operaciones númericas

        int valor1= 5;
        int valor2= 100;
        double decimales= 10.55;
        double decimales1= 63.14;

        double formula= decimales1-valor1*valor2+decimales;
        //división de enteros  / nos trae el cociente y el % nos trae el residuo
        int div= valor1/valor2;
        double div2= valor1/valor2;
        int div4= 5%2;
        double div6= 5.0/2.0;
        double div5= 5.0/100.0;
        double div3= decimales1/valor1;

        System.out.println(div5);
        System.out.println(div3);



    }
}
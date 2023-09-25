package com.example.tipodatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MatchTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_text);
        //Operaciones sobre textos
        char letra_a= 'a';
        String texto1="Hola";
        String texto2= "hola";
        //Comparar teniendo en cuenta mayusculas y minusculas
        boolean iguales= texto1.equals(texto2); //false
        //Comparar sin tener en cuenta mayusculas y minusculas
        boolean iguales1= texto1.equalsIgnoreCase(texto2);//true

        String texto3= "Hola mundo";
        boolean contain= texto1.contains(texto3);//false
        boolean contain1= texto3.contains(texto1);//true
        //El contain es sensible a mayusculas y minusculas
        boolean contain2= texto3.contains(texto2);//false

        String texto4= texto1.replace('a','i');//Holi
        //Convertir texto a mayuscula
        String text1May= texto1.toUpperCase();
        //Convertir un texto a minuscula
        String texto2Min= texto2.toLowerCase();

        String textoComb= texto1.concat(texto2);
        String textoComb2= texto1+" "+texto2+" "+texto3+texto4;

        System.out.println(iguales);
        System.out.println(iguales1);
        System.out.println(contain2);


    }
}
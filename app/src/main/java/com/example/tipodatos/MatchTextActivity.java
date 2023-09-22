package com.example.tipodatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MatchTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_text);
        //Operaciones sobre textos

        String texto1="Hola";
        String texto2= "hola";
        boolean iguales= texto1.equals(texto2); //false
        boolean iguales1= texto1.equalsIgnoreCase(texto2);//true

        String texto3= "Hola mundo";
        boolean contain= texto1.contains(texto3);//false
        boolean contain1= texto3.contains(texto1);//true

        String texto4= texto1.replace('a','i');//Holi
        String text1May= texto1.toUpperCase();
        String texto2Min= texto2.toLowerCase();

        String textoComb= texto1.concat(texto2);
        String textoComb2= texto1+" "+texto2+" "+texto3+texto4;

        System.out.println(iguales);
        System.out.println(iguales1);


    }
}
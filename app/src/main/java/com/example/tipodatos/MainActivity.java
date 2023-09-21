package com.example.tipodatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Tipos de datos
        * Nativos
        * Númerico - Texto - Booleano
        * Númericos Enteros: byte-short-int (comun)-long
        * Númericos Decimales: float - double (comun)
        * Texto: String (Cadena de texto), char (1 solo caracter)
        * Booleano: boolean (true or false)
        * */
        //declaración x,y,z
        //int x,y,z;
        int x;
        int y;
        int z;
        x=15;//defini x
        y=10;//defini y

        //Definición y declaración
        byte ejemploByte= 16;
        short ejemploShort= 25000;
        int ejemploInt= 999999999;
        long ejemploLong= 1000000000000000000l;
        float ejemploFloat= 1.555f;
        double ejemploDouble= 1.5555;

        String ejemploTexto= "288";
        char ejemploChar= '@';
        boolean ejemploBoolean= true;

        //print permite mostrar cualquier tipo de dato
        System.out.println(ejemploTexto);
        //Log solo permite mostrar texto
        Log.i("String",ejemploByte+"");

        //Conversión de tipos de datos o Casteo
        // De cualquier tipo de dato a String
        String casteoInt= ejemploInt+""; //concatenación de ""
        String casteoInt2= String.valueOf(ejemploInt);
        String casteoDoubles= ejemploDouble+""; //concatenación de ""
        String casteoDoubles2= String.valueOf(ejemploDouble);
        String casteoBoolean= ejemploBoolean+"";
        String casteoBoolean2= String.valueOf(ejemploBoolean);
        String casteoChar= ejemploChar+"";
        String casteoChar2= String.valueOf(ejemploChar);

        //De cualqueir tipo de dato a int
        int casteoDouble= (int)ejemploDouble;//Que tomo la parte entera del número ej: 5.68 tomo 5
        int casteoString= Integer.parseInt(ejemploTexto);//Solo funciona si hay un número entre comillas o el texto es un número
        int casteoCharInt= (int)ejemploChar;

        char letra_a= 'a';
        char letra_A= 'A';

        System.out.println((int)letra_A);
        System.out.println((int)letra_a);
        System.out.println(casteoCharInt);
    }
}
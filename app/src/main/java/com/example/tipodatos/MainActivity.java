package com.example.tipodatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonAscii= findViewById(R.id.buttonASCII);
        Button botonPotencia= findViewById(R.id.buttonCalcular);
        Button botonMatchText= findViewById(R.id.buttonMatchText);

        Intent ascii= new Intent(getApplicationContext(), AsciiActivity.class);
        Intent potencia= new Intent(getApplicationContext(), PotenciaActivity.class);
        Intent matchText= new Intent(getApplicationContext(), MainActivity.class);

        botonAscii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(ascii);
            }
        });

        botonPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(potencia);
            }
        });

        botonMatchText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(matchText);
            }
        });

        /*Tipos de datos
        * Nativos java
        * Númerico - Texto - Booleano
        * Númericos Enteros: byte-short-int (comun)-long
        * Númericos Decimales: float - double (comun)
        * Texto: String (Cadena de texto), char (1 solo caracter)
        * Booleano: boolean (true or false)
        * */
        //declaración x,y,z
        //int x,y,z;
      /*  int x;
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
        //println es la forma de imprimir de java
        System.out.println(ejemploTexto);
        //Log solo permite mostrar texto
        //Log la forma de imprimir de android
        Log.i("Casteo de byte a String",ejemploByte+"");

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

        //De cualquier tipo de dato a int
        int casteoDouble= (int)ejemploDouble;//Que tomo la parte entera del número ej: 5.68 tomo 5
        int casteoString= Integer.parseInt(ejemploTexto);//Solo funciona si hay un número entre comillas o el texto es un número
        int casteoCharInt= (int)ejemploChar;

        System.out.println((int)5.29);

        //Casteo para convertir en decimal
        double casteoInt_Double= 33; // 33 --> 33.0
        double casteoString_double= Double.parseDouble("55.25");//Si dentro de las comillas hay valores diferentes a númericos da error

        //Casteo de un entero a caracter
        int letra_C= 67;
        char c= (char) letra_C;

        /*
           Ejemplo ASCII
        char letra_a= 'a';
        char letra_A= 'A';
        System.out.println((int)letra_A);
        System.out.println((int)letra_a);
        System.out.println(casteoCharInt);*/
    }
}
package com.example.tipodatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AsciiActivity extends AppCompatActivity {
    //Global
    Button btnConvertir;
    EditText etxChar, etxAscii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ascii);
        //local-->  solo lo podra usar la función onCreate
        // Button btnConvertir= findViewById(R.id.buttonConvertAscii);
        btnConvertir= findViewById(R.id.buttonConvertAscii);
        etxChar= findViewById(R.id.editTextChar);
        etxAscii= findViewById(R.id.editTextAscii);

        //Tipo de dato objeto--> almacena cualquier tipo de dato
       /* Object a= "Hola";
        a= 5;
        a=true;
        a= 5.5;*/

        /* LLega un carácter y devuelvo el valor en ascii
        * 1 y solo 1 carácter
        *
        * */

        //El metodo toString es el metodo principal de los Object, y lo que hace es convertirlo a String
        String textoChar= etxChar.getText().toString();

        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //texto que llega esta vacio o tiene más de 1 carácter
                // el tamaño de los textos inicia desde 0 hasta n-1
                // Hola Mundo -> 0->H 1->o 2->l 3->a 4->_ 5->M 6->u 7->n 8->d 9->0
                // .length = (n=10)-1= 9

                if (textoChar.length()==1){
                    char caracter= textoChar.charAt(0);
                    int ascii= (int)caracter;
                    etxAscii.setText(ascii+"");
                }else {
                    Toast.makeText(getApplicationContext(),
                            "Se requiere que solo sea un 1 carácter",Toast.LENGTH_LONG).show();
                }


            }
        });






    }


}
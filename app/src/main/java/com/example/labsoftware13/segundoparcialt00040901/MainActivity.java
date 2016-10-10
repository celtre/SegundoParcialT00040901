package com.example.labsoftware13.segundoparcialt00040901;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.loopj.android.http.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {

    TextView Resultado, Log;
    Button uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero, igual, div, mul, res, sum;
    private int puls = 0;
    private int a, b;
    private String o, resul;

    private AsyncHttpClient client = new AsyncHttpClient();


    String url = "http://162.243.64.94/dm.php";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log = (TextView) findViewById(R.id.txtLog);
        Resultado = (TextView) findViewById(R.id.txtResul);
        cero = (Button)findViewById(R.id.buttonCero);
        uno = (Button)findViewById(R.id.buttonUno);
        dos = (Button)findViewById(R.id.buttonDos);
        tres = (Button)findViewById(R.id.buttonTres);
        cuatro = (Button)findViewById(R.id.buttonCuatro);
        cinco = (Button)findViewById(R.id.buttonCinco);
        seis = (Button)findViewById(R.id.buttonSeis);
        siete = (Button)findViewById(R.id.buttonSiete);
        ocho = (Button)findViewById(R.id.buttonOcho);
        nueve = (Button)findViewById(R.id.buttonNueve);
        igual = (Button)findViewById(R.id.buttonEquals);
        div = (Button)findViewById(R.id.buttonDiv);
        mul = (Button)findViewById(R.id.buttonMul);
        res = (Button)findViewById(R.id.buttonRes);
        sum = (Button)findViewById(R.id.buttonSum);

        cero.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                if (puls == 0){
                    Resultado.setText("0");
                    puls++;
                }else{
                    Resultado.setText(Resultado.getText()+"0");
                    puls++;
                }

            };

        });
        uno.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                if (puls == 0){
                    Resultado.setText("1");
                    puls++;
                }else{
                    Resultado.setText(Resultado.getText()+"1");
                    puls++;
                }

            };

        });
        dos.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                if (puls == 0){
                    Resultado.setText("2");
                    puls++;
                }else{
                    Resultado.setText(Resultado.getText()+"2");
                    puls++;
                }

            };

        });
        tres.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                if (puls == 0){
                    Resultado.setText("3");
                    puls++;
                }else{
                    Resultado.setText(Resultado.getText()+"3");
                    puls++;
                }

            };

        });
        cuatro.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                if (puls == 0){
                    Resultado.setText("4");
                    puls++;
                }else{
                    Resultado.setText(Resultado.getText()+"4");
                    puls++;
                }

            };

        });
        cinco.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                if (puls == 0){
                    Resultado.setText("5");
                    puls++;
                }else{
                    Resultado.setText(Resultado.getText()+"5");
                    puls++;
                }

            };

        });
        seis.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                if (puls == 0){
                    Resultado.setText("6");
                    puls++;
                }else{
                    Resultado.setText(Resultado.getText()+"6");
                    puls++;
                }

            };

        });
        siete.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                if (puls == 0){
                    Resultado.setText("7");
                    puls++;
                }else{
                    Resultado.setText(Resultado.getText()+"7");
                    puls++;
                }

            };

        });
        ocho.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                if (puls == 0){
                    Resultado.setText("8");
                    puls++;
                }else{
                    Resultado.setText(Resultado.getText()+"8");
                    puls++;
                }

            };

        });
        nueve.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                if (puls == 0){
                    Resultado.setText("9");
                    puls++;
                }else{
                    Resultado.setText(Resultado.getText()+"9");
                    puls++;
                }

            };

        });
        sum.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                if(puls == 0){
                    Toast toast= Toast.makeText(getApplicationContext(), "Por favor ingresa un numero antes de operar", Toast.LENGTH_SHORT);
                    toast.show();
                }else{
                    if (Resultado.getText() == ""){
                        Toast toast= Toast.makeText(getApplicationContext(), "Por favor ingresa un numero antes de operar", Toast.LENGTH_SHORT);
                        toast.show();
                    }else{
                        Log.setText(Resultado.getText()+"\n"+"+");
                        a = Integer.parseInt(Resultado.getText().toString());
                        Resultado.setText("");
                        o = "sum";
                    }

                }
            }
        });
        res.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                if(puls == 0){
                    Toast toast= Toast.makeText(getApplicationContext(), "Por favor ingresa un numero antes de operar", Toast.LENGTH_SHORT);
                    toast.show();
                }else{
                    if (Resultado.getText() == ""){
                        Toast toast= Toast.makeText(getApplicationContext(), "Por favor ingresa un numero antes de operar", Toast.LENGTH_SHORT);
                        toast.show();
                    }else{
                        Log.setText(Resultado.getText()+"\n"+"-");
                        a = Integer.parseInt(Resultado.getText().toString());
                        Resultado.setText("");
                        o = "res";
                    }

                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                if(puls == 0){
                    Toast toast= Toast.makeText(getApplicationContext(), "Por favor ingresa un numero antes de operar", Toast.LENGTH_SHORT);
                    toast.show();
                }else{

                    if (Resultado.getText() == ""){
                        Toast toast= Toast.makeText(getApplicationContext(), "Por favor ingresa un numero antes de operar", Toast.LENGTH_SHORT);
                        toast.show();
                    }else{
                        Log.setText(Resultado.getText()+"\n"+"*");
                        a = Integer.parseInt(Resultado.getText().toString());
                        Resultado.setText("");
                        o = "mul";
                    }


                }


            }
        });
        div.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                if(puls == 0){
                    Toast toast= Toast.makeText(getApplicationContext(), "Por favor ingresa un numero antes de operar", Toast.LENGTH_SHORT);
                    toast.show();
                }else{

                    if (Resultado.getText() == ""){
                        Toast toast= Toast.makeText(getApplicationContext(), "Por favor ingresa un numero antes de operar", Toast.LENGTH_SHORT);
                        toast.show();
                    }else{
                        Log.setText(Resultado.getText()+"\n"+"/");
                        a = Integer.parseInt(Resultado.getText().toString());
                        Resultado.setText("");
                        o = "div";
                    }


                }
            }
        });
        igual.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                if(puls == 0){
                    Toast toast= Toast.makeText(getApplicationContext(), "Por favor ingresa un numero antes de operar", Toast.LENGTH_SHORT);
                    toast.show();
                }else{

                    if (Resultado.getText() == "" || Log.getText() == ""){
                        Toast toast= Toast.makeText(getApplicationContext(), "Por favor ingresa un numero antes de operar", Toast.LENGTH_SHORT);
                        toast.show();
                    }else{
                        b = Integer.parseInt(Resultado.getText().toString());
                        RequestParams params = new RequestParams();
                        params.put("o", o);
                        params.put("a", String.valueOf(a));
                        params.put("b", String.valueOf(b));


                        client.post(url, params, new JsonHttpResponseHandler(){
                            @Override
                            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                                try {
                                    resul = response.get();


                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }
                            @Override
                            public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
                                Log.v("Respuesta JSON:", response.toString());
                            }


                        });
                    }


                }
            }
        });

    }
}

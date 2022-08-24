package com.software.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Integer operador = 0;

    String strValores = "";
    Double numero1 = 0.0;
    Double numero2 = 0.0;
    Double resultado = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn0 = findViewById(R.id.botao0);
        Button btn1 = findViewById(R.id.botao1);
        Button btn2 = findViewById(R.id.botao2);
        Button btn3 = findViewById(R.id.botao3);
        Button btn4 = findViewById(R.id.botao4);
        Button btn5 = findViewById(R.id.botao5);
        Button btn6 = findViewById(R.id.botao6);
        Button btn7 = findViewById(R.id.botao7);
        Button btn8 = findViewById(R.id.botao8);
        Button btn9 = findViewById(R.id.botao9);

        Button btnDivisao = findViewById(R.id.botaoDividir);
        Button btnMultiplicacao = findViewById(R.id.botaoMultiplicar);
        Button btnSubtrair = findViewById(R.id.botaoSubtrair);
        Button btnAdicao = findViewById(R.id.botaoAdicao);
        Button btnPonto = findViewById(R.id.botaoPonto);
        Button btnResultado = findViewById(R.id.botaoResultado);
        Button btnApagar = findViewById(R.id.botaoApagar);

        TextView areaTexto = findViewById(R.id.areaTexto);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strValores = strValores.concat("0");

                areaTexto.setText(strValores);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strValores = strValores.concat("1");

                areaTexto.setText(strValores);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strValores = strValores.concat("2");

                areaTexto.setText(strValores);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strValores = strValores.concat("3");

                areaTexto.setText(strValores);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strValores = strValores.concat("4");

                areaTexto.setText(strValores);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strValores = strValores.concat("5");

                areaTexto.setText(strValores);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strValores = strValores.concat("6");

                areaTexto.setText(strValores);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strValores = strValores.concat("7");

                areaTexto.setText(strValores);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strValores = strValores.concat("8");

                areaTexto.setText(strValores);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strValores = strValores.concat("9");

                areaTexto.setText(strValores);
            }
        });

        btnPonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer aux = strValores.indexOf(".");

                if (aux == -1) {
                    strValores = strValores.concat(".");

                    areaTexto.setText(strValores);
                }
            }
        });

        btnApagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (strValores.length() != 0) {
                    StringBuilder str = new StringBuilder(strValores);
                    str.deleteCharAt(strValores.length() - 1);

                    strValores = str.toString();

                    areaTexto.setText(strValores);
                }
            }
        });

        btnDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = 1;

                numero1 = Double.parseDouble(strValores);

                strValores = "";
                areaTexto.setText(strValores);
            }
        });

        btnMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = 2;

                numero1 = Double.parseDouble(strValores);

                strValores = "";
                areaTexto.setText(strValores);
            }
        });

        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = 3;

                numero1 = Double.parseDouble(strValores);

                strValores = "";
                areaTexto.setText(strValores);
            }
        });

        btnAdicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = 4;

                numero1 = Double.parseDouble(strValores);

                strValores = "";
                areaTexto.setText(strValores);
            }
        });

        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero2 = Double.parseDouble(strValores);

                if (operador == 1 && numero2 == 0) {
                    areaTexto.setText("Divisão por 0");
                } else {
                    switch (operador) {
                        case 1: {
                            resultado = numero1 / numero2;

                            break;
                        }
                        case 2: {
                            resultado = numero1 * numero2;

                            break;
                        }
                        case 3: {
                            resultado = numero1 - numero2;

                            break;
                        }
                        case 4: {
                            resultado = numero1 + numero2;

                            break;
                        }
                    }

                    if (((resultado * 10) % 10) == 0) {
                        Integer aux = resultado.intValue();

                        areaTexto.setText(aux.toString());
                    } else {
                        areaTexto.setText(String.format("%.2f", resultado));
                    }
                }
            }
        });
    }

}
package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.StrictMath.acos;
import static java.lang.StrictMath.asin;
import static java.lang.StrictMath.atan;
import static java.lang.StrictMath.cos;
import static java.lang.StrictMath.log;
import static java.lang.StrictMath.log10;
import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sin;
import static java.lang.StrictMath.sqrt;
import static java.lang.StrictMath.tan;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2, et4;
    TextView et3, et5;
    Button badd,bsub,bpow,bmul, bdiv, bmod, bclr, broot, bfact, bclr1, bx2, b10x, blog, bex, bln;
    Button bsin,bcos,btan,bsinin,bcosin,btanin,bopa;
    float num1, num2;
    double num3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        badd = findViewById(R.id.badd);
        bsub = findViewById(R.id.bsub);
        bpow = findViewById(R.id.bpow);
        bmul = findViewById(R.id.bmul);
        bdiv = findViewById(R.id.bdiv);
        bmod = findViewById(R.id.bmod);
        bclr = findViewById(R.id.bclr);
        broot = findViewById(R.id.broot);
        bfact = findViewById(R.id.bfact);
        bx2 = findViewById(R.id.bx2);
        b10x = findViewById(R.id.b10x);
        blog = findViewById(R.id.blog);
        bex = findViewById(R.id.bex);
        bln = findViewById(R.id.bln);
        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        btan = findViewById(R.id.btan);
        bsinin = findViewById(R.id.bsinin);
        bcosin = findViewById(R.id.bcosin);
        btanin = findViewById(R.id.btanin);
        bopa = findViewById(R.id.bopa);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);

        
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().length() != 0 && et2.getText().length() != 0) {
                    num1 = Float.parseFloat(et1.getText() + "");
                    num2 = Float.parseFloat(et2.getText() + "");
                    et3.setText(num1 + num2 + "");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "দুটি নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                    et3.setText(null);
                }
            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().length() != 0 && et2.getText().length() != 0) {
                    num1 = Float.parseFloat(et1.getText() + "");
                    num2 = Float.parseFloat(et2.getText() + "");
                    et3.setText(num1 - num2 + "");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "দুটি নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                    et3.setText(null);
                }
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().length() != 0 && et2.getText().length() != 0) {
                    num1 = Float.parseFloat(et1.getText() + "");
                    num2 = Float.parseFloat(et2.getText() + "");
                    et3.setText(num1 * num2 + "");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "দুটি নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                    et3.setText(null);
                }
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().length() != 0 && et2.getText().length() != 0) {
                    num1 = Float.parseFloat(et1.getText() + "");
                    num2 = Float.parseFloat(et2.getText() + "");
                    et3.setText(num1 / num2 + "");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "দুটি নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                    et3.setText(null);
                }
            }
        });

        bpow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().length() != 0 && et2.getText().length() != 0) {
                    num1 = Float.parseFloat(et1.getText() + "");
                    num2 = Float.parseFloat(et2.getText() + "");
                    et3.setText(pow(num1, num2) + "");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "দুটি নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                    et3.setText(null);
                }
            }
        });

        bmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().length() != 0 && et2.getText().length() != 0) {
                    num1 = Float.parseFloat(et1.getText() + "");
                    num2 = Float.parseFloat(et2.getText() + "");
                    et3.setText(num1 % num2 + "");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "দুটি নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                    et3.setText(null);
                }
            }
        });

        bopa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et3.getText().length() != 0) {
                    et1.setText(et3.getText() + "");
                    et2.setText(null);
                    et3.setText(null);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "No Result Yet", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(null);
                et2.setText(null);
                et3.setText(null);
            }
        });


        broot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this,v);
                popup.getMenuInflater().inflate(R.menu.popup_option, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId())
                        {
                            case R.id.first:
                                if(et1.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et1.getText() + "");
                                    et3.setText(sqrt(num3) + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "প্রথম নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;

                            case  R.id.second:
                                if(et2.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et2.getText() + "");
                                    et3.setText(sqrt(num3) + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "দ্বিতীয় নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;
                        }
                        return false;
                    }
                });
                popup.show();
            }
        });

        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this,v);
                popup.getMenuInflater().inflate(R.menu.popup_option, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId())
                        {
                            case R.id.first:
                                if(et1.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et1.getText() + "");
                                    double factorial = num3;
                                    for (int i = 1; i < num3; i++) {
                                        factorial = i * factorial;
                                    }
                                    et3.setText(factorial + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "প্রথম নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;

                            case  R.id.second:
                                if(et2.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et2.getText() + "");
                                    double factorial = num3;
                                    for (int i = 1; i < num3; i++) {
                                        factorial = i * factorial;
                                    }
                                    et3.setText(factorial + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "দ্বিতীয় নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;
                        }
                        return false;
                    }
                });
                popup.show();
            }
        });

        bx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this,v);
                popup.getMenuInflater().inflate(R.menu.popup_option, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId())
                        {
                            case R.id.first:
                                if(et1.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et1.getText() + "");
                                    et3.setText(num3 * num3 + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "প্রথম নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;

                            case  R.id.second:
                                if(et2.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et2.getText() + "");
                                    et3.setText(num3 * num3 + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "দ্বিতীয় নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;
                        }
                        return false;
                    }
                });
                popup.show();
                // if (et4.getText().length() != 0) {
                //     num3 = Double.parseDouble(et4.getText() + "");
                //     et5.setText(num3 * num3 + "");
                // }
                // else {
                //     et5.setText("প্রথমে একটি নম্বর লিখুন");
                // }
            }
        });

        b10x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this,v);
                popup.getMenuInflater().inflate(R.menu.popup_option, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId())
                        {
                            case R.id.first:
                                if(et1.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et1.getText() + "");
                                    et3.setText(pow(10, num3) + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "প্রথম নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;

                            case  R.id.second:
                                if(et2.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et2.getText() + "");
                                    et3.setText(pow(10, num3) + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "দ্বিতীয় নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;
                        }
                        return false;
                    }
                });
                popup.show();
                // if (et4.getText().length() != 0) {
                //     num3 = Double.parseDouble(et4.getText() + "");
                //     et5.setText(pow(10, num3) + "");
                // }
                // else {
                //     et5.setText("প্রথমে একটি নম্বর লিখুন");
                // }
            }
        });

        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this,v);
                popup.getMenuInflater().inflate(R.menu.popup_option, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId())
                        {
                            case R.id.first:
                                if(et1.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et1.getText() + "");
                                    et3.setText(log10(num3) + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "প্রথম নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;

                            case  R.id.second:
                                if(et2.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et2.getText() + "");
                                    et3.setText(log10(num3) + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "দ্বিতীয় নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;
                        }
                        return false;
                    }
                });
                popup.show();
                // if (et4.getText().length() != 0){
                //     num3 = Double.parseDouble(et4.getText() + "");
                //     et5.setText(log10(num3) + "");
                // }
                // else {
                //     et5.setText("প্রথমে একটি নম্বর লিখুন");
                // }
            }
        });

        bex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this,v);
                popup.getMenuInflater().inflate(R.menu.popup_option, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId())
                        {
                            case R.id.first:
                                if(et1.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et1.getText() + "");
                                    double e = 2.7182818284590;
                                    et3.setText(pow(e, num3) + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "প্রথম নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;

                            case  R.id.second:
                                if(et2.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et2.getText() + "");
                                    double e = 2.7182818284590;
                                    et3.setText(pow(e, num3) + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "দ্বিতীয় নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;
                        }
                        return false;
                    }
                });
                popup.show();
                // if (et4.getText().length() != 0) {
                //     num3 = Double.parseDouble(et4.getText() + "");
                //     double e = 2.7182818284590;
                //     et5.setText(pow(e, num3) + "");
                // }
                // else {
                //     et5.setText("প্রথমে একটি নম্বর লিখুন");
                // }
            }
        });

        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this,v);
                popup.getMenuInflater().inflate(R.menu.popup_option, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId())
                        {
                            case R.id.first:
                                if(et1.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et1.getText() + "");
                                    et3.setText(log(num3) + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "প্রথম নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;

                            case  R.id.second:
                                if(et2.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et2.getText() + "");
                                    et3.setText(log(num3) + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "দ্বিতীয় নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;
                        }
                        return false;
                    }
                });
                popup.show();
                // if (et4.getText().length() != 0) {
                //     num3 = Double.parseDouble(et4.getText() + "");
                //     et5.setText(log(num3) + "");
                // }
                // else {
                //     et5.setText("প্রথমে একটি নম্বর লিখুন");
                // }
            }
        });

        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this,v);
                popup.getMenuInflater().inflate(R.menu.popup_option, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId())
                        {
                            case R.id.first:
                                if(et1.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et1.getText() + "");
                                    et3.setText(sin(num3) + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "প্রথম নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;

                            case  R.id.second:
                                if(et2.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et2.getText() + "");
                                    et3.setText(sin(num3) + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "দ্বিতীয় নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;
                        }
                        return false;
                    }
                });
                popup.show();
            }
        });

        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this,v);
                popup.getMenuInflater().inflate(R.menu.popup_option, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId())
                        {
                            case R.id.first:
                                if(et1.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et1.getText() + "");
                                    et3.setText(cos(num3) + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "প্রথম নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;

                            case  R.id.second:
                                if(et2.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et2.getText() + "");
                                    et3.setText(cos(num3) + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "দ্বিতীয় নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;
                        }
                        return false;
                    }
                });
                popup.show();
            }
        });

        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this,v);
                popup.getMenuInflater().inflate(R.menu.popup_option, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId())
                        {
                            case R.id.first:
                                if(et1.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et1.getText() + "");
                                    et3.setText(tan(num3) + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "প্রথম নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;

                            case  R.id.second:
                                if(et2.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et2.getText() + "");
                                    et3.setText(tan(num3) + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "দ্বিতীয় নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;
                        }
                        return false;
                    }
                });
                popup.show();
            }
        });

        bsinin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this,v);
                popup.getMenuInflater().inflate(R.menu.popup_option, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId())
                        {
                            case R.id.first:
                                if(et1.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et1.getText() + "");
                                    et3.setText(asin(num3) + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "প্রথম নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;

                            case  R.id.second:
                                if(et2.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et2.getText() + "");
                                    et3.setText(asin(num3) + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "দ্বিতীয় নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;
                        }
                        return false;
                    }
                });
                popup.show();
            }
        });

        bcosin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this,v);
                popup.getMenuInflater().inflate(R.menu.popup_option, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId())
                        {
                            case R.id.first:
                                if(et1.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et1.getText() + "");
                                    et3.setText(acos(num3) + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "প্রথম নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;

                            case  R.id.second:
                                if(et2.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et2.getText() + "");
                                    et3.setText(acos(num3) + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "দ্বিতীয় নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;
                        }
                        return false;
                    }
                });
                popup.show();
            }
        });

        btanin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this,v);
                popup.getMenuInflater().inflate(R.menu.popup_option, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId())
                        {
                            case R.id.first:
                                if(et1.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et1.getText() + "");
                                    et3.setText(atan(num3) + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "প্রথম নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;

                            case  R.id.second:
                                if(et2.getText().length() != 0)
                                {
                                    num3 = Double.parseDouble(et2.getText() + "");
                                    et3.setText(atan(num3) + "");
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "দ্বিতীয় নম্বর লিখুন", Toast.LENGTH_SHORT).show();
                                    et3.setText(null);
                                }
                                break;
                        }
                        return false;
                    }
                });
                popup.show();
            }
        });



    }
}

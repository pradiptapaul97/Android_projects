package com.example.tictactoy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Time;


public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,br,rs;
    int player = 1,player1_score=0,player2_score=0,total_play;
    TextView s1,s2;

    Time timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        br = findViewById(R.id.br);
        rs = findViewById(R.id.rs);
        s1 = findViewById(R.id.s1);
        s2 = findViewById(R.id.s2);

        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setText(null);
                b2.setText(null);
                b3.setText(null);
                b4.setText(null);
                b5.setText(null);
                b6.setText(null);
                b7.setText(null);
                b8.setText(null);
                b9.setText(null);
                player = 1;
            }
        });

        rs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1.setText("0/0");
                s2.setText("0/0");
                player1_score = 0;
                player2_score = 0;
                total_play = 0;

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().length() == 0)
                {
                    if(player==1)
                    {
                        b1.setText("O");
                        player = 2;
                    }
                    else {
                        b1.setText("X");
                        player = 1;
                    }
                    checkresult();
                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().length() == 0)
                {
                    if(player==1)
                    {
                        b2.setText("O");
                        player = 2;
                    }
                    else {
                        b2.setText("X");
                        player = 1;
                    }
                    checkresult();
                }

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText().length() == 0)
                {
                    if(player==1)
                    {
                        b3.setText("O");
                        player = 2;
                    }
                    else {
                        b3.setText("X");
                        player = 1;
                    }
                    checkresult();
                }

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText().length() == 0)
                {
                    if(player==1)
                    {
                        b4.setText("O");
                        player = 2;
                    }
                    else {
                        b4.setText("X");
                        player = 1;
                    }
                    checkresult();
                }

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b5.getText().length() == 0)
                {
                    if(player==1)
                    {
                        b5.setText("O");
                        player = 2;
                    }
                    else {
                        b5.setText("X");
                        player = 1;
                    }
                    checkresult();
                }

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b6.getText().length() == 0)
                {
                    if(player==1)
                    {
                        b6.setText("O");
                        player = 2;
                    }
                    else {
                        b6.setText("X");
                        player = 1;
                    }
                    checkresult();
                }

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b7.getText().length() == 0)
                {
                    if(player==1)
                    {
                        b7.setText("O");
                        player = 2;
                    }
                    else {
                        b7.setText("X");
                        player = 1;
                    }
                    checkresult();
                }

            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b8.getText().length() == 0)
                {
                    if(player==1)
                    {
                        b8.setText("O");
                        player = 2;
                    }
                    else {
                        b8.setText("X");
                        player = 1;
                    }
                    checkresult();
                }

            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b9.getText().length() == 0)
                {
                    if(player==1)
                    {
                        b9.setText("O");
                        player = 2;
                    }
                    else {
                        b9.setText("X");
                        player = 1;
                    }
                    checkresult();
                }

            }
        });

    }

    private void checkresult() {
        if(b1.getText().length() != 0 && b2.getText().length() != 0 && b3.getText().length() != 0)
        {
            if(b1.getText()=="O" && b2.getText()=="O" && b3.getText()=="O")
            {
                Toast.makeText(MainActivity.this, "Player 1 Wins", Toast.LENGTH_SHORT).show();
                player1_score = player1_score + 1;
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                b1.setTextColor(getResources().getColor(R.color.win1));
                b2.setTextColor(getResources().getColor(R.color.win1));
                b3.setTextColor(getResources().getColor(R.color.win1));
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resetbutt();
                    }
                }, 1000);
            }
            if(b1.getText()=="X" && b2.getText()=="X" && b3.getText()=="X")
            {
                Toast.makeText(MainActivity.this, "Player 2 Wins", Toast.LENGTH_SHORT).show();
                player2_score = player2_score + 1;
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                b1.setTextColor(getResources().getColor(R.color.win1));
                b2.setTextColor(getResources().getColor(R.color.win1));
                b3.setTextColor(getResources().getColor(R.color.win1));
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resetbutt();
                    }
                }, 1000);
            }
        }

        if(b4.getText().length() != 0 && b5.getText().length() != 0 && b6.getText().length() != 0)
        {
            if(b4.getText()=="O" && b5.getText()=="O" && b6.getText()=="O")
            {
                Toast.makeText(MainActivity.this, "Player 1 Wins", Toast.LENGTH_SHORT).show();
                player1_score = player1_score + 1;
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                b4.setTextColor(getResources().getColor(R.color.win1));
                b5.setTextColor(getResources().getColor(R.color.win1));
                b6.setTextColor(getResources().getColor(R.color.win1));
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resetbutt();
                    }
                }, 1000);
            }
            if(b4.getText()=="X" && b5.getText()=="X" && b6.getText()=="X")
            {
                Toast.makeText(MainActivity.this, "Player 2 Wins", Toast.LENGTH_SHORT).show();
                player2_score = player2_score + 1;
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                b4.setTextColor(getResources().getColor(R.color.win1));
                b5.setTextColor(getResources().getColor(R.color.win1));
                b6.setTextColor(getResources().getColor(R.color.win1));
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resetbutt();
                    }
                }, 1000);
            }
        }

        if(b7.getText().length() != 0 && b8.getText().length() != 0 && b9.getText().length() != 0)
        {
            if(b7.getText()=="O" && b8.getText()=="O" && b9.getText()=="O")
            {
                Toast.makeText(MainActivity.this, "Player 1 Wins", Toast.LENGTH_SHORT).show();
                player1_score = player1_score + 1;
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                b7.setTextColor(getResources().getColor(R.color.win1));
                b8.setTextColor(getResources().getColor(R.color.win1));
                b9.setTextColor(getResources().getColor(R.color.win1));
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resetbutt();
                    }
                }, 1000);
            }
            if(b7.getText()=="X" && b8.getText()=="X" && b9.getText()=="X")
            {
                Toast.makeText(MainActivity.this, "Player 2 Wins", Toast.LENGTH_SHORT).show();
                player2_score = player2_score + 1;
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                b7.setTextColor(getResources().getColor(R.color.win1));
                b8.setTextColor(getResources().getColor(R.color.win1));
                b9.setTextColor(getResources().getColor(R.color.win1));
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resetbutt();
                    }
                }, 1000);
            }
        }

        if(b1.getText().length() != 0 && b4.getText().length() != 0 && b7.getText().length() != 0)
        {
            if(b1.getText()=="O" && b4.getText()=="O" && b7.getText()=="O")
            {
                Toast.makeText(MainActivity.this, "Player 1 Wins", Toast.LENGTH_SHORT).show();
                player1_score = player1_score + 1;
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                b1.setTextColor(getResources().getColor(R.color.win1));
                b4.setTextColor(getResources().getColor(R.color.win1));
                b7.setTextColor(getResources().getColor(R.color.win1));
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resetbutt();
                    }
                }, 1000);
            }
            if(b1.getText()=="X" && b4.getText()=="X" && b7.getText()=="X")
            {
                Toast.makeText(MainActivity.this, "Player 2 Wins", Toast.LENGTH_SHORT).show();
                player2_score = player2_score + 1;
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                b1.setTextColor(getResources().getColor(R.color.win1));
                b4.setTextColor(getResources().getColor(R.color.win1));
                b7.setTextColor(getResources().getColor(R.color.win1));
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resetbutt();
                    }
                }, 1000);
            }
        }

        if(b2.getText().length() != 0 && b5.getText().length() != 0 && b8.getText().length() != 0)
        {
            if(b2.getText()=="O" && b5.getText()=="O" && b8.getText()=="O")
            {
                Toast.makeText(MainActivity.this, "Player 1 Wins", Toast.LENGTH_SHORT).show();
                player1_score = player1_score + 1;
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                b2.setTextColor(getResources().getColor(R.color.win1));
                b5.setTextColor(getResources().getColor(R.color.win1));
                b8.setTextColor(getResources().getColor(R.color.win1));
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resetbutt();
                    }
                }, 1000);
            }
            if(b2.getText()=="X" && b5.getText()=="X" && b8.getText()=="X")
            {
                Toast.makeText(MainActivity.this, "Player 2 Wins", Toast.LENGTH_SHORT).show();
                player2_score = player2_score + 1;
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                b2.setTextColor(getResources().getColor(R.color.win1));
                b5.setTextColor(getResources().getColor(R.color.win1));
                b8.setTextColor(getResources().getColor(R.color.win1));
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resetbutt();
                    }
                }, 1000);
            }
        }

        if(b3.getText().length() != 0 && b6.getText().length() != 0 && b9.getText().length() != 0)
        {
            if(b3.getText()=="O" && b6.getText()=="O" && b9.getText()=="O")
            {
                Toast.makeText(MainActivity.this, "Player 1 Wins", Toast.LENGTH_SHORT).show();
                player1_score = player1_score + 1;
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                b3.setTextColor(getResources().getColor(R.color.win1));
                b6.setTextColor(getResources().getColor(R.color.win1));
                b9.setTextColor(getResources().getColor(R.color.win1));
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resetbutt();
                    }
                }, 1000);
            }
            if(b3.getText()=="X" && b6.getText()=="X" && b9.getText()=="X")
            {
                Toast.makeText(MainActivity.this, "Player 2 Wins", Toast.LENGTH_SHORT).show();
                player2_score = player2_score + 1;
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                b3.setTextColor(getResources().getColor(R.color.win1));
                b6.setTextColor(getResources().getColor(R.color.win1));
                b9.setTextColor(getResources().getColor(R.color.win1));
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resetbutt();
                    }
                }, 1000);
            }
        }

        if(b1.getText().length() != 0 && b5.getText().length() != 0 && b9.getText().length() != 0)
        {
            if(b1.getText()=="O" && b5.getText()=="O" && b9.getText()=="O")
            {
                Toast.makeText(MainActivity.this, "Player 1 Wins", Toast.LENGTH_SHORT).show();
                player1_score = player1_score + 1;
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                b1.setTextColor(getResources().getColor(R.color.win1));
                b5.setTextColor(getResources().getColor(R.color.win1));
                b9.setTextColor(getResources().getColor(R.color.win1));
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resetbutt();
                    }
                }, 1000);
            }
            if(b1.getText()=="X" && b5.getText()=="X" && b9.getText()=="X")
            {
                Toast.makeText(MainActivity.this, "Player 2 Wins", Toast.LENGTH_SHORT).show();
                player2_score = player2_score + 1;
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                b1.setTextColor(getResources().getColor(R.color.win1));
                b5.setTextColor(getResources().getColor(R.color.win1));
                b9.setTextColor(getResources().getColor(R.color.win1));
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resetbutt();
                    }
                }, 1000);
            }
        }

        if(b3.getText().length() != 0 && b5.getText().length() != 0 && b7.getText().length() != 0)
        {
            if(b3.getText()=="O" && b5.getText()=="O" && b7.getText()=="O")
            {
                Toast.makeText(MainActivity.this, "Player 1 Wins", Toast.LENGTH_SHORT).show();
                player1_score = player1_score + 1;
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                b3.setTextColor(getResources().getColor(R.color.win1));
                b5.setTextColor(getResources().getColor(R.color.win1));
                b7.setTextColor(getResources().getColor(R.color.win1));
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resetbutt();
                    }
                }, 1000);
            }
            if(b3.getText()=="X" && b5.getText()=="X" && b7.getText()=="X")
            {
                Toast.makeText(MainActivity.this, "Player 2 Wins", Toast.LENGTH_SHORT).show();
                player2_score = player2_score + 1;
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                b3.setTextColor(getResources().getColor(R.color.win1));
                b5.setTextColor(getResources().getColor(R.color.win1));
                b7.setTextColor(getResources().getColor(R.color.win1));
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resetbutt();
                    }
                }, 1000);
            }
        }

        if(b1.getText().length() != 0 && b2.getText().length() != 0 && b3.getText().length() != 0 && b4.getText().length() != 0 && b5.getText().length() != 0 && b6.getText().length() != 0 && b7.getText().length() != 0 && b8.getText().length() != 0 && b9.getText().length() != 0)
        {
            Toast.makeText(MainActivity.this, "Match Draw", Toast.LENGTH_SHORT).show();
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            resetbutt();
        }
    }

    private void resetbutt() {
        b1.setText(null);
        b2.setText(null);
        b3.setText(null);
        b4.setText(null);
        b5.setText(null);
        b6.setText(null);
        b7.setText(null);
        b8.setText(null);
        b9.setText(null);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        total_play = total_play + 1;
        s1.setText(player1_score+"/"+total_play);
        s2.setText(player2_score+"/"+total_play);
        player = 1;
        b1.setTextColor(getResources().getColor(R.color.win2));
        b2.setTextColor(getResources().getColor(R.color.win2));
        b3.setTextColor(getResources().getColor(R.color.win2));
        b4.setTextColor(getResources().getColor(R.color.win2));
        b5.setTextColor(getResources().getColor(R.color.win2));
        b6.setTextColor(getResources().getColor(R.color.win2));
        b7.setTextColor(getResources().getColor(R.color.win2));
        b8.setTextColor(getResources().getColor(R.color.win2));
        b9.setTextColor(getResources().getColor(R.color.win2));
    }

}

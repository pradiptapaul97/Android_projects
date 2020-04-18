package com.example.abcd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button ba,bb,bc,bd,be,bf,bg,bh,bi,bj,bk,bl,bm,bn,bo,bp,bq,br,bs,bt,bu,bv,bw,bx,by,bz;
    TextView et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.textView);

        ba = findViewById(R.id.ba);
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("A FOR :- APPLE");
            }
        });

        bb = findViewById(R.id.bb);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("B FOR :- Ball");
            }
        });

        bc = findViewById(R.id.bc);
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("C FOR :- CAT");
            }
        });

        bd = findViewById(R.id.bd);
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("D FOR :- DOG");
            }
        });

        be = findViewById(R.id.be);
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("E FOR :- EGG");
            }
        });

        bf = findViewById(R.id.bf);
        bf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("F FOR :- FAN");
            }
        });

        bg = findViewById(R.id.bg);
        bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("G FOR :- GUN");
            }
        });

        bh = findViewById(R.id.bh);
        bh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("H FOR :- HEN");
            }
        });

        bi = findViewById(R.id.bi);
        bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("I FOR :- INK POT");
            }
        });

        bj = findViewById(R.id.bj);
        bj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("J FOR :- JUG");
            }
        });

        bk = findViewById(R.id.bk);
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("K FOR :- KING");
            }
        });

        bl = findViewById(R.id.bl);
        bl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("L FOR :- LION");
            }
        });

        bm = findViewById(R.id.bm);
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("M FOR :- MONKEY");
            }
        });

        bn = findViewById(R.id.bn);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("N FOR :- NEST");
            }
        });

        bo = findViewById(R.id.bo);
        bo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("O FOR :- OX");
            }
        });

        bp = findViewById(R.id.bp);
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("P FOR :- PARROT");
            }
        });

        bq = findViewById(R.id.bq);
        bq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("Q FOR :- QUEEN");
            }
        });

        br = findViewById(R.id.br);
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("R FOR :- RABBIT");
            }
        });

        bs = findViewById(R.id.bs);
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("S FOR :- SONG");
            }
        });

        bt = findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("T FOR :- TRAIN");
            }
        });

        bu = findViewById(R.id.bu);
        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("U FOR :- UMBRELLA");
            }
        });

        bv = findViewById(R.id.bv);
        bv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("V FOR :- VASE");
            }
        });

        bw = findViewById(R.id.bw);
        bw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("W FOR :- WATCH");
            }
        });

        bx = findViewById(R.id.bx);
        bx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("X FOR :- X-MAS");
            }
        });

        by = findViewById(R.id.by);
        by.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("Y FOR :- YACHT");
            }
        });

        bz = findViewById(R.id.bz);
        bz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("Z FOR :- ZEBRA");
            }
        });

    }

}

package com.example.heinzraja.guitarchords;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().getDecorView().setBackgroundColor(0x3C3C46);

        Button btn1 = findViewById(R.id.chordC);
        Button btn2 = findViewById(R.id.chordD);
        Button btn3 = findViewById(R.id.chordE);
        Button btn4 = findViewById(R.id.chordA);
        Button btn5 = findViewById(R.id.legend);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
    }
    public void openLegend(){
        Intent intent = new Intent(this,ShowLegend.class);
        startActivity(intent);
    }
    public void openShowChordC(){
        Intent intent = new Intent(this,ShowChordC.class);
        startActivity(intent);
    }

    public void openShowChordD(){
        Intent intent = new Intent(this,ShowChordD.class);
        startActivity(intent);
    }

    public void openShowChordE(){
        Intent intent = new Intent(this,ShowChordE.class);
        startActivity(intent);
    }

    public void openShowChordA(){
        Intent intent = new Intent(this,ShowChordA.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.legend:
                openLegend();
                break;
            case R.id.chordC:
                openShowChordC();
                break;
            case R.id.chordD:
                openShowChordD();
                break;
            case R.id.chordE:
                openShowChordE();
                break;
            case R.id.chordA:
                openShowChordA();
                break;
        }
    }
}

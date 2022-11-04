package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int click_counter=0;
    TextView txt;
    Button click;


    public void init(){
        txt= (TextView) findViewById(R.id.txt);
        click= (Button) findViewById(R.id.btnclick);


    }

    public void btnclickcount_Click(View view){
        click_counter++;
        txt.setText("Click Count:"+click_counter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
}
package com.example.toby.lilysushi;

import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvCount;
    ImageButton btnDown;
    ImageButton btnUp;

    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){
        tvCount = (TextView) findViewById(R.id.textView1);
        btnDown = (ImageButton) findViewById(R.id.imageButton4);
        btnUp = (ImageButton) findViewById(R.id.imageButton6);

        btnDown.setOnClickListener(this);
        btnUp.setOnClickListener(this);
    }

    public void onClick(View view){
        switch(view.getId()){
            case R.id.imageButton6:
                counter++;
                if(counter == 100){
                    tvCount.setText("@string/surprise_message");
                }
                else
                    tvCount.setText(counter+"");
                break;
            case R.id.imageButton4:
                if(counter > 0 )
                    counter--;
                    tvCount.setText(counter+"");
                break;
        }

    }
}

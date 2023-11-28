package com.novitsky.p0061viewbuild;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //View myTextView = findViewById(R.id.myText);
        TextView myTextView1 = (TextView) findViewById(R.id.myText);
        myTextView1.setText("New text in TextView");

        Button myBtn = (Button) findViewById(R.id.myBtn);
        myBtn.setText("My button");
        myBtn.setEnabled(false);

        CheckBox myChb = (CheckBox) findViewById(R.id.myChb);
        myChb.setChecked(true);

    }
}
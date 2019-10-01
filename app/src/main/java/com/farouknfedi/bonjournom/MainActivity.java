package com.farouknfedi.bonjournom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    TextView txtv2;
    EditText txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 =findViewById(R.id.button);
        txtv2 = findViewById(R.id.textView2);
        txt = findViewById(R.id.editText);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtv2.setText(getResources().getString(R.string.message)+" "+txt.getText());
            }
        });

    }
}

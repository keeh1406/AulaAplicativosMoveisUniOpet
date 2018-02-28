package com.example.opet.aula2802;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private TextView textResultado;
    private EditText editNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = findViewById(R.id.editNome);
    }

    public void click(View v) {
        String data = editNome.getText().toString();
        Toast.makeText(this, data, Toast.LENGTH_LONG).show();
    }
}

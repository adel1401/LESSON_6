package com.example.lesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private TextView inter, welcome, registor;
    private EditText email, password;
    private Button btninter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inter = findViewById(R.id.txt_inter);
        welcome = findViewById(R.id.txt_welcome);
        registor = findViewById(R.id.txt_registor);
        email = findViewById(R.id.ed_email);
        password = findViewById(R.id.ed_password);
        btninter = findViewById(R.id.btn_inter);



        btninter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("admin") && password.getText().toString().
                        equals("admin")) {
                    inter.setVisibility(View.GONE);
                    registor.setVisibility(View.GONE);
                    email.setVisibility(View.GONE);
                    password.setVisibility(View.GONE);
                    btninter.setVisibility(View.GONE);

                } else {
                    Toast.makeText(MainActivity.this, "Пароль не правильный!!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
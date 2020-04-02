package com.example.exerciemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String user, pass;
    EditText edNama, edPass;
    Button bKirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNama = findViewById(R.id.editNama);
        edPass = findViewById(R.id.editPass);
        bKirim= findViewById(R.id.btnSign);

        bKirim.setOnClickListener (new View.OnClickListener() {
            @Override
            public  void onClick (View v) {
                //Membaca input dari editText
                user = edNama.getText().toString();
                pass = edPass.getText().toString();

                //Menampilkan popup
                if (user.equals("admin") && (pass.equals("123")))  {
                    Intent i = new Intent(getApplicationContext(), MenuBangunDatar.class);
                    Toast.makeText(MainActivity.this,
                            "Login Sukses", Toast.LENGTH_LONG).show();
                    startActivity(i);

                } else {
                    Toast.makeText(getApplicationContext(),
                            "Password Salah", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

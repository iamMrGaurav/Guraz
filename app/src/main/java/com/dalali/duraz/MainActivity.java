package com.dalali.duraz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText email,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.loginButton);
        email = findViewById(R.id.editTextEmail);
        password = findViewById(R.id.editTextPassword);
        navigate();

    }
    //this is for navigation
    public void navigate(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (userValidate){
                    Intent intent = new Intent(getApplicationContext(),HomePage.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(), "Incorrect Username/Password",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public boolean userValidate(){
        final String currentEmail  = email.getText().toString();
        final String currentPassword = password.getText().toString();
        boolean res = false;
        if (currentEmail.equals("Admin") && currentPassword.equals("Admin")){
                    res = true;
                }else{
                    res = false;
                }
        return res;
    }

}

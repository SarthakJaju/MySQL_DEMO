package com.example.lenovo.mysql_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText_username, editText_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText_username = (EditText)findViewById(R.id.etUserName);
        editText_password = (EditText)findViewById(R.id.etPassword);

    }

    public void onLogin(View view){
        String username = editText_username.getText().toString();
        String password = editText_password.getText().toString();
        String type = "login";
        BackGroundWorker backGroundWorker = new BackGroundWorker(this);
        backGroundWorker.execute(type , username , password);
        //execute can accept multiple arguments.. here we are passing three arguments
        //username , password and type of opreations we want to perform
    }
}

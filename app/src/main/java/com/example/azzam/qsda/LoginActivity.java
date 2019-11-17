package com.example.azzam.qsda;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void masukDaftar(View view) {
        Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
        startActivity(intent);
    }

    public void masukLogin(View view) {
        TextView tvUsername = findViewById(R.id.tv_usernameLogin);
        TextView tvPassword = findViewById(R.id.tv_passwordLogin);
        String username = tvUsername.getText().toString();
        String password = tvPassword.getText().toString();

        if (username.equals("admin") && password.equals("admin")){
            Intent intent = new Intent(LoginActivity.this,HomeAdminActivity.class);
            startActivity(intent);
        }
        else if (username.equals("hanif") && password.equals("hanif")){
            Intent intent = new Intent(LoginActivity.this, HomeSurveyorHanifActivity.class);
            startActivity(intent);
        }
        else if (username.equals("budi") && password.equals("budi")){
            Intent intent = new Intent(LoginActivity.this, HomeSurveyorBudiActivity.class);
            startActivity(intent);
        }
        else if (username.equals("tono") && password.equals("tono")){
            Intent intent = new Intent(LoginActivity.this, HomeSurveyorTonoActivity.class);
            startActivity(intent);
        }
        else{
            massageDialog();
            tvUsername.setText("");
            tvPassword.setText("");
        }
    }

    public void massageDialog(){
        final Dialog dialog = new Dialog(LoginActivity.this);
        dialog.setContentView(R.layout.dialog_massege_login);
        dialog.setTitle("Erorr!!");

        Button button = (Button) dialog.findViewById(R.id.btn_okeDialogmsg);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}

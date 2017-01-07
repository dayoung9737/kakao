package com.hanbit.kakao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hanbit.kakao.presentation.member.LoginActivity;
import com.hanbit.kakao.presentation.member.RegistMemberActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btRegist,btLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btRegist = (Button) findViewById(R.id.btRegist);
        btLogin = (Button) findViewById(R.id.btLogin);
        btRegist.setOnClickListener(this);
        btLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btRegist:
                Toast.makeText(MainActivity.this,"Click Join",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, RegistMemberActivity.class));
                break;
            case R.id.btLogin:
                Toast.makeText(MainActivity.this,"Click Login",Toast.LENGTH_LONG).show();
                this.startActivity(new Intent(MainActivity.this, LoginActivity.class));
                break;
        }
    }
}
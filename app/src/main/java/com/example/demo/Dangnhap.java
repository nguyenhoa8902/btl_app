package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Dangnhap extends AppCompatActivity  {
    //Khai bao soi tuong dieu khien
   private EditText edtuser, edtpass;
   private Button btnDangN, btnDangK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap) ;
        getView();
        //xu li nut dang ki
        btnDangK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Chuyen trang
                Intent intent = new Intent(Dangnhap.this, Dangki.class);
                startActivity(intent);
                Cleardate();
            }
        });
    }
    private void getView(){
        edtuser = findViewById(R.id.edtuser);
        edtpass = findViewById(R.id.edtpass);
        btnDangN =  findViewById(R.id.btnDangN);
        btnDangK =  findViewById(R.id.btnDangK);

        //xu li nut dang nhap
       // btnDangN.setOnClickListener(this::onClick);
        btnDangN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Dangnhap.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
    private void Cleardate(){
        edtuser.setText("");
        edtpass.setText("");
    }

   /* @Override
    public void onClick(View view) {
        //xu lí su kien
        switch (view.getId()){
            case R.id.btnDangN:
                String DangNhap = edtuser.getText().toString();
                //Hien thong bao cho ng dung
                Toast.makeText(this,"Đăng nhập"+DangNhap, Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
    }*/
}
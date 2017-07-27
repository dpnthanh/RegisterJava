package com.ftravel.fpt.registerjava;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtUsename, edtPass, edtCPass, edtname, edtmail, edttelephone;
    Button btnOK, btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kiemTrong(edtUsename);
                kiemTrong(edtPass);
                kiemTrong(edtCPass);
                kiemTrong(edtname);
                kiemTrong(edtmail);
                kiemTrong(edttelephone);
            }
        });

        clear();
    }

    private void clear() {
        edtUsename.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(edtUsename.getText().toString().equals(R.string.trong)){
                    edtUsename.setText("");
                }
            }
        });
    }

    private void Anhxa() {
        edtUsename = (EditText) findViewById(R.id.editTextUsername);
        edtPass = (EditText) findViewById(R.id.editTextPassword);
        edtCPass = (EditText) findViewById(R.id.editTextConfirmPassword);
        edtname = (EditText) findViewById(R.id.editTextFullname);
        edttelephone = (EditText) findViewById(R.id.editTextTelephone);
        edtmail = (EditText) findViewById(R.id.editTextEmail);
        btnOK = (Button) findViewById(R.id.ButtonOK);
        btnReset = (Button) findViewById(R.id.ButtonReset);
    }
    private boolean kiemTrong(EditText ten){
        if (ten.getText().toString().trim().equals("")){
            ten.setText(R.string.trong);
            return true;
        } else {
            return  false ;
        }
    }

}

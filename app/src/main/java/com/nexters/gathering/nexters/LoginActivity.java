package com.nexters.gathering.nexters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private InputMethodManager imm;     // 바탕화면 클릭 시, 키보드 없어지게 하기 위한 필드.\

    private EditText emailEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);

        emailEt = (EditText) findViewById(R.id.login_email_edit);
    }


    /*
        키보드 들어가게 하기 위해 Layout의 onClick 메소드로 설정
    */
    public void layoutOnClick(View v)
    {
        imm.hideSoftInputFromWindow(emailEt.getWindowToken(), 0);
    }

}

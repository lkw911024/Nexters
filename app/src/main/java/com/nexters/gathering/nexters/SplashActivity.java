package com.nexters.gathering.nexters;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler h = new Handler();
        h.postDelayed(new SplashHandler(), 5000);   // 5000 밀리 세컨드 후에 run() 실행
    }

    class SplashHandler implements Runnable{
        public void run()
        {
            startActivity(new Intent(getApplication(), LoginActivity.class));
            SplashActivity.this.finish();
        }
    }
}


// http://blog.naver.com/ggaddr/20123150420 참고

// http://blog.naver.com/rlgns8291/220797666197 apk 파일 생성 참고
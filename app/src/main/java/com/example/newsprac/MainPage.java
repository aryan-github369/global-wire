package com.example.newsprac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

      new Handler().postDelayed(new Runnable() {
          @Override
          public void run() {
              Intent intent = new Intent(MainPage.this, SignUpActivity.class);
              startActivity(intent);
          }
      }, 3000);
    }
}


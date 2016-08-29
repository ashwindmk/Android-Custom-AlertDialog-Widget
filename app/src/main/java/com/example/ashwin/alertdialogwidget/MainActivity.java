package com.example.ashwin.alertdialogwidget;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMainDialog(View view) {
        CustomAlertDialog.showDialog(this, "Main Dialog Title", "This is Main Activity Dialog Text");
    }

    public void nextActivity(View view) {
        Intent intent = new Intent(this, NextActivity.class);
        startActivity(intent);
        finish();
    }

}

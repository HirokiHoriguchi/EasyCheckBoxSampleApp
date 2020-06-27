package com.example.easychechboxsampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.mbms.MbmsErrors;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private CheckBox[] checkBox = new CheckBox[2];
    private String str[] = {"未チェックです", "チェック済み", "チェックされていない"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Initialize();
    }


    private void Initialize() {
        checkBox[0] = findViewById(R.id.checkbox_1);
        checkBox[0].setChecked(false);
        checkBox[0].setText(str[0]);
        checkBox[0].setOnClickListener(this);

        checkBox[1] = findViewById(R.id.checkbox_2);
        checkBox[1].setChecked(false);
        checkBox[1].setText(str[0]);
        checkBox[1].setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int view_id = v.getId();
        if (view_id == R.id.checkbox_1) {
            boolean check = checkBox[0].isChecked();
            if(check){
                checkBox[0].setText(str[1]);
            }
            else{
                checkBox[0].setText(str[2]);
            }
        }
        if (view_id == R.id.checkbox_2) {
            boolean check = checkBox[1].isChecked();
            if(check){
                checkBox[1].setText(str[1]);
            }
            else{
                checkBox[1].setText(str[2]);
            }
        }

    }
}

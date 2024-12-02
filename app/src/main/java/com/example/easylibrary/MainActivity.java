package com.example.easylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.easyutil.DisplayUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int windowsWidth = DisplayUtil.getWindowsWidth(this);
        int windowsHeight = DisplayUtil.getWindowsHeight(this);
        Toast.makeText(this, "Height：" + windowsHeight + "，Width：" + windowsWidth,
                Toast.LENGTH_SHORT).show();
    }
}
package com.example.tpsb;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tpsb.myprimg.PlateRecognizer;

public class MainActivity extends AppCompatActivity {

    /**
     * Hello World!
     */
    private TextView mTvInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }


    private void initView() {
        mTvInfo = (TextView) findViewById(R.id.tv_info);

        mTvInfo.setText( PlateRecognizer.stringFromJNI());

    }
}

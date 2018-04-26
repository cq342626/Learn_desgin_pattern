package com.example.leanring.eventbus;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.leanring.R;

import org.greenrobot.eventbus.EventBus;

/**
 * 作者：CQ on 2018/4/24 15:48
 * 作用：
 */
public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    public static void start(Context context) {
        Intent intent = new Intent(context, SecondActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initContentView();
    }

    private void initContentView() {
        findViewById(R.id.btn_second_post_event).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_second_post_event) {
            // 发布事件
            EventBus.getDefault().post(new MessageEvent("Hello EventBus!"));
        }
    }
}
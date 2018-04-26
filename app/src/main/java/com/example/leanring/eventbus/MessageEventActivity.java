package com.example.leanring.eventbus;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.leanring.R;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/**
 * 作者：CQ on 2018/4/24 15:40
 * 作用：
 */
public class MessageEventActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView mTextView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.text);
        mTextView.setOnClickListener(this);
        EventBus.getDefault().register(this);
    }

    @Override
    public void onClick(View view) {
        SecondActivity.start(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN, priority = 1)
    public void onMessageEvent1(MessageEvent event){
        mTextView.setText(event.getMessage());
        Log.e("---------", "onMessageEvent1");
    }

    @Subscribe(threadMode = ThreadMode.MAIN, priority = 2)
    public void onMessageEvent2(MessageEvent event){
        mTextView.setText(event.getMessage());
        Log.e("---------", "onMessageEvent2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}

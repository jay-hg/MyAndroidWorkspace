package com.fzu.messager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MessageReceiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_receive);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        TextView textView = (TextView)findViewById(R.id.message_receive);
        textView.setText(str);
    }
}

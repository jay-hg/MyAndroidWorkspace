package com.fzu.messager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MessageSendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_send);
    }

    public void onClickSendMessage(View view) {
        EditText message = (EditText) findViewById(R.id.message);
        String str = message.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,str);
        Intent chooseIntent = Intent.createChooser(intent,"This is my title.Please choose an app!");
        startActivity(chooseIntent);
    }
}

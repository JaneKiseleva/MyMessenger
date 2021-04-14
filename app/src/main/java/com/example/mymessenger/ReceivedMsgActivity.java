package com.example.mymessenger;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReceivedMsgActivity extends AppCompatActivity {
    private TextView textViewReceivedMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_msg);
        textViewReceivedMsg = findViewById(R.id.textViewReceivedMsg);
        Intent intent = getIntent(); //получили интент
        String msg = intent.getStringExtra("msg"); //метод вернет строчку, которую прислал MainActivity, сохранили значение в переменную
        textViewReceivedMsg.setText(msg);

    }
}
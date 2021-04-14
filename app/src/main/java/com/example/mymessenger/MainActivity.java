package com.example.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMsg =  findViewById(R.id.editTextMessage);
    }

    public void onClickSendMsg(View view) {
        String msg = editTextMsg.getText().toString(); //метод гет.текст возвращает объект, поэтому приcваиваем ему тип String с помощью метода toString
        Intent intent = new Intent(Intent.ACTION_SEND); //создаем неявный интент и указавем Андройду действие для передачи сообщений
        intent.setType("text/plain"); //указали тип интента - текст, простой
        intent.putExtra(Intent.EXTRA_TEXT, msg); //передаем Адройд само сообщение (ключ встроенный в Андройд, текст)
        Intent chosenIntent = Intent.createChooser(intent, getString(R.string.chooser_title)); //новый интент, позволяет выбирать куда передавать наш интент и какой конкретно заголовок у него будет
        startActivity(chosenIntent); //Запускаем интент




        /*Intent intent = new Intent(this,ReceivedMsgActivity.class); //создаем новый интент с аргемументами этой активности и нужной нам активности еще в виде класса
        intent.putExtra("msg",msg);// Вкладываем данные в виде пары: ключ (строка), оно же название (как в Яндексе) + значение в интент, Анроид проверяет на правильность
        startActivity(intent); // запускаем активность c интентом, в котором уже нахадятся все наши данные*/
    }
}
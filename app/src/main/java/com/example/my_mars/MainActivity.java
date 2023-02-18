package com.example.my_mars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // создание полей для вывода на экран нужных значений
    private EditText ticketNumberIn; // поле ввода массы груза в кг
    private Button button; // кнопка обработки информации
    private TextView ticketInfoOut; // поле вывода необходимого количества топлива в кг

    // создание поля для алгоритма
    private String ticketNumber = ""; // переменная для записи входного значения

    // создадим объект нашего алгоритма, чтобы мы могли получить доступ к его методам
    Mars algorithm = new Mars();

    // вывод на экран полученных значений
    @Override
    protected void onCreate(Bundle savedInstanceState) { // создание жизненного цикла активности
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // присваивание жизненному циклу активити представления activity_main

        // присваивание переменным активити элементов представления activity_main
        ticketNumberIn = findViewById(R.id.ticketNumberIn); // поле ввода
        button = findViewById(R.id.button); // кнопка обработки
        ticketInfoOut = findViewById(R.id.ticketInfoOut); // поле вывода

        // выполнение действий при нажании кнопки
        button.setOnClickListener(listener); // обработка нажатия кнопки
    }

    // объект обработки нажатия кнопки
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // считывание введённого значения
            ticketNumber = ticketNumberIn.getText().toString();
            ticketInfoOut.setText("Масса необходимого количества топлива " + algorithm.calculator(ticketNumber)+ " кг");
        }
    };
}
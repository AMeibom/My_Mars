package com.example.my_mars;

public class Mars {

       private static final float g_earth = 9.80665f;

        // Ускорение свободного падения Марса
        private static final float g_mars = 3.721f;

        // Количество топлива для выво  да 1 кг на орбиту Марса
        private static final float formula = g_mars * 100 / g_earth;

           public float calculator(String input) {
                // проверка корректности вводимого значения (с помощью метода contains(",") мы можем проверить есть ли в строке символ ",")
                if (input.contains(",")) { // если в вводимой строке есть запятая, то

                    String inputMod = input.replace(",", "."); // то с помощью метода replace() мы поменяем её на точку

                    // конвертирование входного значения из String в float с помощью метода Float.parseFloat()
                    float inputFloat = Float.parseFloat(inputMod);

                    // возврат вычисленного значения
                    return (long) inputFloat * formula;

                } else {
                    // конвертирование входного значения из String в float с помощью метода Long.parseLong()
                    float inputFloat = Float.parseFloat(input);

                    // возврат вычисленного значения
                    return (long) inputFloat * formula;
        }
    }

}



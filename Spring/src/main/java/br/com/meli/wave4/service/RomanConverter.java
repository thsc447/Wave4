package br.com.meli.wave4.service;

public class RomanConverter {

    public static String Convert(int number) {
        int[] numbers =
                {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans =
                {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String response = "";
        for (int i = 0; i < numbers.length; i++) {
            while (number >= numbers[i]) {
                number -= numbers[i];
                response += romans[i];
            }
        }
        return response;
    }
}


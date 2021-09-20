package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        int l = 0;
        int k = 0;
        ArrayList<Integer> var = new ArrayList<>();
        Conventer conventer = new Conventer();
        String[] sr = new String[3];
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пример, состоящий из оператора (+, -, /, *) и двух чисел в диапозоне от 1 до 10 в римской или арабской системе счисления: ");
        String s = in.nextLine(); // ручной ввод
        String[] d = s.split(" ");
        for (String f : d) {
            if (l > 2) {
                System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                System.exit(k);
            }
            l++;
            sr[i] = f;
            i++;
        }
        for (i = 0; i < 3; i++) {
            if (sr[i] == null) {
                System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                System.exit(k);
            }
        }
        conventer.stringToInt(sr[0], sr[2], var);
        for (i = 0; i < 2; i++) {
            if (var.get(i) < 1 | var.get(i) > 10) {
                System.out.println("throws Exception //т.к. диапозон работы от 1 до 10");
                System.exit(k);
            }
        }
        Calculator calculator = new Calculator(var.get(0), var.get(1), sr[1]);
        i = calculator.calculation();
        if (conventer.x == 1){
            if (i < 1){
                System.out.println("throws Exception //т.к. в римской системе нет чисел меньше еденицы");
                System.exit(k);
            }
            String m = conventer.arToRoman(i);
            System.out.println("Результат " + m);
        }
        else {
            System.out.println("Результат " + i);
        }
        in.close();
    }
}

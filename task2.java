/*
1) Вычислитьn! (произведение чисел от 1 до n)
1*2*3
*/

import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = iScanner.nextInt();
        iScanner.close();

        int mult = 1;
        for (int i = 1; i <= x; i++) {
            mult *= i;
        }
        System.out.println("Произведение чисел " + mult); 
    }}
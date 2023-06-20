/*
1) Вычислить n-ое треугольного число (сумма чисел от 1 до n)
1 + 2 + 3
*/

import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = iScanner.nextInt();
        iScanner.close();

        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += i;
           
        }
        System.out.println("Сумма равна " + sum); 

    
        }
    }

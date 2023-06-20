/* 3) Реализовать простой калькулятор (+-/*)
sc.next() - считывает 1 элемент
sc.nextInt() - считывает только число
sc.nextLine() - считывает строчку
Введите число: 4 \n
Введите знак:
 */

import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        int num_1;
        int num_2;
        int res;
        String a;
        char op;
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        num_1 = iScanner.nextInt();
        System.out.println("Введите знак: ");
        a = iScanner.next();
        op = a.charAt(0);
        System.out.println("Введите второе число: ");
        num_2 = iScanner.nextInt();
        iScanner.close();
        
        if (op == '+'){
            res = num_1 + num_2;
            System.out.println(res);
        }

        else if (op == '-'){
            res = num_1 - num_2;
            System.out.println(res);
        }

        else if (op == '/'){
            res = num_1 / num_2;
            System.out.println(res);
        }

        else if (op == '*'){
            res = num_1 * num_2;
            System.out.println(res);
        }

        else {
            System.out.println("Введен неверный знак");
        }
    }
    
}

/*
 Вывести все простые числа от 1 до 1000
 */

import java.util.Scanner;
public class task3{
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число, до которого вывести простые числа: ");
        int x = iScanner.nextInt();
        iScanner.close();  
        for (int i = 1; i<= x; i++){
            if(checkNum(i))
                System.out.println(i);
        }
    }
            
    public static boolean checkNum(int i){
        if (i<=1)
            return false;
        else if (i <=3)
            return true;
        else if (i%2==0 || i %3 ==0)
            return false;
        int n = 5;
        while (n*n <=i){
            if (i % n ==0 || i % (n+2) == 0)
                return false;
            n=n+6;
        }
        return true;
}
}





package Second_ConditionalStatement;

import java.util.Scanner;
public class Main2753 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year%100 != 0 || year%400 == 0){
            if(year%4 == 0){
                System.out.println("1");
                return;
            }
        }
        System.out.println("0");
    }
}
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year%100 != 0 || year%400 == 0){
            if(year%4 == 0){
                System.out.println("1");
                return;
            }
        }
        System.out.println("0");
    }
}

 */
package Second_ConditionalStatement;

import java.util.Scanner;
public class Main2480 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
        if(a[0] == a[1] && a[1] == a[2]) System.out.println(10000 + a[0] * 1000);

        else if(a[0] == a[1]) System.out.println(1000 + a[0]*100);
        else if(a[1] == a[2]) System.out.println(1000 + a[1]*100);
        else if(a[0] == a[2]) System.out.println(1000 + a[0]*100);

        else {
            int max = a[0];
            if(a[1] > max) max = a[1];
            if(a[2] > max) max = a[2];
            System.out.println(max*100);
        }
    }
}
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
        if(a[0] == a[1] && a[1] == a[2]) System.out.println(10000 + a[0] * 1000);

        else if(a[0] == a[1]) System.out.println(1000 + a[0]*100);
        else if(a[1] == a[2]) System.out.println(1000 + a[1]*100);
        else if(a[0] == a[2]) System.out.println(1000 + a[0]*100);

        else {
            int max = a[0];
            if(a[1] > max) max = a[1];
            if(a[2] > max) max = a[2];
            System.out.println(max*100);
        }
    }
}
 */
package Second_ConditionalStatement;

import java.util.Scanner;
public class Main2525 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int mm = sc.nextInt();
        int totalM = h*60 + m + mm;
        if(totalM > 23*60 + 59){
            totalM = totalM - 24*60;
        }
        h = totalM/60;
        m = totalM%60;
        System.out.println(h+" "+m);
    }
}
/*
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int mm = sc.nextInt();
        int totalM = h*60 + m + mm;
        if(totalM > 23*60 + 59){
            totalM = totalM - 24*60;
        }
        h = totalM/60;
        m = totalM%60;
        System.out.println(h+" "+m);
    }
}

 */

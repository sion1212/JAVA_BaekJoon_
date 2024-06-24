package Second_ConditionalStatement;

import java.util.Scanner;
public class Main2884 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int hm = H*60 + M;

        int alam = hm - 45;
        if(alam >= 0){
            H = alam/60;
            M = alam%60;
            System.out.println(H+" "+M);
        }
        else {
            alam += 1440;
            H = alam/60;
            M = alam%60;
            System.out.println(H+" "+M);
        }
    }
}
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int hm = H*60 + M;

        int alam = hm - 45;
        if(alam >= 0){
            H = alam/60;
            M = alam%60;
            System.out.println(H+" "+M);
        }
        else {
            alam += 1440;
            H = alam/60;
            M = alam%60;
            System.out.println(H+" "+M);
        }
    }
}

 */
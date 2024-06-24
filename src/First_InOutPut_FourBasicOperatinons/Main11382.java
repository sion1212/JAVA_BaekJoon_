package First_InOutPut_FourBasicOperatinons;

import java.io.*;
import java.util.*;

public class Main11382 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] p = new int[3];

        try {
            st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for(int i=0 ; i<3 ; i++){
            p[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for(int i=0 ; i<3 ; i++){
            sum += p[i];
        }
        System.out.println(sum);
    }
}
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        System.out.println(a+b+c);
    }
}
 */
package amaya.task1;

import java.util.Scanner;

public class Geron {

    static void sqrt(long s) {
        double b=s;
        int i=0;
        while ((b*b>s)&&(i<200)){
            b=(b+s/b)/2;
            i++;
        }
        System.out.println(b);
    }
//    public static void main (String[] args){
//        Scanner scanner = new Scanner(System.in);
//        long s = scanner.nextLong();
//        sqrt(s);
//    }
}

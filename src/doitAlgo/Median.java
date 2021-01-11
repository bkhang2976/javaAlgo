package doitAlgo;

import java.util.*;

public class Median {

    static int med3(int a, int b, int c){
        if(a>=b){
            if(b>=c){
                return b;
            }else if(a<=c){
                return a; 
            }else{
                return c;
            }
        }else if(a >c){
            return a;
        }else if (b>c){
            return c;
        }else{
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Finding the median value between 3 integers");
        
        System.out.println("Input a's value");
        int a = input.nextInt();

        System.out.println("Input b's value");
        int b = input.nextInt();

        System.out.println("Input c's value");
        int c = input.nextInt();

        System.out.println("The median is ="+ med3(a, b, c));

    }
}

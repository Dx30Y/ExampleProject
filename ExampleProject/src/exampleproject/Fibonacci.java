
package exampleproject;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        int output = AmbilFibonacci(index);
        System.out.println("Output : "+output);
    }
    
    public static int AmbilFibonacci(int a){
        if(a == 0 || a == 1){
            return a;
        } else {
            return AmbilFibonacci(a-1) + AmbilFibonacci(a-2);
        }
    }
}

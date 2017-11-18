package Lesson2;

public class Fibonacci {
    public static void main(String args[]) {
        printFibonacciNumbers(1);
    }

    static void printFibonacciNumbers(int n){
        int f0 = 0;
        int f1 = 1;
        int fn = 0;
        int count = 2;

        switch (n){
            case 0 :{
                break;
            }
            case 1 :{
                System.out.println(f0);
                break;
            }
            case 2 :{
                System.out.println(f0 + ", " + f1);
                break;
            }
            default : {
                System.out.print(f0 + ", " + f1);
                do{
                    fn = f0 + f1;
                    f0 = f1;
                    f1 = fn;
                    System.out.print(", " + fn);
                    count ++;
                }
                while (count < n);
                break;
            }
        }
    }

}

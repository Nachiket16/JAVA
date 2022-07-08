import java.util.Scanner;

class wrapper{

    public static void main(String[] args) {
        
        //use 1: Parse the string 
        // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner("123");
        int num1 = Integer.parseInt(sc.next());// String as an input
        System.out.println(num1);

        //Narrowing - Explicit Type-casting is necessary
        double i = 10.543145454531;
        System.out.println(i);
        float j = (float) i;
        System.out.println(j);
        int k = (int) j;
        System.out.println(k);
    }
}
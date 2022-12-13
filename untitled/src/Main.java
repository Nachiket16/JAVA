public class Main {
    public static void main(String[] args) {

        int n = 454;
        int temp = n;
        //400 + 50 + 5 = 454
        //n= 454 / 10 = 4 (454%10 = 4)
        //n= 45
        //4
        //0
        // no == rev -> palindrom
        int r =0; int sum = 0;
        double s=0;
        System.out.println("Before WHILE LOOP:  N="+n +" r="+r+ " sum="+sum);
        while(n>0){
            r=n%10; //
            sum = (sum*10)+r; //40+5->45 | 45*10=450+4 -> 454
            n=n/10;
            System.out.println("N="+n +" r="+r+ " sum="+sum);
        }

        System.out.println(sum==temp?"It Is Palindrom":"NOt a Palindrom");

    }
}
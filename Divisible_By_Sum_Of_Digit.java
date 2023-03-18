import java.util.*;


public class Divisible_By_Sum_Of_Digit {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        double result =0 ;
        int originalnumber = n;
        while(originalnumber>0){
            int m = originalnumber%10;
            result = result+m;
            originalnumber/= 10;
        }
        if(n%result==0){
            System.out.println( n + " is Divisible by sum of its digit");
        }
        else{
            System.out.println( n + " is not Divisible by sum of its digit");
        }



    }
}
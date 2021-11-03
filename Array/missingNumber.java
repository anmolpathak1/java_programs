import java.util.*;
import java.io.*;

public class missingNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = missing_number(n);
        System.out.println("missing number is " + result);
        sc.close();
    }

    public static int missing_number(int n){
        int finalSum = 1;
        int inp;
        FileReader fr = new FileReader("testcases.txt");
        Scanner sc = new Scanner(fr);
                               
        for(int i=2;i<=n;i++){
            inp = sc.nextInt(fr);
            finalSum -= inp;
            finalSum += i;
        }
        sc.close();
        return finalSum;
    }
}

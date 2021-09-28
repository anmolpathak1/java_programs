// this program find out the number of triplets such that
// a,ar,ar^2 and i<j<k  where i ,j,k are index of a,ar,ar^2

import java.util.*;
import java.io.*;


public class countTripletsGp {

    public static void main(String args[]) throws IOException{
       // FileReader fr = new FileReader("testcases.txt");
       // Scanner sc = new Scanner(fr);
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int r = sc.nextInt();
        long arr[] = new long[size];

        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();

        System.out.println(ctgp(arr,r));

        sc.close();
        
    }

    static long ctgp(long arr[],int r){
        long count=0;
        HashMap<Long,Long> left = new HashMap<Long,Long>(arr.length);
        HashMap<Long,Long> right = new HashMap<Long,Long>(arr.length);


        for(int i=0;i<arr.length;i++)
            right.put(arr[i],right.getOrDefault(arr[i],0l) + 1);

        for(int i=0;i<arr.length;i++){
            right.put(arr[i], right.getOrDefault(arr[i],0l) - 1);
            if(arr[i] % r == 0){
                count += left.getOrDefault(arr[i]/r,0l) * right.getOrDefault(arr[i] * r,0l);
            }
            left.put(arr[i],left.getOrDefault(arr[i],0l) +1);
        }
        return count;
    }    
}

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class kadanane {
    public static void main(String args[]) throws IOException{
        FileReader fr = new FileReader("testcases.txt");
        Scanner sc = new Scanner(fr);
        int size = sc.nextInt();
        int a[] = new int[size];
        int max_num =0;

        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
            max_num = Math.max(max_num, a[i]);
        }

        contiguousSum(a, max_num);
        sc.close();
    }

    static void contiguousSum(int a[],int max_num){
        int sum ,idxi=0,idxj=0;

        for(int i=0;i<a.length;i++){
            sum = 0;
            for(int j=i;j<a.length;j++){
                sum += a[j];

                if(sum > max_num){
                    max_num = sum;
                    idxi = i;
                    idxj=j;
                }
            }
        }
        System.out.println("max sum is  : " + max_num);
        System.out.println("index is i : " + idxi + " index j :" + idxj);
    } 
    
}

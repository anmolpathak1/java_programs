//this program will calculate the maximum continious subarray sum . 

import java.util.*;

class Kadanane {
    public static void main(String argrs[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[] = new int[size];
        int temp[] = new int[size];
        int maxval ;

         
         //taking input
        for(int i=0;i<size;i++)
            nums[i] = sc.nextInt();

        maxval = nums[0];
        
        //algo starts from here
        if(size == 1){
            System.out.println("maximum value is " + nums[0]);
        }else{
            temp[0] = nums[0];

            for(int i=1;i<nums.length;i++){
                temp[i] = Math.max(nums[i-1],nums[i] + temp[i-1]);
                maxval = Math.max(temp[i],temp[i-1]);
            
            }         
            System.out.println("maximum subarray sum is " + maxval);
        }
        sc.close();
    }
}
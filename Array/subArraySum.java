//this program will find out a subarray whose sum equals to given sum. Not suited for negative numbers

class subArraySum{
    public static void main(String args[]){
        int arr[] = {1,2,1,7,5};
        int req_sum = 13;
        findSubArray(arr,req_sum);   
 }

 static int findSubArray(int a[],int req_sum){
     int i=0,j=0;
     int curr_sum = 0;

     while(i < a.length){
         curr_sum +=a[i++];

         while(curr_sum > req_sum && j < i){
             curr_sum -=a[j++];
         }

         if(curr_sum == req_sum){
            System.out.println("subarray start=" + j + " ends = " + (i-1));
            return 1;
        }
     }
     return 1;
 }
}
//Given an unsorted array A of size N that contains only
//non-negative integers, find a continuous sub-array which
//adds to a given number S.

class subArraySum{
    public static void main(String args[]){
        int arr[] = {1,2,1,7,5};
        int req_sum = 13;
        findSubArray(arr,req_sum);   
 }

 static int BruteForce(int a[],int req_sum){
      int sum = 0;

      for(int i=0;i<a.length;i++){
          sum = 0;
          for(int j=i;j<a.length;j++){
              sum += a[j];
              if(sum == req_sum)
                return sum;
          }
      }
      return -1;
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
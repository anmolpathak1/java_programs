public class countTripletsGp {
    public static void main(String[] args){
        int arr[] = {1,5,5,25,125};
        int r = 5;
        int ans = countTriplets(arr, r);
        System.out.println("no of triplets : " + ans);

    }

    static int countTriplets(int []arr,int r){
        int count = 0;
        int i,j;
        int a;

        for(i=0;i<arr.length-2;i++){
            a = arr[i];
            for(j=i+1;j<arr.length-1;j++){
                if(a * r == arr[j])
                    break;
            }

            for(int k=j+1;k<arr.length;k++){
                if(a * r * r == arr[k])
                    count++;
            }
        }
        return count;
    }
}

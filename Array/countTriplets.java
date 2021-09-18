class countTriplets{
    public static void main(String[] args) {
        int arr[] = {2,3,5,7,8};
        int ans=0;
        ans = count_triplets(arr);
        System.out.println(ans);
    }

    static int count_triplets(int[] arr){
        int ans = 0;
        int max_val=0;
        for(int i=0;i<arr.length;i++)
            max_val = Math.max(max_val,arr[i]);
        int[] freq = new int[max_val + 1];

        for(int i=0;i<arr.length;i++)
            freq[arr[i]]++;

        //case 1 : 0,0,0
        ans += (freq[0]* (freq[0]-1) * (freq[0]-2))/6;
        
        //case 2 : 0,x,x
        for(int i=1;i<=max_val;i++)
            ans += (freq[0] * freq[i] * (freq[i]-1))/2;

        //case 3 : x,x,2*x
        for(int i=1;2*i<=max_val;i++)
            ans += (freq[i] * (freq[i]-1) * freq[2*i])/2;


        //case 4 : x,y,x+y
        for(int i=1;i<=max_val;i++){
            for(int j=i+1;i+j <= max_val;j++){
                ans += freq[i] * freq[j] * freq[i+j];
            }
        }

        return ans;

    }

}
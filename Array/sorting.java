import java.util.Scanner;

public class sorting {
    
    public int[] insertionSort(int[] arg){

        for(int i=1;i<arg.length;i++){
            int j =  i;

            while(j > 0 && arg[j-1] > arg[j]){
                int temp = arg[j-1];
                arg[j-1] = arg[j];
                arg[j] = temp;
                j--;
            }
        }
        return arg;
    }
}


class sortingDemo{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arg = new int[size];

        for(int i=0;i< size ;i++)
            arg[i] = sc.nextInt();


        sorting st = new sorting();
        int[] result = st.insertionSort(arg);

        System.out.println("<-----output------>");

        for(int val : result)
            System.out.println(val);
            
        sc.close();
    }
}
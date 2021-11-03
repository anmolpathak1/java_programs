//this program will generate number from 1 to n with one number missing


import java.io.PrintWriter;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;

public class generate1ton {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(System.in);

        File f = new File("testcases.txt");

        PrintWriter pw =new PrintWriter(f);

        int n=sc.nextInt();
        Random rand = new Random();

        int ran_num = rand.nextInt(n);
        
        for(int i=1;i<=n;i++){
            if(i != ran_num)
                pw.write(i + "\n");
        }

        pw.close();
        sc.close();
    }
    
}

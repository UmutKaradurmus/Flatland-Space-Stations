import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the flatlandSpaceStations function below.
    static int flatlandSpaceStations(int n, int[] c) {
   /* n=şehir sayısı c= istasyon olan şehirler*/
   int min=Math.abs(0-c[0]);
   int[] max=new int[n];
   for (int i=0; i<n; i++){
       min=Math.abs(i-c[0]);
       for(int j=1; j<c.length; j++){
           if(Math.abs(i-c[j])<min){
               min=Math.abs(i-c[j]);
           }
       }max[i]=min;
        
   }int s=max[0];
   for (int i=0; i<max.length; i++){
       if(s<max[i]){
           s=max[i];
       }
   }return s;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] c = new int[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = flatlandSpaceStations(n, c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution {

   
    static int flatlandSpaceStations(int n, int[] c) {
   
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

    
}

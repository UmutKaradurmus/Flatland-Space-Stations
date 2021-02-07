/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huawe
 */
public class Ice_cream_parlor {
      static int[] icecreamParlor(int m, int[] arr) {
     int[] dizi= new int[2];
     for (int i =0; i<arr.length; i++){
         for (int j=0; j<arr.length; j++){
             if (i==j) {
                 
             }else if(arr[i]+arr[j]==m){
                
                 dizi[0]=i+1;
                 dizi[1]=j+1;
                 return dizi;
             }
             
         }
     }
    return dizi;}
}

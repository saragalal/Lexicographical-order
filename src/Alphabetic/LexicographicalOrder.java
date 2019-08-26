/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alphabetic;

import java.util.Arrays;

/**
 *
 * @author sara
 */
public class LexicographicalOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         String str = "dkhc";
         String op ;
        op = biggerIsGreater(str);
       System.out.println(op);
       
    }
  private static String biggerIsGreater(String w) {
      if (w.matches("-?\\d+(\\.\\d+)?") == false){
        int len = w.length();
 int comp ;
for (int i =len-1 ; i >= 0 ; i--){
    for (int m = len-1 ; m > i ; m-- ){
           
        comp = Character.compare(w.charAt(m), w.charAt(i));
       if (comp > 0){
          w = swapStr(w , i, m);
        

    System.out.println(w);    
  char tempArr[] = w.toCharArray();
  Arrays.sort(tempArr, i+1, len);
  System.out.println(tempArr);
 return new String(tempArr);
      }
        }
}

 return "no answer" ;
        
      } else {
        return "no answer"; 
      }
   } 
   
   private static String swapStr(String s, int i0, int i1) {
  String s1 = s.substring(0, i0);
  String s2 = s.substring(i0+1, i1);
  String s3 = s.substring(i1+1);
  return s1+s.charAt(i1)+s2+s.charAt(i0)+s3;
}
   

}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Solution {
      public char nextGreatestLetter(char[] letters, char target) {
       
          
          int lw,mid,hi;
          lw=0;
          hi=letters.length-1;
          char ans='\u0000';
          while(lw<=hi)
          {
              mid=(lw+hi)/2;
              if(letters[mid]<=target)
              {
                  lw=mid+1;
              }
              else
              {
                  ans= letters[mid];
                  hi=mid-1;
              }
              
          }
          if(ans=='\u0000')return letters[0];
          return ans;
    }
     public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         System.out.println("Enter ");
         String input=scanner.nextLine();
         char []charArray=input.toCharArray();
         System.out.println("Enter Char ");
         char ch=scanner.next().charAt(0);
         Solution s=new Solution();
         char ans=s.nextGreatestLetter(charArray,ch);
         System.out.println(ans);
    }
}

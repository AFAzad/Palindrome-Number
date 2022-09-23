/*  Problem Statement
Given a number N, you need to check whether the given number is Palindrome or not. A number is said to be Palindrome when it reads the same from backward as forward.  */


static boolean isPalindrome(int N)
{
       // your code here
       int temp=N;   
      int sum =0,r; 
     while(N>0){    
         r=N%10;  //getting remainder  
         sum=(sum*10)+r;    
         N=N/10;    
   }    
      if(temp== sum ){
         return true;

      }else{
         return false;
             }
}
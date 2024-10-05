// Factorial.java
// Recursive factorial method
package package1;

public class Factorial {
   
   // Recursive definition of method factorial
   public static int factorial( int n )
   {      
      if ( n == 1 || n == 0 )  // base case
         return 1;
      else {
         int result = n * factorial(n-1); 
         return result;
      }
   }
}


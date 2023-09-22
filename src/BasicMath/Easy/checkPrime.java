public class checkPrime {
  public static void main(String[] args) {
      System.out.println(isPrimeNumber(5));
  }

  public static boolean isPrimeNumber(int n)
  {
    // naive approach  TC- o(n)
  //   int count = 0;
  //   for(int i=1; i <= n; i++)
  //   {
  //       if(n%i == 0)
  //       {
  //         count++; // counting factors of n
  //       }
  //   }

  //   if(count == 2)   // because prime number has only two factors
  //   {
  //      return true;
  //   }

  //   return false;
  

  // efficient approach
  /* in printAllDivisors we learn how to calculate all divisors(factors) in efficient way using sqrt method 
    so same approach we are using here , here also we have to find if a number has more than 2 factors that 
    it is not prime else prime
   */

   int count =0;
   for(int i=1; i*i <=n ; i++)
   {
      if(n%i == 0)
      {
        count++;
        if(n/i != i)
        {
            count++;
        }
      }
   }

     if(count == 2)   // because prime number has only two factors
    {
       return true;
    }

    return false;


  }



   
}

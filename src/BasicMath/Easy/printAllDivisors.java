public class printAllDivisors {
  public static void main(String[] args) {
    
    printDivisors(36);
  }

  public static void printDivisors(int n)
  {
    // naive approach 
    //  for(int i=1; i<=n;i++)
    //  {
    //     if(n%i == 0)
    //     {
    //       System.out.println(i);
    //     }
    //  }
    // efficient approach
    /* 
     i    N%i
     --------
     1  - 36
     2  - 18
     3  - 12
     4  - 9
    --------
     6  - 6
    ---------
     9  - 4
     12 - 3
     18 - 2
     36 - 1

     as we see after the line 6 - 6 the numbers are repeating in reverse order so we will not iterate after this
     but the problem is how can we figure out that we have to stop here
     so the line 6- 6 represents the sqrt of 36 , means we have to iterate till sqrt(n)
    
     */

    for(int i=1; i <= Math.sqrt(n) ;i++)
    {
       if(n%i == 0)
        {
          System.out.println(i);
          if(n/i != i)
        {
            System.out.println(n/i);
        }
        }
    }
  }
}

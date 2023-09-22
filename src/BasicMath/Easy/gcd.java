public class gcd {
  public static void main(String[] args) {
    System.out.println(greatestCommanDivisor(12,15));
  }

  public static int greatestCommanDivisor(int a, int b)
  {
    // naive approach 
    // int gcd = 1;
    // for(int i= 1; i<= Math.min(a,b);i++){
    //   if(a%i == 0 && b%i ==0)
    //   {
    //      gcd = i;
    //   }
    // }
    //  return gcd;
    /* but in the worst case like (20,40) where comman divisior is one of the number it goes till that number we can change condition like reverse loop but still in worst case like (11,13) it goes till one so overall complexity is o(min(a,b)) */
   


    // efficient approach
    // Euclidian Algorithm
     // gcd(a,b) = gcd(a-b,b) where a>b

     /*explanartion of eclidian
       1. gcd(12,20) = gcd(20-12,12) 
       2. gcd(8,12) = gcd(12-8,8)  
       3. gcd(4,8) = gcd(8-4,4) 
       4. gcd(4,4) = gcd(4-4, 4) 
       5. gcd(0,4) when it becomes 0 we have to stop and our second number is our answer

      but here if we also notice that we are doing subtraction of greatest - lower 


      lets optimize it 
      example - gcd(52,10)

      1. gcd(52-10,10)
      2. gcd(42-10,10)
      3  gcd(32-10,10)
      4. gcd(22-10,10)
      5. gcd(12-10,10) = gcd(2,10)
      6. gcd(10-2, 2)
      7. gcd(8-2, 2)
      8  gcd(6-2, 2)
      9  gcd(4-2, 2)
      10 gcd(2-2 ,2) = gcd(0,2 ) = ans = 2

      here we see that from ste-1 to step-5 we decrement a-b and in step 5 we got gcd(2,10) and same this we cna get this through gcd(52%10, 10) = gcd(2,10) 
      Also step-6 to step-10 we get get it like gcd(10%10,2) = gcd(0,2)

      so throught this anlaysis we can say gcd(a, b) = gcd(a%b, b); where a>b
      */

    while( a > 0 && b > 0)
    {
       if(a > b ){
            a = a%b;
       }else{
            b = b%a;
       }
    }

    if(a == 0)
    {
      return b;
    }else{
      return a;
    }
  }
}

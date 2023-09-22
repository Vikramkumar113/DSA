public class implementAtoi {
  public static void main(String[] args) {
      String str = "-91283472332";
      System.out.println(myAtoi(str));
  }

  public static int myAtoi(String s)
  {
      // here we are many case we have to handle lets do one by one

      int len = s.length();

      // case-1
      if(len == 0) return 0;

      // case-2 if string contains all the whitespace
      int i=0;
      while(i < len && s.charAt(i) == ' ')
      {
         i++;
      }

      if(i == len)
      {
        return 0;
      }

      // skip negative and positiver sign
      boolean positive = s.charAt(i) == '+';
      boolean negative = s.charAt(i) == '-';

      if(positive) i++;
      if(negative) i++;

      // case-2
      double num =0;
      while(i < len && s.charAt(i) >='0' && s.charAt(i) <= '9')
      {
         num = num*10 + (s.charAt(i)- '0');
         i++;
      }

      num = (num > Integer.MAX_VALUE) ? Integer.MAX_VALUE : num;
      num = (num < Integer.MIN_VALUE) ? Integer.MIN_VALUE : num;

      return (int)num;


      
  }
}

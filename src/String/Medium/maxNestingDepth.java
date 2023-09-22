public class maxNestingDepth {
  public static void main(String[] args) {
    String s = "(1)+((2))+(((3)))";
    System.out.println(maxDepth(s));
  }

  public static int maxDepth(String s)
  {
      int count = 0;
      int max = 0;
      for(int i=0; i < s.length(); i++)
      {
        if(s.charAt(i) == '(')
        {
          count++;
        }else if(s.charAt(i) == ')')
        {
          count--;
        }
        
         max = Math.max(count, max);
      }

      return max;
  }
}

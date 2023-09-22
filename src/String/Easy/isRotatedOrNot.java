public class isRotatedOrNot {
  public static void main(String[] args) {
    System.out.println(isStringRotated("geeksforgeeks", "forgeeksgeeks"));
  }

  public static boolean isStringRotated(String s1, String s2)
  {
     if(s1.length()!= s2.length())
        {
            return false;
        }
        
        String str = s1+s1;
        return str.contains(s2);
  }
}

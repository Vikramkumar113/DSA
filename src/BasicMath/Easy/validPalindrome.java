public class validPalindrome {
  public static void main(String[] args) {
    System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
  }

  public static boolean isPalindrome(String str) {

    // Naive approach
    // String s = "";

    // for (int i = 0; i < str.length(); i++) {
    // if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A'
    // && str.charAt(i) <= 'Z')
    // || (str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
    // s = s + str.charAt(i);
    // }
    // }
    // return checkPalindrome(0, s.toLowerCase());

    // efficient approach
    int i = 0;   
    int j = str.length() - 1;

    while (i <= j) 
    {    
      if (!Character.isLetterOrDigit(str.charAt(i))) {
        i++;
      } else if (!Character.isLetterOrDigit(str.charAt(j))) {
        j--;
      } else {
        if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
          return false;
        }

        i++;
        j--;
      }

    }

    return true;

  }

  public static boolean checkPalindrome(int i, String s) {
    if (i >= s.length() / 2)
      return true;

    if (s.charAt(i) != s.charAt(s.length() - i - 1))
      return false;

    return checkPalindrome(i + 1, s);
  }

}

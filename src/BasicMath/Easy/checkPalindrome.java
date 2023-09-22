
public class checkPalindrome {
  public static void main(String[] args) {
     System.out.println(palindrome(121));
     
  }

  public static boolean palindrome(int x)
  {

    // Using string
    // String s = String.valueOf(x); // Convert to String
    // int n = s.length(); // Store the String length to int n

    // for (int i=0; i<n/2; i++) {
    //     // We check whether the elements at the same distance from
    //     // beginning and from ending are same, if not we return false
    //     if (s.charAt(i) != s.charAt(n-i-1)) return false;
    // }

    // // if no flaws are found we return true
    // return true;


    //efficient approach
    if(x<0 || x!=0 && x%10 ==0 ) return false;
        int check=0;
        while(x>check){
            check = check*10 + x%10;
            x/=10;
        }
        return (x==check || x==check/10);
  }
}

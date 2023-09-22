class longestCommonPrefix{
  public static void main(String[] args) {
    String arr[] = {"d","d","d","d"};
    System.out.println(lcp(arr, 4));;
  }

  public static String lcp(String arr[], int n)
  {
    String ans = "";
    for(int i=0; i<=arr[0].length();i++)
    {
      char ch = arr[0].charAt(i);
      boolean match = true;

      for(int j=1;j<n;j++)
      {
         if(arr[j].length() < i || ch!=arr[j].charAt(i)){
          match = false;
          break;

         }
      }

      if(match == false)
      {
        break;
      }else{
        ans = ans+ ch;
      }

    }

    return ans;
  }
}
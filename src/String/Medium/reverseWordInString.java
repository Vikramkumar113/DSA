public class reverseWordInString {
  public static void main(String[] args) {
    String str = "the sky is blue";
    System.out.println(reverseWords(str));
  }

  public static String reverseWords(String str)
    {
      int n = str.length();
      char[] chars = str.toCharArray();
      int start = 0;
      reverseString(chars, start, n-1);
        for (int i = 0; i < n; i++) {
            if (chars[i] == ' ') {
                reverseString(chars, start, i - 1);
                start = i + 1;
            }
        }
        reverseString(chars, start, n - 1);
        return new String(chars);
    }
    
    static void reverseString(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
  
}

import java.util.HashMap;

public class numberOfSubString {
  public static void main(String[] args) {
    String s= "aaacb";
    System.out.println(countSubStrings(s, 3) - countSubStrings(s, 2));
  }


// Approach- 1 
 public static int countSubStrings(String s, int k) {
        int left = 0;
        int right = 0;
        int maxSubArray = 0;
        HashMap<Character, Integer> hm = new HashMap<>();

        while (right < s.length()) {
            hm.put(s.charAt(right), hm.getOrDefault(s.charAt(right), 0) + 1);

            while (left <= right && hm.size() > k) {
                hm.put(s.charAt(left), hm.get(s.charAt(left)) - 1);
                if (hm.get(s.charAt(left)) == 0) {
                    hm.remove(s.charAt(left));
                }
                left++;
            }

            maxSubArray = maxSubArray + right - left + 1;
            right++;
        }
        return maxSubArray;
    }
}

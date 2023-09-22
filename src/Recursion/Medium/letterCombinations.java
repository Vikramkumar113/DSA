import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class letterCombinations {
  public static void main(String[] args) {
    // Map<Integer, String> map = new LinkedHashMap<>();
    //     map.put(2, "abc");
    //     map.put(3, "def");
    //     map.put(4, "ghi");
    //     map.put(5, "jkl");
    //     map.put(6, "mno");
    //     map.put(7, "pqrs");
    //     map.put(8, "tuv");
    //     map.put(9, "wxyz");

    // String digits = "234";
    // int key =0;
    // letterCombinationsOfPhone(digits, "", map, key);


    String arr[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    ArrayList<String> list = new ArrayList<>();
    String digits = "234";
    if(digits.length() == 0)
    {
        return;
    }

    String ans = "";
    letterCombinations2(digits, ans, arr, 0, list);
    System.out.println(list);
  }


  // Approach -1
  public static void letterCombinationsOfPhone(String digits, String ans, Map<Integer, String> map, int key )
  {
     if(digits.length() == 0)
     {
         return;
     }

     if(key == digits.length())
     {
       System.out.println(ans);
       return;
     }

     int digit = digits.charAt(key) - '0'; // Get the current digit as an integer
     String characters = map.get(digit);


     for (int i = 0; i < characters.length(); i++) {
         letterCombinationsOfPhone(digits, ans + characters.charAt(i), map, key + 1);
     }
  }

  // Approach -2 
  public static void letterCombinations2(String digits, String ans, String arr[], int key, ArrayList<String> list ){

     if(key == digits.length())
     {
       list.add(ans);
       return;
     }

     int digit = digits.charAt(key) - '0'; // Get the current digit as an integer
     String characters = arr[digit];


     for (int i = 0; i < characters.length(); i++) {
         ans = ans+ characters.charAt(i);
         letterCombinations2(digits, ans, arr, key + 1, list);
         ans = ans.substring(0, ans.length() - 1); 
         
     }
  }
}

import java.util.HashMap;
import java.util.Map;

class romanToInteger{
  public static void main(String s[])
  {
     String str = "MMMDCCXCIV";
     
     //System.out.println(romanToDecimal(str));
      System.out.println(romanToInt(str));

  }

  
  // Approach -1 using additional function
  // public static int check(char a)
  // {
  //   if(a == 'I') return 1;
  //   else if(a == 'V') return 5;
  //   else if(a == 'X') return 10;
  //   else if(a == 'L') return 50;
  //   else if(a == 'C') return 100;
  //   else if(a == 'D') return 500;
  //   else if(a == 'M') return 1000;
  //   else return 0;
  // }
  // public static int romanToDecimal(String str)
  // {
  //      int sum = check(str.charAt(str.length()-1));
  //      for(int i= str.length()-2; i >= 0; i--)
  //      {
  //         if(check(str.charAt(i)) < check(str.charAt(i+1)))
  //         {
  //             sum = sum - check(str.charAt(i));
  //         }else{
  //            sum = sum + check(str.charAt(i));
  //         }
  //      }

  //      return sum;

       
  // }

  //Approach-2 using Hashmap 
    public static int romanToInt(String s) {
        
        Map<Character,Integer> map = new HashMap<>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        
        char arr[] = s.toCharArray();
        int previous = 0;
        int result = 0;
        int n = arr.length;

        for(int i=n-1; i>=0; i--){
            int current = map.get(arr[i]);
            if(previous > current){
                result -= current;
            }else{
                result += current;
            }
            previous = current;
        }

        return result;
    }
}
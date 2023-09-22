import java.util.Arrays;
public class validAnagram {
  public static void main(String[] args) {
    // System.out.println(isAnagram("tar","rat"));
     
  }


  //approach-1 naive
  // public static boolean isAnagram(String s, String t) {

  //       if(s.length()!=t.length())
  //       {
  //           return false;
  //       }

  //       String ans1 = sortString(s);
  //       String ans2 = sortString(t);

  //      for(int i=0; i< ans1.length();i++)
  //      {
  //        if(ans1.charAt(i) != ans2.charAt(i))
  //        {
  //         return false;
  //        }
  //      }

  //       return true;
  //   }

  //   public static  String sortString(String str)
  //   {
  //       char ch[] = str.toCharArray();
  //       Arrays.sort(ch);

  //       String s = String.valueOf(ch);

  //       return s;
  //   }


  //approach-2 efficient
  public boolean isAnagram(String s, String t) {

        if(s == null || t == null){
            return false;
        }
        if(s.length()!=t.length())
        {
            return false;
        }

        int counter[] = new int[26];
        for(int i=0; i < s.length(); i++)
        {
            counter[s.charAt(i)-'a']++;
            counter[t.charAt(i)-'a']--;
        }

        for(int element : counter)
        {
            if(element != 0)
            {
                return false;
            }
        }

        return true;
        
    }
}

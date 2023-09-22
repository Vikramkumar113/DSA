import java.util.Arrays;

public class isomorphicString {
  public static void main(String[] args) {
   System.out.println(areIsomorphic("aba", "xyy"));  
  }

  public static boolean areIsomorphic(String str1, String str2)
  {
    int  ans1 = removeDuplicate(str1);
    int ans2 = removeDuplicate(str2);

     if(ans1 == ans2)
     {
       return true;
     }

     return false;
  }

  public static int removeDuplicate(String str)
  {
     int count =1;
     char a[] = str.toCharArray();
     Arrays.sort(a);

     for(int i=1; i<=a.length-1;i++){
        if(a[i]!= a[i-1] )
        {
          count++;
        }
     }

     return count;
  }

  
}

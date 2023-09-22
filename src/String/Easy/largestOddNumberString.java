public class largestOddNumberString {
  public static void main(String[] args) {
   System.out.println(maxOdd("2041"));
  }

  public static String maxOdd(String s)
  {
     
    //  long c = Long.parseLong(s);
    //  long total = c;
    //  while(c!=0)
    //  {
       
    //    if((c%10)%2==1)
    //    {
    //      return Long.toString(total);
    //    }else{
    //      c=c/10;
    //      total = total/10;
    //    }
    //  }

    //  return "";


    String str="";
    int flag =0;
    int i;
    for(i= s.length()-1; i>=0; i--)
    {
      
      int x = s.charAt(i)-'0';
      if(x%2 == 1)
      {
          flag = 1;
          break;
      }
    }

    if(flag==0){
      return "";
    }
    
    for(int j=0; j<=i; j++)
    {
        str = str+ s.charAt(j);
    }

    return str;
  }
  
}

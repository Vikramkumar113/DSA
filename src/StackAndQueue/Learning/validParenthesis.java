


import java.util.Stack;
public class validParenthesis {
  public static void main(String[] args) {
      System.out.println(isValid("()[{}()]"));
  }

  
  // Most efficient solution -1
  public static  boolean isValid(String s) {
    
    Stack<Character> stack = new Stack<Character>();

    for (char element : s.toCharArray()) {
      if (element == '(' || element == '{' || element == '[') {
        stack.push(element);
    } else if (!stack.isEmpty() && ((element == ')' && stack.peek() == '(') || (element == '}' && stack.peek() == '{') || (element == ']' && stack.peek() == '['))) {
        stack.pop();
    } else {
        if (stack.isEmpty() && (element == ')' || element == '}' || element == ']')) {
            return false;
        }
        return false;
    }
  }
    return stack.isEmpty();
}
}

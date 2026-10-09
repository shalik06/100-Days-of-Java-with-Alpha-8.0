import java.util.Stack;

public class DuplicateParentheses {

public static boolean isDuplicate(String str) {

    Stack<Character> s = new Stack<>();

    for (int i = 0; i < str.length(); i++) {

        char ch = str.charAt(i);

        // Closing bracket encountered
        if (ch == ')') {

            int count = 0;

            while (!s.isEmpty() && s.peek() != '(') {
                s.pop();
                count++;
            }

            // Remove opening bracket
            if (!s.isEmpty()) {
                s.pop();
            }

            // No content inside parentheses
            if (count < 1) {
                return true;
            }

        } else {
            s.push(ch);
        }
    }

    return false;
}

public static void main(String[] args) {

    String str1 = "((a+b))";
    String str2 = "(a+b)";
    String str3 = "(a+b)+((c+d))";

    System.out.println(isDuplicate(str1)); // true
    System.out.println(isDuplicate(str2)); // false
    System.out.println(isDuplicate(str3)); // true
}

}

import java.util.Stack;

public class ReverseString {

    // Reverse a String using a Stack
    public static String reverseString(String str) {

        Stack<Character> s = new Stack<>();

        // Push every character into Stack
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        // Pop characters from Stack
        StringBuilder result = new StringBuilder("");

        while (!s.empty()) {
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String str = "abc";

        String result = reverseString(str);

        System.out.println(result);
    }
}
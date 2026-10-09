import java.util.Stack;

public class Span {

public static void stockSpan(int stock[], int spans[]) {

    Stack<Integer> s = new Stack<>();

    spans[0] = 1;
    s.push(0);

    for (int i = 1; i < stock.length; i++) {

        int currPrice = stock[i];

        while (!s.isEmpty() && currPrice >= stock[s.peek()]) {
            s.pop();
        }

        if (s.isEmpty()) {
            spans[i] = i + 1;
        } else {
            int prevHigh = s.peek();
            spans[i] = i - prevHigh;
        }

        s.push(i);
    }
}

public static void main(String[] args) {

    int stock[] = {100, 80, 60, 85, 100};
    int spans[] = new int[stock.length];

    stockSpan(stock, spans);

    for (int i = 0; i < spans.length; i++) {
        System.out.print(spans[i] + " ");
    }
}

}

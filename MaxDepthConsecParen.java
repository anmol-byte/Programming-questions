
import java.util.Stack;
import java.util.Scanner;
import java.lang.Math;

public class MaxDepthConsecParen {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		for (int i = 1; i <= n; i++) {
			String s = scn.next();
			// println is for printing in next line
			// System.out.println(func(s));
			// for printing in same line just remove ln
			System.out.print(func(s));
		}
	}

	public static int func(String s) {

		Stack<Character> stk = new Stack<Character>();
		int count = 0, idx = 0;
		while (idx < s.length()) {
			char c = s.charAt(idx++);
			if (c == '(') {
				stk.push('(');
				count = Math.max(count, stk.size());
			} else if (c == ')') {
				if (stk.isEmpty()) {
					return -1;
				} else {
					stk.pop();
				}
			}
		}
		if (!stk.isEmpty()) {
			return -1;
		} else {
			return count;
		}
	}
}

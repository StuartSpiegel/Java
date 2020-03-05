import java.util.*;

class Solution{

	public static void main(String []argh){
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input=sc.next();

			//static method call method call
			System.out.println(isBalanced(input));

		}
	}

public static boolean isBalanced(String inputString){
  Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < parentheses.length(); i++) {
			char ch = parentheses.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else if (stack.empty()) {
				return false;
			} else {
				char top = stack.pop();
				if ((top == '(' && ch != ')') || (top == '[' && ch != ']')
						|| (top == '{' && ch != '}')) {
					return false;
				}
			}
		}
		return stack.empty();
	}
  }

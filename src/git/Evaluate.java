package git;
import java.util.Stack;

public class Evaluate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// dijstra 的双栈算数表达式求知算法
		
		char[] ar1 = ("(1+((2+3)*(4*5)))").toCharArray();

		String[] args1 = new String[ar1.length];

		for (int i = 0; i < ar1.length; i++) {
			args1[i] = String.valueOf(ar1[i]);
		}

		Stack<String> ops = new Stack<String>();
		Stack<Double> num = new Stack<Double>();

		for (int i = 0; i < args1.length; i++) {

			if (args1[i].equals("(")) {
				continue;

			} else if (args1[i].equals("+")) {
				ops.push(args1[i]);
			} else if (args1[i].equals("-")) {
				ops.push(args1[i]);
			} else if (args1[i].equals("*")) {
				ops.push(args1[i]);
			} else if (args1[i].equals("/")) {
				ops.push(args1[i]);
			} else if (args1[i].equals(")")) {
				double a = num.pop();
				String op = ops.pop();
				if (op.equals("+")) {
					a = num.pop() + a;
				} else if (op.equals("-")) {
					a = num.pop() - a;
				} else if (op.equals("*")) {
					a = num.pop() * a;
				} else if (op.equals("/")) {
					a = num.pop() / a;
				}
				num.push(a);
			} else {
				num.push(Double.parseDouble(args1[i]));
			}

		}

		System.out.print(num.pop());

	}

}

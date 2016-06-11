package string_stack;

import java.util.Stack;

public class StringPushPopExample {

	public static void main(String[] args) {

		Stack<String> stacklist = new Stack<>();
		stacklist.push("samir");
		printStack(stacklist);
		stacklist.push("family");
		printStack(stacklist);
		stacklist.push("kids");
		printStack(stacklist);

		stacklist.pop();
		printStack(stacklist);
		stacklist.pop();
		printStack(stacklist);
		stacklist.pop();
		printStack(stacklist);

	}

	private static void printStack(Stack<String> list) {
		if (list.isEmpty())
			System.out.println("Stack List is Empty");
		else
			System.out.printf("%s TOP \n", list);

	}

}

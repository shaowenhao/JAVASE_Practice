package data.orginization;

public class TestStack {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
        stack.push(6);
        stack.push(7);
        stack.push(8);
        System.out.println(stack.pop());
        System.err.println(stack.isEmpty());
        System.out.println(stack.peek());
	}

}

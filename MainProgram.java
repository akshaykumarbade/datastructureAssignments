package question2;

public class MainProgram {

	public static void main(String[] args) {
		StackUsingSList stack = new StackUsingSList();
		stack.Push(1);
		stack.Push(10);
		stack.Push(11);
		stack.Push(12);
		stack.Push(13);
		stack.Push(14);
		stack.displayStack();
		System.out.println();
		stack.Pop();
		stack.Pop();
		stack.displayStack();
		System.out.println();
		System.out.println(stack.IsEmpty());
		System.out.println(stack.getSize());
		
		

	}

}

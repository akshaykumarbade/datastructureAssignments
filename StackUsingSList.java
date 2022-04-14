package question2;

import java.util.EmptyStackException;

public class StackUsingSList implements StackIntf {
	
	private SListNode top;
	private int size;

	@Override
	public void Push(int element) {
		SListNode tempNode = new SListNode(element);
		tempNode.next=top;
		top = tempNode;
		size++;
		
	}

	@Override
	public int Pop() {
		if(IsEmpty()) {
			throw new EmptyStackException();
		}
		int result = top.data;
		top = top.next;
		size--;
		return result;
	}

	@Override
	public boolean IsEmpty() {
		if(size==0)
			return true;
		return false;
	}

	@Override
	public boolean IsFull() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void displayStack() {
		SListNode current = top;
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		
		}
	}
	
	public int getSize() {
		return size;
	}

}

package question1;

public class SList {
	SListNode head;
	SListNode tail;
	
	public SList() {
		head = null;
		tail = null;
	}
	
	public void AddAtFront(int element) {
		SListNode newNode = new SListNode(element);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	public void AddAtRear(int element) {
		//Make space for new element, newNode.
		SListNode newNode = new SListNode(element);
		//if list is empty then
		if(head == null) {
			//set head and tail to newNode
			head = newNode;
			tail = newNode;
			return;
		}
		//set tail's next to newNode
		tail.next = newNode;
		//set tail to newNode
		tail = newNode;
	}
	
	public int DeleteFirstNode() {
		SListNode temp;
		temp = head;
		head = head.next;
		return temp.data;
		
	}
	
	public int DeleteLastNode() {
		SListNode current;
		SListNode temp;
		current = head;
		while(current.next != tail) {
			current = current.next;
		}
		current.next = null;
		temp = tail;
		tail = current;
		return temp.data;
		
	}
	
	
	public int getCount() {
		int count = 0;
		SListNode current;
		
		current = head;
		while(current != null) {
			++count;
			current = current.next;
		}
		return count;
	}
	
	public int[] getElements() {
		int elements[] = new int[getCount()];
		int i = 0;
		SListNode current;
		
		current = head;
		while(current != null) {
			elements[i] = current.data;
			++i;
			current = current.next;
			
		}
		return elements;
	}

}

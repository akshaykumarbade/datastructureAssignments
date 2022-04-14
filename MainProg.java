package question1;

import java.util.Arrays;

public class MainProg {

	public static void main(String[] args) {
		SList slist = new SList();
		
		slist.AddAtFront(1);
		slist.AddAtRear(2);
		slist.AddAtFront(3);
		slist.AddAtRear(4);
		
		System.out.println(Arrays.toString(slist.getElements()));
		
		slist.DeleteFirstNode();
		slist.DeleteLastNode();
		System.out.println(Arrays.toString(slist.getElements()));

	}

}

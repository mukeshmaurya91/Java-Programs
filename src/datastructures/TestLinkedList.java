package datastructures;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList mLinkedList= new LinkedList();
		mLinkedList.insert("Gaurav Rai");
		mLinkedList.insert("Mukesh");
		mLinkedList.insert("Rai");
		mLinkedList.insert("Maurya");
		mLinkedList.insertAt(0,"MK");
		mLinkedList.insert("Kumar");
		mLinkedList.print();
        System.out.println(mLinkedList.getSize());
	}

}

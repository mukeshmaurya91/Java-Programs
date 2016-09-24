package datastructures;

public class LinkedList {
	
	private Node first;
	private int size;
	
	/**
	 * insert at first place
	 * @param item
	 */
	private void insertFirst(String item){
		Node m=first;
		Node n=new Node(item,m);
		first=n;
		size++;
	}
	/**
	 * insert at Last place
	 * @param item
	 */
	private void insertLast(String item){
		Node m=first;
		while(m.next!=null){
			m=m.next;
		}
		Node n=new Node(item,m.next);
		m.next=n;
		size++;
	}
	/**
	 * insert at appropriate place
	 * @param item
	 */
	public void insert(String item){
		Node m=first;
		if(m==null)
		insertFirst(item);
		else{
		insertLast(item);
		}
	}
	/**
	 * insert at specified place
	 * @param item
	 */
	public void insertAt(int index,String item){
		if(!checkIndex(index))
			return;
		Node m=first;
		int i=0;
		while(i!=index-1){
			m=m.next;
			i++;
		}
		Node n=new Node(item,m.next);
		m.next=n;
		size++;
	}
	/**
	 * check if given index is appropriate to add element or delete element
	 * @param index
	 * @return
	 */
	private boolean checkIndex(int index) {
		if(index >= 0 && index <= size){
			return true;
		}else{
			System.out.println("ERROR: index not valid!");
			return false;
		}
//			throw new Exception("");
		
	}
	public int getSize(){
		return size;
	}
	/**
	 * print all elements of the list
	 */
	public void print() {
		Node m=first;
		System.out.print("LinkedList: [");
		while(m!=null){
			if(m.next!=null)
			System.out.print(m.item+",");
			else
				System.out.print(m.item);	
			m=m.next;
		}
		System.out.println("]");
	}
	
	private static class Node {
        String item;
        Node next;

        Node(String element, Node next) {
            this.item = element;
            this.next = next;
        }
    }


}

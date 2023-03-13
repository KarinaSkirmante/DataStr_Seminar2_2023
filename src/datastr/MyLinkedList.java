package datastr;

public class MyLinkedList<T> {

	private MyNode first = null;
	private MyNode last = null;
	private int elementCounter = 0;
	
	//we will use no-args constuctor from Object class
	
	//TODO: isFull, isEmpty, howManyElements
	
	public void add(T newElement) {
		//TODO verify is not full
		
		//list is empty
		if(elementCounter == 0) {
			MyNode<T> newNode = new MyNode<T>(newElement);
			first = newNode;
			last = newNode;			
			elementCounter++;
		}
		else
		{
			MyNode<T> newNode = new MyNode<T>(newElement);
			last.setNext(newNode);
			newNode.setPrevious(last);
			last = newNode;
			elementCounter++;
			
		}
		
	}
	
	
	
}

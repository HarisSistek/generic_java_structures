

class LinkedList <E extends Comparable <E>> {
    
    private Node<E> head;
    
    LinkedList () {
	
    }
    
    /**
     *Adds at the end of the list, no sorting 
     */
    public void add(E e) {
	
	if (head == null) 
	    head = new Node<E> (e);
	
	head.addToList(e);
	
    }

    /**
     *Get the i'nth element in the list.
     *List starts from 0 and grows from there
     */
    public E get(int i) {
	
	if (head == null) {
	    return null;
	}

	return head.getElementFromList(i);
    }
    
}

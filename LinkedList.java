

class LinkedList <E extends Comparable <E>> {
    
    private Node<E> head;
    private int size;
    private Debug debug;
    
    LinkedList () {
	size = 0;
    }
    
    /**
     *Adds at the end of the list, no sorting 
     */
    public void add(E e) {
	size++;

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

    /**
     *Remove the node e in the list
     *the node will do most of the work
     */
    public void remove(E e) {
	if (head == null) 
	    return;

	if (size == 1) {
	    size--;
	    head = null;
	    return;
	}
	size--;
	head.remove(e);
    }

    public int size() {
	return size;
    }
    
}

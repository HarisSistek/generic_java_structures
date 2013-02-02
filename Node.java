/**
 *@author Haris Sistek
 */

/**
 *All purpose node for list and stack
 */
class Node <E extends Comparable<E>> {
    
    private E element;

    //Nodes for list/stacks
    private Node <E> next;
    private Node <E> prev;
    
    Node (E e) {
	element = e;
    }

    public Node<E> getNext() {
	return next;
    }

    public E getElement() {
	return element;
    }

    public void setElement(E e) {
	element = e;
    }

    /**
     *Recursivly go to the end of the list and add the element in a new Node
     *Is not sorted
     *
     */
    public void addToList(E e) {
	
	//at the end of the list add the new node
	if (next == null) {	    
	    next = new Node<E> (e);
	    return;
	}
	
	//if I just added a new Node
	if (next != null && next.prev == null) {
	    next.prev = this;
	}
	
	if (next != null)
	    next.addToList(e);//recursivly go to the end of the list
	
    }

    /**
     *Find the node i'nt in line
     */
    public E getElementFromList(int i) {
	
	if (i == 0) 
	    return element;
	
	if (next != null) {
	    return next.getElementFromList(i -1);

	}
	
	return null;
	    
    }

    /**
     *Remove the node e from the list and link the nodes back together
     */
    public void remove(E e) {

	if (e.compareTo(this.element) == 0) {
	    if (prev != null && next != null) {//in the middle
        
		next.prev = prev;//my next's prev is now my prev
		prev.next = next;//my prev's next is now my next
		return;
	    }
	    
	    if (next == null && prev != null) {//the last in the list
		prev.next = null;//remove myself from the list

	    }
	}

	if (next == null)
	    return;
      
	next.remove(e);
	
    }

}



class BST_NODE <E extends Comparable<E>> {
    
    E element;
    BST_NODE<E> left, right;
    
    BST_NODE(E e) {
	element = e;
    }
    
    /**
     *Add the element to the binary search tree.
     *Add the bigger or equal values to the right, smaller to the left.
     */
    public void add(E e) {
	
	if (element.compareTo(e) <= 0) {//equal size or bigger, go to the right
	    if (right == null) {
		right = new BST_NODE<E>(e);
	    } else {
		right.add(e);
	    }
	} else if (element.compareTo(e) > 0) {//less then equal
	    if (left == null) {
		left = new BST_NODE<E>(e);
	    } else {
		left.add(e);
	    }
	} 	
	
    }


    /**
     *Infix print of the Tree
     *For now assuming <E> are simple types that can be printed directly like (string, int, char).
     *Need to make a custom interface that should be extended by alle the <E>'s 
     */
    public void infix(BST_NODE b) {
	if (b == null) 
	    return;

	infix(b.left);
	
	System.err.println(b.element);

	infix(b.right);
    }

    /**
     *Value, left, right.
     */
    public void prefix(BST_NODE b) {
	if (b == null) 
	    return;
	
	System.err.println(b.element);
	
	prefix(b.left);

	prefix(b.right);
    }

    /**
     * left, right, value.
     */
    public void postfix(BST_NODE b) {
	if (b == null) 
	    return;
	
	postfix(b.left);

	postfix(b.right);

	System.err.println(b.element);
    }
    
}

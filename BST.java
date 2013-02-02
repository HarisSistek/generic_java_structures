


class BST <E extends Comparable<E>> {
    
    private int size;
    private BST_NODE<E> root;
    

    /**
     *Add the element to the binary search tree.
     *Add the bigger or equal values to the right, smaller to the left.
     */
    public void add(E e) {
	size++;
	
	if (root == null) 
	    root = new BST_NODE<E>(e);

	root.add(e);
	
    }

    /**
     *Infix print of the Tree
     *For now assuming <E> are simple types that can be printed directly like (string, int, char).
     *Need to make a custom interface that should be extended by alle the <E>'s 
     */
    public void infix() {
	if (root == null) 
	    return;

	root.infix(root);
    }

    public void prefix() {
	if (root == null) 
	    return;

	root.prefix(root);
    }

    public void postfix() {
	if (root == null) 
	    return;

	root.postfix(root);
    }
    
   

    public int getSize() {
	return size;
    }


}



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

    public boolean emptyNode() {
	if (left == null && right == null)
	    return true;

	return false;
    }

    public boolean leftyNode() {
	if (left != null && right == null)
	    return true;

	return false;
    }
     
    public boolean rightyNode() {
	if (left == null && right != null)
	    return true;

	return false;
    }

    /**
     *Find the smalles node in one given subtree
     *This means to just run down the left side of the subtree til you stop.
     */
    public BST_NODE smalestOnTheRight(BST_NODE b) {
	if (b.left == null)
	    return b;

	return b.smalestOnTheRight(b.left);
    }
    
    public void remove(BST_NODE b, E e) {
	if (b == null) 
	    return;
	
	if (left.element.compareTo(e) == 0) {
	    if (left.emptyNode()) {// if left is a empty node == no subtrees 
		left = null;
	    } else if (left.leftyNode()) {//if left only has a left subtree
		left = left.left;//make this left subtree the subtree that my former left had
	    } else if (left.rightyNode()) {//if left only has a left subtree
		left = left.right;//make this left subtree the subtree that my former left had
	    } else {// else left has right and left subtrees
		BST_NODE<E> tmp = smalestOnTheRight(left.right);
		remove(left.right, e);// remove the tmp from the right subtree

		tmp.left = left.left;
		tmp.right = left.right;
		left = tmp;
	    }
	    
	} else if (right.element.compareTo(e) == 0) {
	    if (right.emptyNode()) {// if left is a empty node 
		  right = null;

	    }
	} else {
	    remove(b.left, e);
	    remove(b.right, e);
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

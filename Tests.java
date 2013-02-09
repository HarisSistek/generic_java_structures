import java.util.Random;

class Tests {
     
    public static void main(String[] args){
	
	Random random = new Random();
	Debug d = new Debug(true);
	BST<Integer> bst = new BST<Integer>();
	LinkedList<Integer> link = new LinkedList<Integer>();
	
	for (int i = 0; i < 1000; i++) {
	    link.add(random.nextInt());
	}
	for (int i = 0; i < 50; i++) {
	    d.debug(link.get(i));
	}

	for (int i = 0; i < 50; i++) {
	    link.remove(link.get(i));
	}
	
	d.debug("size " + link.size());

	for (int i = 0; i < 50; i++) {
	    d.debug(link.get(i));
	}
	d.debug("THE BINARY SEARCH TREE: ");
	
	for (int i = 0; i < 50; i++) {
	    bst.add(random.nextInt());
	}

	bst.infix();
	d.debug("PREFIX");
	bst.prefix();
	d.debug("POSTFIX");
	bst.postfix();

	for (int i = 0; i < 10000; i++) {
	    bst.add(random.nextInt());
	}
	d.debug("TREE Size: " + bst.getSize());
    }
}

import java.util.Random;

class Tests {
     
    public static void main(String[] args){
	
	Random random = new Random();
	Debug d = new Debug(true);
	
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
    }
}

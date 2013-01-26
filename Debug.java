/**
 *@author Haris Sistek
 */

/**
 *All purpose debugger
 */
class Debug {
    
    private boolean printAll;
    
    Debug(boolean p) {
	printAll = p;
    }

    public void turnOff() {
	printAll = false;
    }

    public void turnOn() {
	printAll = true;
    }

    public void debug(String d) {
	if (printAll) {
	    System.err.printf("DEBUG: %s\n");
	}
    }
}

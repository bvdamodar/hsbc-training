
public class q10_Computer {
	/**
	 * @author bvdam
	 */

	public q10_Computer() {
	      System.out.println("Constructor of Computer class.");
	}
	
	public void computer_method() {
	      System.out.println("Ready to Work...");
	   }

	public static void main(String[] args) {
		
		//Main Class Computer Definition
		q10_Computer  q = new q10_Computer();
		
		//Accessories Class Call Definition
		CPU c = new CPU();
		Monitor r = new Monitor();
		KeyBoard k = new KeyBoard();
		Mouse m = new Mouse();
		
		//Method Calls
		q.computer_method();
		c.CPU_method();
		r.Monitor_method();
		k.KeyBoard_method();
		m.Mouse_method();

	}

}

class Monitor {
	   Monitor() {
	      System.out.println("Constructor of Monitor class.");
	   }
	   public void Monitor_method() {
	      System.out.println("You can see me to do your work.");
	   }
	}

class CPU {
	   CPU() {
	      System.out.println("Constructor of CPU class.");
	   }
	   public void CPU_method() {
		      System.out.println("Brain of the System is ready now.");
	   }
	}

class KeyBoard {
	KeyBoard() {
	      System.out.println("Constructor of KeyBoard class.");
	   }
	   public void KeyBoard_method() {
	      System.out.println("You can type me to accomplish your task.");
	   }
	}

class Mouse {
	Mouse() {
	      System.out.println("Constructor of Mouse class.");
	   }
	   public void Mouse_method() {
		      System.out.println("Move me to move on with your work.");
	   }
	}



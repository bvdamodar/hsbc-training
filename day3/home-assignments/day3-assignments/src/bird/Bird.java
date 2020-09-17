package bird;
/**
 * 
 * @author bvdam
 *
 */
public abstract class Bird {

	public Bird() {
		// TODO Auto-generated constructor stub
	}

//	abstract public double area() ;
	
	public void eat() {
        System.out.println("All birds can eat");
    }

    public void sleep() {
        System.out.println("All birds can sleep");
    }

    public abstract void fly();
    public abstract void swim();
	
    public static void main(String[] args) {
		
    	//Definition
//    	Bird b = new Bird();
    	
    	Parrot p = new Parrot();
    	Eagle e = new Eagle();
    	Duck d = new Duck();
    	Ostrich o = new Ostrich();
    	
    	    	
    	p.fly();
    	p.swim();
    	
    	e.fly();
    	e.swim();
    	
    	d.fly();
    	d.swim();
    	
    	o.fly();
    	o.swim();
    	
    	
	}
}

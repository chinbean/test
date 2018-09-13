package ddd;

public class Test07 {
	public static void main(String[] args) {
		Other o = new Other();
		Test07 t=new Test07(); 
		t.addOne(o);
		
	}
	public void addOne(final Other o) {
	    o.i++;
	    doSomething();
	}
	
	int i;
	public void doSomething() {
	   System.out.println("i = " + i);
	}
}
class Other {
	public int i;
}

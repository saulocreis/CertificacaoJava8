package scrtc;

public abstract class Base {
	
	public abstract void rodar(String[] args);
	
	public void print(Object o) {
		System.out.format("%s", o);
	}
	
	public void println(Object o) {
		System.out.format("%s\n", o);
	}
	
	public void println() {
		System.out.println();
	}

}

package concorrencia.ex6;

public class Incrementador extends Thread {
	private Contador c;
	
	public Incrementador (Contador c) {
		this.c = c;
	}

	@Override
	public void run() {
		c.incr();
	}
}

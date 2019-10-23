package concorrencia.ex6;

public class ContadorSync extends Contador {
	public synchronized void incr() {
		super.incr();
	}
	public synchronized void decr() {
		super.decr();
	}
}

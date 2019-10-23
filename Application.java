package concorrencia.ex6;

import concorrencia.util.ThreadsList;

/**
 * Exemplo com vários incrementadores que incrementam um contador não-sincronizado e sincronizado paralelamente.
 * @author gabri
 */
public class Application {

	public static void main(String[] args) throws Exception {
		int MAX = 3;
		executarContador(MAX, new Contador());
		executarContador(MAX, new ContadorSync());
	}

	/**
	 * 
	 */
	private static void executarContador(int max, Contador contador) {
		ThreadsList<Incrementador> threadsList = new ThreadsList<Incrementador>();
		for (int i = 1; i <= max; i++) {
			threadsList.add(new Incrementador(contador));
		}
		threadsList.start();
		threadsList.join();
		System.out.println("Contagem de 1 a " + max + " com " + contador);
		System.out.println("Valor encontrado: " + contador.getValor());
	}

}

package scrtc;

public class P498 extends Base {

	public static void main(String[] args) {
		P498 o = new P498();
		o.rodar(args);
	}

	public void rodar(String[] args) {
		
		int[][] matriz = new int[3][]; // NA INSTANCIA��O, S� � NECESS�RIO INFORMAR O TAMANHO DO OBJETO ATRIBU�DO � REFER�NCIA
		
		for(int i = 0; i < matriz.length; i++) {
			matriz[i] = new int[3];
		}
		
		println(matriz);
		
	}

}

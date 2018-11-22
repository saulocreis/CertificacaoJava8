package scrtc;

public class P498 extends Base {

	public static void main(String[] args) {
		P498 o = new P498();
		o.rodar(args);
	}

	public void rodar(String[] args) {
		
		int[][] matriz = new int[3][]; // NA INSTANCIAÇÃO, SÓ É NECESSÁRIO INFORMAR O TAMANHO DO OBJETO ATRIBUÍDO À REFERÊNCIA
		
		for(int i = 0; i < matriz.length; i++) {
			matriz[i] = new int[3];
		}
		
		println(matriz);
		
	}

}

package scrtc;

public class P520 extends Base {

	public static void main(String[] args) {
		P520 o = new P520();
		o.rodar(args);
	}

	public void rodar(String[] args) {
		
		Integer y = 234;
		Integer x = y;
		
		println("x = " + x + " | y = " + y);
		println("y == x ? " + (y==x));
		
		y++; // AUTO INCREMENTO DE UM OBJETO INTEGER FAZ CRIAR UM NOVO OBJETO
		y--; // POIS O OBJETO INTEGER É IMUTÁVEL
		
		println("x = " + x + " | y = " + y);
		println("y == x ? " + (y==x)); // AGORA ESSAS REFERÊNCIAS NÃO APONTAM MAIS PARA O MESMO OBJETO
		
	}

}

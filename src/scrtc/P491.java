package scrtc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class P491 extends Base {

	public static void main(String[] args) {
		P491 o = new P491();
		o.rodar(args);
	}

	public void rodar(String[] args) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate data1 = LocalDate.of(2018, 11, 14);
		
		println(data1.format(f));
		
		println(f.format(data1));
	}

}

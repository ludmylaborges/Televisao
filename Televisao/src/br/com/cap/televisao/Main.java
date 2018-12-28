package br.com.cap.televisao;

public class Main {

	public static void main(String[] args) {
		
		Televisao televisao = new Televisao(42, "Samsung", 110, 11, true);
		
		System.out.println(televisao.isLigadoDesligado());
		System.out.println(televisao.consumo(110, 42));
		System.out.println(televisao.ligadoDesligado());
	
		System.out.println(televisao.ligadoDesligado());
		System.out.println(televisao.aumentarVolume(6));
		System.out.println(televisao.diminuirVolume(3));
		
		System.out.println(televisao.subircanal(11));
		System.out.println(televisao.descercanal(5));
	}

}

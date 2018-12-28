package br.com.cap.televisao;


public class Televisao {
 
	private int tamanhoTela;
	private int volume;
	private String marca;
	private int voltagem;
	private int canal;
	private boolean ligadoDesligado;
	
	
	public Televisao(int tamanhoTela, String marca, int voltagem, int canal, boolean ligadoDesligado) {
		super();
		this.tamanhoTela = tamanhoTela;
		this.volume = 5;
		this.marca = marca;
		this.voltagem = voltagem;
		this.canal = canal;
		this.ligadoDesligado = ligadoDesligado;
	}

	
	public double getTamanhoTela() {
		return tamanhoTela;
	}
	public void setTamanhoTela(int tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public boolean isLigadoDesligado() {
		return ligadoDesligado;
	}

	public void setLigadoDesligado(boolean ligadoDesligado) {
		this.ligadoDesligado = ligadoDesligado;
	}
	

	public int consumo(int voltagem, int tamanhoTela) {
		return voltagem * tamanhoTela;
	}
	
	public int ligadoDesligado() {	
		
		if(ligadoDesligado) {
			ligadoDesligado = false;
			return 0;
		} else {
		ligadoDesligado	= true; 
		return consumo(voltagem, tamanhoTela);
		}
		
    }

	public int aumentarVolume(int volume) {
		
		if(volume == 1 || volume <10) {
			this.volume = volume;
			return this.volume;	
		} else {
			return this.volume;
			
		}	
	}
	public int diminuirVolume(int volume) {
				
		if(volume == 10 || volume >= 1) {
			this.volume = volume;
			return this.volume;
		} else {
			return this.volume;
		}
	}
	
     public int subircanal(int canal) {
		
		if(canal == 2 || canal <11) {
			this.canal = canal;
			return this.canal;	
		} else {
			return this.canal;
			
		}	
	}
	public int descercanal(int canal) {
				
		if(canal == 11 || canal >= 2) {
			this.canal = canal;
			return this.canal;
		} else {
			return this.canal;
		}
	}
	
	
	
	}
	
	
	

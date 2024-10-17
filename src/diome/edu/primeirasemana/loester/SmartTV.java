package diome.edu.primeirasemana.loester;

public class SmartTV {

	private boolean ligada = false;
	private int canal = 1;
	private int volume = 25;

	public SmartTV() {
		this.setCanal(1);
		this.setVolume(25);
		this.setLigada(false);
	}

	public SmartTV(boolean ligada, int canal, int volume) {
		this.ligada = ligada;
		this.canal = canal;
		this.volume = volume;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void ligar() {
		this.setLigada(true);
		System.out.println("TV Ligada");
	}

	public void desligar() {
		this.setLigada(false);
		System.out.println("TV Desligada");
	}

	public void aumentarVolume() {
		this.volume++;
		ValidarVolume();
		System.out.printf("Volume aumentado para %d \n", this.getVolume());
	}

	public void diminuirVolume() {
		this.volume--;
		ValidarVolume();
		System.out.printf("Volume aumentado para %d \n", this.getVolume());
	}

	private void ValidarVolume() {
		if (this.getCanal() <= 0) {
			this.setCanal(0);
		}

		if (this.getCanal() >= 100) {
			this.setCanal(100);
		}
	}
	
	private void ValidarCanal() {
		if (this.getCanal() <= 0) {
			this.setCanal(100);
		}

		if (this.getCanal() >= 100) {
			this.setCanal(1);
		}
	}

	public void mudarCanalMaior() {
		this.canal++;

		ValidarCanal();

		System.out.printf("Canal Mudado para %d \n", this.getCanal());
	}

	public void mudarCanalMenor() {
		this.canal--;

		ValidarCanal();

		System.out.printf("Canal Mudado para %d \n", this.getCanal());
	}

	@Override
	public String toString() {
		return "SmartTV [ligada=" + ligada + ", canal=" + canal + ", volume=" + volume + "]";
	}
}

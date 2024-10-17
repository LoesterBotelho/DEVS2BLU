package diome.java.basico.aula01;

import diome.edu.primeirasemana.loester.SmartTV;

public class TesteTV {

	public static void main(String[] args) {
		SmartTV myTV = new SmartTV();
		
		myTV.ligar();
		
		myTV.aumentarVolume();
		myTV.aumentarVolume();
		myTV.aumentarVolume();
		myTV.aumentarVolume();
		
		myTV.mudarCanalMaior();
		myTV.mudarCanalMaior();
		myTV.mudarCanalMaior();
		myTV.mudarCanalMaior();
		myTV.mudarCanalMaior();
		myTV.mudarCanalMaior();
		
		myTV.mudarCanalMenor();
		
		myTV.desligar();
		
	}
	

}

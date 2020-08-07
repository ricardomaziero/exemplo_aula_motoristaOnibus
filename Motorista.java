package motoristaOnibus;

public class Motorista {
	
	private int matricula;
	private String nome;
	
	public Motorista() {}
	
	public void dirigir(Onibus onibus) {
		onibus.ligar();
		onibus.acelerar();
		onibus.virarDireita();
		onibus.frear();
		onibus.virarEsquerda();
		onibus.marchaRe();
		onibus.desligar();		
	}

}

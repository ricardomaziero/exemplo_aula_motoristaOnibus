package motoristaOnibus;

public class PrincipalBus {

	public static void main(String[] args) {
		Onibus onibus = new Onibus();
		Motorista motorista = new Motorista();
		motorista.dirigir(onibus);
	}

}

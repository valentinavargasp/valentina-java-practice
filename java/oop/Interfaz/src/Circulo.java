
public class Circulo implements Figura, Dibujable, Rotable {
	
	private double radio;

	public Circulo() {
	}



	public Circulo(double radio) {
		this.radio = radio;
	}



	@Override
	public double calcularArea() {
		double pi = 3.14;
		double resultado = pi * radio * radio; // radio * radio porque es pi por radio al cuadrado.
		return resultado;
	}



	@Override
	public void rotar() {
		System.out.println("Hola, estoy rotando un círculo.");
	}



	@Override
	public void dibujar() {
		System.out.println("Hola! estoy dibujando un círculo.");
		
	}

}

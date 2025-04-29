
public class Squirtle extends Pokemon implements IAgua {

	public Squirtle() {
	}

	// Métodos pokemones
	@Override
	protected void atacarPlacaje() {
		System.out.println("Hola, soy Squirtle y este es mi ataque placaje");

	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Hola, soy Squirtle y este es mi ataque arañazo");

	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Hola, soy Squirtle y este es mi ataque mordizco");

	}

	// Métodos tipo agua
	@Override
	public void atacarHidrobomba() {
		System.out.println("Hola, soy Squirtle y este es mi ataque hidrobomba");

	}

	@Override
	public void atacarBurbuja() {
		System.out.println("Hola, soy Squirtle y este es mi ataque burbuja");

	}

	@Override
	public void atacarPistolaAgua() {
		System.out.println("Hola, soy Squirtle y este es mi ataque pistola de agua");

	}

	@Override
	public void atacarHidropulso() {
		System.out.println("Hola, soy Squirtle y este es mi ataque hidro pulso");

	}

}

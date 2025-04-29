
public class Pikachu extends Pokemon implements IElectrico {

	public Pikachu() {
	}

	// Métodos pokemones
	@Override
	protected void atacarPlacaje() {
		System.out.println("Hola, soy Pikachu y este es mi ataque placaje");

	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Hola, soy Pikachu y este es mi ataque arañazo");

	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Hola, soy Pikachu y este es mi ataque mordizco");

	}

	// Métodos tipo eléctrico
	@Override
	public void atacarImpactrueno() {
		System.out.println("Hola, soy Pikachu y este es mi ataque impactrueno");

	}

	@Override
	public void atacarPuniotrueno() {
		System.out.println("Hola, soy Pikachu y este es mi ataque puño trueno");

	}

	@Override
	public void atacarRayo() {
		System.out.println("Hola, soy Pikachu y este es mi ataque rayo");

	}

	@Override
	public void atacarRayoCarga() {
		System.out.println("Hola, soy Pikachu y este es mi ataque rayo carga");

	}

}


public class Bulbasaur extends Pokemon implements IPlanta {

	public Bulbasaur() {
	}

	// Métodos pokemones
	@Override
	protected void atacarPlacaje() {
		System.out.println("Hola, soy Bulbasaur y este es mi ataque placaje");
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Hola, soy Bulbasaur y este es mi ataque arañazo");
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Hola, soy Bulbasaur y este es mi ataque mordizco");
	}

	// Métodos tipo Planta

	@Override
	public void atacarParalizar() {
		System.out.println("Hola, soy Bulbasaur y este es mi ataque paralizar");

	}

	@Override
	public void atacarDrenaje() {
		System.out.println("Hola, soy Bulbasaur y este es mi ataque drenaje");

	}

	@Override
	public void atacarHojaAfilada() {
		System.out.println("Hola, soy Bulbasaur y este es mi ataque hoja afilada");

	}

	@Override
	public void atacarLatigoCepa() {
		System.out.println("Hola, soy Bulbasaur y este es mi ataque latigo cepa");

	}

}

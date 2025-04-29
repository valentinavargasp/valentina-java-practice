
public abstract class Pokemon {

	// Todos los pokemones van a poder heredar de esta clase sus atributos y
	// métodos.

	protected int numPokedex; // protected -> solo las hijas tienen acceso
	protected String nombre;
	protected double peso;
	protected String sexo;
	protected int temporada;

	protected abstract void atacarPlacaje();

	protected abstract void atacarAraniazo();

	protected abstract void atacarMordisco();

}

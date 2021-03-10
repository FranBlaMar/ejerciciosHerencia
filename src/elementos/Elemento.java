package elementos;

public abstract class Elemento {
	protected char simbolo;

	public Elemento(char simbolo) {
		super();
		this.simbolo = simbolo;
	}

	@Override
	public String toString() {
		return  ""+simbolo+"";
	}
}

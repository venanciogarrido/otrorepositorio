package clases;

public class UnaClase {
	int atributoDeUnaClase;

	public int getAtributoDeUnaClase() {
		return atributoDeUnaClase;
	}

	public void setAtributoDeUnaClase(int atributoDeUnaClase) {
		this.atributoDeUnaClase = atributoDeUnaClase;
	}

	@Override
	public String toString() {
		return "UnaClase [atributoDeUnaClase=" + atributoDeUnaClase + ", getAtributoDeUnaClase()="
				+ getAtributoDeUnaClase() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}

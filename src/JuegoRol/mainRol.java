package JuegoRol;

public class mainRol {

	public static void main(String[] args) throws PersonajeException{
		try {
		Mago m1 = new Mago ("paco", "Humano", 16, 19, 80);
		System.out.println(m1);
		}catch(PersonajeException E) {
			System.out.println(E.getMessage());
		}
		
	}

}

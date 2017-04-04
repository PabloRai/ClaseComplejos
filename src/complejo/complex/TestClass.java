package complejo.complex;

public class TestClass {

	public static void main(String[] args) {
		Complejo c1 = new Complejo(4,3);
		Complejo c2 = new Complejo(1,-2);
		Complejo c3 = c1.dividir(c2);
		System.out.println(c3.toString());
		System.out.println(c1.aPolar().toString());
		
	}

}

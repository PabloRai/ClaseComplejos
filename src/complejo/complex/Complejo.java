package complejo.complex;

public class Complejo {
	float real;
	float imaginario;
	public float getReal() {
		return real;
	}
	public void setReal(float real) {
		this.real = real;
	}
	public float getImaginario() {
		return imaginario;
	}
	public void setImaginario(float imaginario) {
		this.imaginario = imaginario;
	}
	public Complejo(float real, float imaginario) {
		super();
		this.real = real;
		this.imaginario = imaginario;
	}
	public Complejo suma(Complejo c1){
		return new Complejo(c1.real+this.real,c1.imaginario+this.imaginario);
	}
	public Complejo suma(int real){
		return new Complejo(this.real + real,this.imaginario);
	}
	public Complejo resta(int real){
		return new Complejo(this.real - real,this.imaginario);
	}
	
	public Complejo resta(Complejo c1){
		return new Complejo(c1.real-this.real, c1.imaginario-this.imaginario);
	}
	
	public Complejo mult(Complejo c1){
		//(ac − bd) + (ad + bc)i
		return new Complejo(c1.real*this.real-c1.imaginario*this.imaginario,c1.real*this.imaginario+c1.imaginario*this.real);
	}
	public Complejo mult(int real){
		return new Complejo(this.real*real,this.imaginario*real);
	}
	
	public Complejo dividir(Complejo c1){
		float denominador = (float) Math.pow(c1.real, 2) + (float) Math.pow(c1.imaginario, 2);
		return new Complejo((c1.real*this.real+c1.imaginario*this.imaginario)/denominador,(c1.imaginario*this.real-c1.real*this.imaginario)/denominador);
	}
	
	public Complejo dividir(int real){
		return new Complejo(this.real/real,this.imaginario/real);
	}
	
	@Override
	public String toString() {
		return Float.toString(real) + "," +  Float.toString(imaginario) + "i";
	} 
	//arcotang(imaginario/real)
	
	public Complejo aPolar(){
		return new Complejo((float) Math.sqrt((Math.pow(this.real,2)+Math.pow(this.imaginario, 2))),(float) Math.toDegrees(Math.atan2(this.imaginario, this.real)));
	}

}

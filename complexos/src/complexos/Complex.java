package complexos;

public class Complex {
    private double real;
    private double imag;

 public Complex() {
    real=0.0;
    imag=0.0;
 }
 public Complex(double real, double imag){
    this.real=real;
    this.imag=imag;
 }

 public static Complex suma(Complex c1, Complex c2){
     double x=c1.real+c2.real;
     double y=c1.imag+c2.imag;
     return new Complex(x, y);
  }
 
 public static Complex producte(Complex c, double d){
     return new Complex(c.real*d, c.imag*d);
 }
 
 public static Complex producte(double d, Complex c){
     return new Complex(c.real*d, c.imag*d);
 }
 
  public static Complex quocient(Complex c1, Complex c2){
	     double aux, x, y;
	     aux=c2.real*c2.real+c2.imag*c2.imag;
	     x=(c1.real*c2.real+c1.imag*c2.imag)/aux;
	     y=(c1.imag*c2.real-c1.real*c2.imag)/aux;
	     return new Complex(x, y);
	  }
}
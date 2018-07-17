package lecture;

public class Calculator {
    double a, b;
    public Calculator(double a, double b) {
	this.a = a;
	this.b = b;	
    }

    public double plus() {
	return a + b;
    }

    public double minus() {
	return a - b;
    }

    public double multiply() {
	return a * b;
    }    

    public double divide() {
	return a / b;
    }        
    
}

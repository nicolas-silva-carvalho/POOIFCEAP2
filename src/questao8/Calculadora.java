package questao8;

//Sobrecarga de MÃ©todos:    
//Crie uma classe `Calculadora` com mÃ©todos sobrecarregados para realizar operaÃ§Ãµes matemÃ¡ticas
//com diferentes tipos de argumentos (int, double, etc.).

public class Calculadora {
	public int somar(int x, int y) {
		return x + y;
	}
	
	public double somar(double x, double y) {
		return x + y;
	}
	
	public int subtrair(int x, int y) {
		return x - y;
	}
	
	public double subtrair(double x, double y) {
		return x - y;
	}
	
	public int multiplicar(int x, int y) {
		return x * y;
	}
	
	public double multiplicar(double x, double y) {
		return x * y;
	}
	
	public int dividir(int x, int y) {
		return x / y;
	}
	
	public double dividir(double x, double y) {
		return x / y;
	}
}

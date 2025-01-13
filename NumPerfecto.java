package tema3_java;

public class NumPerfecto {
	public static void main(String[] args) {

		int suma = 0;
		int numero = 28;
		int i = 1;

		do {
			if (numero % i == 0) {
				suma += i;
			}
			i++;
		} while (i <= (numero / 2));
		if (numero % suma == 0) {
			System.out.println("El numero: " + numero + " es perfecto");
		} else {
			System.out.println("El numero: " + numero + " no es perfecto");
		}
	}
}
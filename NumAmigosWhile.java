package tema3_java;

public class NumAmigosWhile {
	
	public static int sumaDiv(int numero) {
		int i = 1;
		int suma = 0;
		while(i < numero) {
			if(numero % i == 0) {
				suma += i;
			}
			i++;
		}
		return suma;
	}

    /*public static int sumaDiv(int numero) {
        int suma = 0;
       for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma;
    }
    */

    public static void main(String[] args) {
        int num1 = 220;
        int num2 = 284;

        int suma1 = sumaDiv(num1);
        int suma2 = sumaDiv(num2);

        if (suma1 == num2 && suma2 == num1) {
            System.out.println(num1 + " y " + num2 + " son numeros amigos.");
        } else {
            System.out.println(num1 + " y " + num2 + " no son números amigos.");
        }
    }
}

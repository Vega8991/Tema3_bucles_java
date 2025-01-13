package tema3_java;

public class NumerosAmigos {

    public static int sumaDivisores(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int numero1 = 1180;
        int numero2 = 1210;

        int suma1 = sumaDivisores(numero1);
        int suma2 = sumaDivisores(numero2);

        if (suma1 == numero2 && suma2 == numero1) {
            System.out.println(numero1 + " y " + numero2 + " son numeros amigos.");
        } else {
            System.out.println(numero1 + " y " + numero2 + " no son números amigos.");
        }
    }
}


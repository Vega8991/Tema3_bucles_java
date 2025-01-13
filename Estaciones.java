package tema3_java;

public class Estaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes = 4; // julio
		String estacion;

		switch (mes) {
		case 1:
		case 2:
		case 12:
			estacion = "invierno";
			break;
		case 6:
		case 7:
		case 8:
			estacion = "verano";
			break;
		case 3:
		case 4:
		case 5:
			estacion = "primavera";
			break;
		default:
			estacion = "Otono";
		}
		System.out.println("estamo en la estacion de: " + estacion);
	}
}

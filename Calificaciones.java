package tema3_java;

public class Calificaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota = 10;
		
		switch(nota) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("No valido");
		}
	}

}

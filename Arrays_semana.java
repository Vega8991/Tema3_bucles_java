package tema3_java;
public class Arrays_semana {

	public static void main(String[] args) {
		String[] weekDays = new String[7];
		weekDays[0] = "Lunes";
		weekDays[1] = "Martes";
		weekDays[2] = "Miercoles";
		weekDays[3] = "Jueves";
		weekDays[4] = "Viernes";
		weekDays[5] = "Sabado";
		weekDays[6] = "Domingo";

		int[] primes = { 2, 3, 5, 7, 11, 13, 17 };

		for (int i = 0; i < 7; i++) {
			System.out.println(weekDays[i]);
			System.out.println(primes[i]);
		}
	}
}
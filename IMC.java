package tema3_java;

public class IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int peso=50;
		double estatura= 1.70;
		double IMC = peso/Math.pow(estatura, 2);
		
		System.out.println("La persona tiene un peso de " + peso);
		
		if(IMC<16) {
			System.out.println("delgadez severa");
		}else if(IMC<17) {
			System.out.println("delgadez moderada");
		}else if(IMC<18.5){
			System.out.println("delgadez leve");
		}else if(IMC<25) {
			System.out.println("Peso normal");
		}
	}

}

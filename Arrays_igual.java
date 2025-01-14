package tema3_java;
public class Arrays_igual {
    public static void main(String[] args) {
        int array[]= {1,5,3,7,6,8,9};
        int numero=6;
        for(int i=0; i<array.length;i++){
            if(numero==array[i]){
                System.out.println("Encontrado");
                i=array.length;
            }
        }
    }
}

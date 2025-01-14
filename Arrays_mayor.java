package tema3_java;
public class Arrays_mayor {
    public static void main(String[] args) {
        int array[]= {1,3,4,1,8,7,2};
        int mayor= array[0];
        for(int i=0; i<array.length;i++){
            if(mayor<array[i]){
                mayor=array[i];
            }
        }
        System.out.println("Numero mayor: " + mayor);
    }
}

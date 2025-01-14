package tema3_java;
public class Arrays_menor {
    public static void main(String[] args) {
        int array[]= {1,3,4,1,8,7,2};
        int menor= array[0];
        for(int i=0; i<array.length;i++){
            if(menor>array[i]){
                menor=array[i];
            }
        }
        System.out.println("Numero menor: " + menor);
    }
}

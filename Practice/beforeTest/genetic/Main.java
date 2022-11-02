package beforeTest.genetic;

public class Main {
    public static void main(String[]args){

        ObjectDynamicArray arr = new ObjectDynamicArray();
        for(int i = 0; i<35; i++){
            arr.add(i);
        }
        for(int i  = 0 ; i<35; i++){
            System.out.printf("%d 번째 %d\n",i,(int)arr.get(i));
        }

        System.out.println("for each use");

        for(Object obj:arr){
            System.out.println(obj);
        }
    }
}

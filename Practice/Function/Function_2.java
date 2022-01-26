package Function;

public class Function_2 {

     static int d(int n){
        int result = n;
        while(n!=0){
            result += n%10;
            n = n/10;
        }
        return result;
    }

    public static void main(String[] args) {

        boolean array[] = new boolean [10000];

        for(int i =0; i<10000;i++){

            int result = d(i);
            if(result<10000){
                array[result] = true;
            }

        }

        for(int i =0; i<10000; i++){
            if(array[i] ==false) System.out.println(i);
        }
    }
}


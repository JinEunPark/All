package BeforeAlgoTest.dynamicprograming;

public class Fibonacci {

    public void fibo(int i){
        int f[] = new int[i];
        f[0] = 0;
        f[1] = 1;
        for(int e = 2; e< i; e++){
            f[e] = f[e-1]+ f[e-2];
            System.out.println(f[e]);
        }
    }

}

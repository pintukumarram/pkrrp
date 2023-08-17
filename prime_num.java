/*class prime{
    int n=10;
    static boolean isPrime(int n){ 
    public void show(){ 
     {
        if(n==1 || n==0)
        return false;
        for(int i=2;i<n;i++){
            if(n%i==0)
            return false;
        }
        return true;
    }   
    }

}
    

public class prime_num {


    public static void main(String[] args) {
        int n=20;
       prime pobj = new prime();
      // pobj.show();
for(int i=1;i<=n;i++){
    //if(isPrime(i)){
        System.out.println(i+" ");
    }

}

    }*/
    class Prime {
    // This method checks if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

public class prime_num {
    public static void main(String[] args) {
        int n = 100;

        for (int i = 1; i <= n; i++) {
            if (Prime.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}


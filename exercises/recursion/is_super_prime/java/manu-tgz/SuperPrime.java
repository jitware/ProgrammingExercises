public class SuperPrime {

    public static boolean isPrime(int n){
        if (n%2==0 && n!=2){
            return false;
        }
        for (int i = 3; i <Math.sqrt(n) ; i+=2) {
            if(n%i==0){return false;}
        }
        return true;
    }
    public static boolean isSuperPrime(int n) {
        if(n<=0){
            return false;
        }
        return isSuperPrimeAux(n);
    }
    public static boolean isSuperPrimeAux(int n) {
        if(n==0){
            return true;
        }
        if(isPrime(n)){
            return isSuperPrimeAux(n/10);
        }
        return false;
    }
}

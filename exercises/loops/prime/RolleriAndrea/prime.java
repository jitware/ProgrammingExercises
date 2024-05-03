package loops;

import java.util.LinkedList;
public class Prime {


	public boolean isPrime(int n) {
		for(int i =2;i<=n/2;i++) {
			if(n%i ==0) {
				return false;
			}
		}
		return true;
	}
	public int closestPrime(int n) {
		int x =n+1;
		int y=n-1;
		while(!(isPrime(x)||isPrime(y))){
			x++;
			y--;
		}
		if(isPrime(x)) {
			return x;	
		}
		return y;
		
	}
	
	public int nThPrime(int n) {
		int i= 0;
		int x= 2;
		while(i<n) {
		if(isPrime(++x)) {
			i++;
		}
		}
		return x;
	}
	private LinkedList<Integer> primeList = new LinkedList<>();
	public LinkedList<Integer> toPrimeList(int n){
		int x=2;
		while(x<=n) {
		if(isPrime(x)) {
			primeList.add(x);
			
		}
		x++;
		}
		return primeList;
	}
	
	private LinkedList<Integer> primeFactors = new LinkedList<>();
	
	
	public LinkedList<Integer> primeFactorization(int n){
	    if(isPrime(n)) {
	    	primeFactors.add(n);
	    	return primeFactors;
	    }
	    LinkedList<Integer> primeList = toPrimeList(n);		
		for (Integer integer : primeList) {
			while ((n% integer)==0) {
				n/=integer;
				primeFactors.add(integer);
			}
		     
		}
		
		return primeFactors;
	}
	
	
		
		
	
	
		
}

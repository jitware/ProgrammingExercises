package loops;

import java.util.LinkedList;

public class Prime {

//checks if the number is divisible by every number from 2(since it is always divisible by 1 and 0)
// to half of the number(since it any division of n from n/2 to n-1 will always produce a number
// 1<x<2	
	public boolean isPrime(int n) {
		// 0 and 1 are considered not to be primes
		if(n<=1) {
			return false;
		}
		for(int i =2;i<=n/2;i++) {
			//if it can be divided by a number so the remain is 0 it means that n is not prime
			if(n%i ==0) {
				return false;
			}
		}
		// if you can get past the for cycle it means that n is prime
		return true;
	}
	
	
	public int closestPrime(int n) {
		int x =n+1;
		int y=n-1;
		//keep cycling untill a prime is found
		while(!(isPrime(x)||isPrime(y))){
			x++;
			y--;
		}
		// if x is the first to be found return it, otherwise return  y 
		if(isPrime(x)) {
			return x;	
		}
		return y;
		
	}
	
	public int nThPrime(int n) {
		int i= 0;
		int x= 2;
		//keep cycling untill the nth prime is found
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
		//keep cycling untill all the prime numbers < n are in the list 
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
		// if n is a prime number then n only has himself as a factor  
	    if(isPrime(n)) {
	    	primeFactors.add(n);
	    	return primeFactors;
	    }
	    // make the list of all prime numbers <n
	    LinkedList<Integer> primeList = toPrimeList(n);		
		for (Integer integer : primeList) {
			// add a prime factor to the list, and devide n by the added prime
			while ((n% integer)==0) {
				n/=integer;
				primeFactors.add(integer);
			}
		     
		}
		
		return primeFactors;
	}	
}

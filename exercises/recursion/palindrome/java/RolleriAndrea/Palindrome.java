package solutions;

public class Palindrome {

	public boolean palindrome(String string) {
		char[] charArray = string.toCharArray();
		
		for(int i=0,j=charArray.length-1; i<=j && j>=i;i++,j--) {
			if(charArray[i]!= charArray[j]) {
				return false;
			}
		}
		
		
		return true;
	}
	public boolean recursivePalindromeAux(char[] c, int n, int m) {
		if(n>=m) {
			return true;
		}
		if(c[n]!= c[m]) {
			return false;
		}
		
		return recursivePalindromeAux(c,n+1,m-1);
	}
	
	public boolean recursivePalindrome(String string) {
		
		char[] charArray = string.toCharArray();
		return recursivePalindromeAux(charArray, 0, charArray.length-1);
		
		
	}
}

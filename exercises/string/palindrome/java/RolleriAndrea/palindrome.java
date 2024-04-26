public class Palindrome {

	public boolean palindrome(String string) {
		char[] charArray = string.toCharArray();
		// set i at the beggining of the array and j at the end, and they move closer at
        // every cycle, if the letters are always the same until i ==j then the string is 
        // palindrome, otherwise it isn't
		for(int i=0,j=charArray.length-1; i<=j && j>=i;i++,j--) {
			if(charArray[i]!= charArray[j]) {
				return false;
			}
		}
			
		return true;
	}
}
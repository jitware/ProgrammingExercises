package solutions;

public class ThisInSoup {

	//String word = "pelo"; 
	char[][] soup = { 
		{ 'a', 'a', 'f', 't', 'j', 'q', 'w', 'e', 'r', 'o', 'p' }, 
		{ 'g', 'j', 'p', 'b', 'j', 'e', 'r', 'o', 'a', 's', 'k' }, 
		{ 'l', 'x', 'c', 'e', 't', 'y', 'e', 'r', 'a', 'o', 'n' }, 
		{ 'b', 'g', 'j', 'f', 'l', 'd', 'e', 'r', 's', 't', 'o' }, 
		{ 'q', 'u', 'e', 'r', 't', 'o', 'g', 's', 'e', 'm', 't' } };
	
	public boolean possibleWords (int a, int b, String word) {
		char[] wordArray = word.toCharArray();
		char[] result = new char[word.length()];
		boolean end = true;
		//destra
		if(soup[0].length-b>=word.length()) {
			for(int j=0;j<word.length();j++) {
				result[j] = soup[a][b+j];
				if(wordArray[j] != result[j]) {
					end = false;
					break;
				}
			}
		}
		if(end == true) {
			return true;
		}
			end = true;
		//basso
		if(soup.length-a>=word.length()) {
			for( int i=0;i<word.length();i++) {
				result[i] = soup[a+i][b];
				if(wordArray[i] != result[i]) {
					end = false;
					break;
				}
			}
			if(end == true) {
				return true;
			}
				end = true;
		}
		
		// diagonale basso destra
		int d =0;
		if(soup[0].length-b>=word.length()&& soup.length-a>=word.length()) {
			for(int i=0, j=0;i <word.length();i++,j++) {
				result [d++] = soup[a+i][b+j];
				if(wordArray[i] != result[i]) {
					end = false;
					break;
				}
			}
			if(end == true) {
				return true;
			}
				end = true;
			
		}
		
		
		
		
		
		return false;
	}
		
	
	public boolean thisInSoup( String a) {
		char[] wordArray = a.toCharArray();
		boolean result = false;
		
		for(int i=0;i<soup.length;i++) {
			for(int j=0;j<soup[0].length;j++) {
				if(wordArray[0]==soup[i][j]) {
					
					result = possibleWords(i, j, a);
					if(result== true) {
						return true;
					}
				}
				
			}
		}
				
		return false;

	}
	
		
}
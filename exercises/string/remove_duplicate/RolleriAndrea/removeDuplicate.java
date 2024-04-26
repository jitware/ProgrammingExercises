package solutions;

import java.util.ArrayList;

public class RemoveDuplicate {
	
	public String deleteDuplicate(String stringa) {

        //create an arrayList in order to store the non duplicate characters
		ArrayList<Character> noDuplicate = new ArrayList<>();
        
		char[] stringArray= stringa.toCharArray();
        // if a character in not into the list already after a cycle, add it to the list,
        // otherwise move to the next char.
		for(int i =0; i<stringArray.length;i++) {
			boolean uguale = false;
			for( int j=0; j<noDuplicate.size();j++) {
				if (noDuplicate.get(j)== stringArray[i]) {
					uguale = true;
				}
			}
			if(!uguale) {
				noDuplicate.add(stringArray[i]);
			}
		}
		
		return new String(listToChar(noDuplicate));
	}
	
	
	public char[] listToChar (ArrayList<Character> a) {
        // convert an arrayList of char into an Array of char
		char[] charList = new char[a.size()];
		
		for(int i=0;i<charList.length;i++) {
			charList[i] = a.get(i);
		}
		
		return charList;
	}
		
}
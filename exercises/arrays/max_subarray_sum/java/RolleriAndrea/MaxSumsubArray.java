package solutions;

public class MaxSumSubArray {
	
	public int max(int[] a) {
		int max = a[0];
		for(int i =1; i<a.length;i++) {
			if( a[i]>max) {
				max = a[i];
			}
		}
		return max;	
	}

	public int sumSub(int[] array) {
		int somma =0;
		int max=max(array);
		int x=1;
		for( int i =0; i<array.length;i++) {
			somma = array[i];
			while(x<array.length) {
			
			if(somma >max) {
				max= somma;
			}
			somma += array[x++];
			
			}
			x=i+2;
		}
		
		return max;
	}
}

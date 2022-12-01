package sorting;

public class bubbleSort {
	
	//Top means Higher no will be bubble at the top position
	//88, 323, 12, 98, 13, 0, 394, 29
	
	//How? -> top element -> compare with the prev element
	//O(n^2)
	
	public void bubbleSort(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-i-1; j++) {	//last element is already at it's place
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int a: arr) {
			System.out.print(a+" ");
		}
		
	}
	
	
}

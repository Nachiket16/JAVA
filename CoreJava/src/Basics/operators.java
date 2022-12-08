package Basics;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer [] arr= {1,2,3,4,5};
		
		System.out.println(odd_even_product(arr));
		
	}	
	public static Integer odd_even_product( Integer[] my_list ) {
		 //Insert your code here 
		  Integer total=0;
		 Integer sum=0;
		 for(int i=0; i<my_list.length; i++)
		 {
		 
		 	total = total*my_list[i];
			sum=sum + my_list[i];
		 }
		 
		 if(total%2==0)
		 	return sum;
		
		 return 0;
	}


}

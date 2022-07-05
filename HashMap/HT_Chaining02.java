   import java.util.*;
class Chaining{
	int size;
	ArrayList<LinkedList<Integer>> table;
	Chaining(int s){
		size = s;
		table = new ArrayList<LinkedList<Integer>>();
		for(int i=0; i<s; i++){
			table.add(new LinkedList<Integer>());
}
	//Insert search Delete
	
}
	void Insert(int n){
		int slot = n % size;
		table.get(slot).add(n);
}
	boolean Search(int n){
		int slot = n % size;
		return table.get(slot).contains(n);
}
	void Delete(Integer k){
		int slot = k % size;
		table.get(slot).remove(k);
}
}
class Hash{
	public static void main(String args[]){
		Chaining h = new Chaining(7);
		h.Insert(10);
		h.Insert(15);
		h.Insert(20);
		System.out.println(h.Search(10));		
		System.out.println(h.Search(11));
		h.Delete(10);
		System.out.println(h.Search(10));
}
}

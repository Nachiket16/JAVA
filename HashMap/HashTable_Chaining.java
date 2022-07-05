//import java.util.ArrayList;
import java.util.*;
class MyHash{
	int size; //Reference
	ArrayList<LinkedList<Integer>> table;// Reference
     MyHash(int b)
	{
		size = b; 
		table = new ArrayList<LinkedList<Integer>>();
		for(int i=0; i<b; i++)
			table.add(new LinkedList<Integer>());
	}
    void insert(Integer k)
    {
        int i = k % size;
        table.get(i).add(k);
    }
    boolean search(Integer k)
    {
        int i = k % size;
        return table.get(i).contains(k);
    }
    void delete(Integer k)
    {
        int i = k % size;
        table.get(i).remove(k);
    }

}

class HashTable{
	public static void main (String [] args){
		MyHash mh = new MyHash(7);
 	    mh.insert(10);
	    mh.insert(20);
	    mh.insert(15);
	    mh.insert(7);
	    System.out.println(mh.search(10));
	    mh.delete(15);
	    System.out.println(mh.search(15));
}
}

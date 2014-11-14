import java.util.*;

public class ArrayListMethods{
    public static void main(String[]args){
	ArrayList<Integer> L = new ArrayList<Integer>();
	L.add(new Integer(1));
	L.add(new Integer(1));
	L.add(new Integer(1));
	L.add(new Integer(2));
	L.add(new Integer(2));
	L.add(new Integer(2));
	L.add(new Integer(2));
	L.add(new Integer(3));
	L.add(new Integer(3));
	L.add(new Integer(1));
	System.out.println(L.toString());
	collapseDuplicates(L);
	System.out.println(L.toString());

	ArrayList<Integer> P = new ArrayList<Integer>();
	P.add(new Integer(1));
	P.add(new Integer(2));
	P.add(new Integer(3));
	P.add(new Integer(4));
	P.add(new Integer(5));
	P.add(new Integer(6));
	System.out.println(P.toString());
	randomize(P);
	System.out.println(P.toString());
    }

    public static void collapseDuplicates(ArrayList<Integer> hi){
	int x = 0;
	int y = 0;
	while (x<hi.size()-1){	    
	    y = hi.get(x);
	    while (hi.get(x+1)==y){		
		hi.remove(x+1);		
	    }	    
	    x++;
	}
    }

    public static void randomize(ArrayList<Integer> hello){
	Random rand = new Random();
	int x = hello.size();
	while (x>0){
	    hello.add(hello.remove(rand.nextInt(x)));
	    x--;
	}
    }
}

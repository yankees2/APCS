import java.util.ArrayList;

public class collapse{
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
    }

    public static void collapseDuplicates(ArrayList<Integer> hi){
	int x = 0;
	int y = 0;
	while (x<hi.size()){
	    y = hi.get(x);
	    int z = x;
	    boolean yo = true;
	    while (z<hi.size()-1 && yo){
		if (hi.get(z+1)==y){
		    hi.remove(z+1);
		} else {
		    yo = false;
		}
		z++;
	    }
	    x++;
	}
    }
}

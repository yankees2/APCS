public class driver{
    public static void main(String[]args){
	SuperArray a = new SuperArray();
	try{
	    System.out.println(a.toString());
	    a.add(0,1);
	    a.add(1,2);
	    a.add(2,3);
	    a.add(3,4);
	    a.add(4,5);
	    a.add(5,6);
	    a.add(6,7);
	    a.add(7,8);
	    a.add(8,9);
	    a.add(9,10);
	    System.out.println(a.toString());
	    System.out.println(a.remove(9));
	    System.out.println(a.remove(8));
	    System.out.println(a.remove(7));
	    System.out.println(a.remove(6));
	    System.out.println(a.remove(5));
	    System.out.println(a.toString());
	    System.out.println(a.getCap());
	    a.add(7,6);
	}
	catch(IndexOutOfBoundsException e){
	    System.out.println("Index out of range");
	}
	// a.add(2,"hello");
	// System.out.println(a.size());
	// System.out.println(a.toString());
	// a.resize(8);
	// System.out.println(a.size());
	// a.clear();
	// System.out.println(a.toString());
	// System.out.println(a.set(0,"hello"));
	// System.out.println(a.get(0));
	// System.out.println(a.remove(0));
	// System.out.println(a.toString());
    }
}

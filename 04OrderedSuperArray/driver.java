public class driver{
    public static void main(String[]args){
	OrderedSuperArray a = new OrderedSuperArray();
	try{
	    System.out.println(a.toString());
	    System.out.println(a.size());
	    a.add("hello");
	    System.out.println(a.toString());
	    System.out.println("hell".compareTo("hello"));
	    a.add("hell");
	    a.add("shake");
	    a.add("shack");
	    a.add("baseball");
	    System.out.println(a.toString());
	}
	catch(IndexOutOfBoundsException e){
	    System.out.println("Index out of range");
	}
    }
}
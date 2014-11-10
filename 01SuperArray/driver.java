public class driver{
    public static void main(String[]args){
	SuperArray a = new SuperArray();
	System.out.println(a.toString());
	a.add(2,"hello");
	System.out.println(a.size());
	System.out.println(a.toString());
	a.resize(8);
	System.out.println(a.size());
	a.clear();
	System.out.println(a.toString());
	System.out.println(a.set(0,"hello"));
	System.out.println(a.get(0));
	System.out.println(a.remove(0));
	System.out.println(a.toString());
    }
}

public class driver{
    public static void main(String[]args){
	OrderedSuperArray a = new OrderedSuperArray();
	SuperArray A = new SuperArray();
	// try{
	//     a.add("hello");
	//     a.add("hell");
	//     a.add("shake");
	//     a.add("shack");
	//     a.add("baseball");
	//     System.out.println(a.toString());
	//     a.insertionSort();
	//     System.out.println(a.toString());
	// }
	// catch(IndexOutOfBoundsException e){
	//     System.out.println("Index out of range");
	// }

	for(int i = 0; i < 5000; i++){
	    A.add("" + i);
	}
	//System.out.println(A);
	A.insertionSort();
      	//System.out.println(A);
    }
}

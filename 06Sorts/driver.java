public class driver{
    public static void main(String[]args){
	int[] a = new int[10000];
	int x = 0;
	while (x<a.length){
	    a[x] = x;
	    x++;
	}
	long starttime = System.currentTimeMillis();
	Sorts.insertionSort(a);
	long endtime  = System.currentTimeMillis();
	System.out.println("Insertion sort: "+(endtime - starttime)+" ms");
	int[] b = new int[10000];
	x = 0;
	while (x<b.length){
	    b[x] = x;
	    x++;
	}
	starttime = System.currentTimeMillis();
	Sorts.bubble(b);
	endtime  = System.currentTimeMillis();
	System.out.println("Bubble sort: "+(endtime - starttime)+" ms");
	int[] c = new int[10000];
	x = 0;
	while (x<c.length){
	    c[x] = x;
	    x++;
	}
	starttime = System.currentTimeMillis();
	Sorts.selectionSort(c);
	endtime  = System.currentTimeMillis();
	System.out.println("Selection sort: "+(endtime - starttime)+" ms");
    }
}

public class driver{
    public static void main(String[]args){
	int[] a = new int[5];
	a[0]=3;
	a[1]=2;
	a[2]=5;
	a[3]=4;
	a[4]=1;
	System.out.println(a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]);
	Sorts.insertionSort(a);
        System.out.println(a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]);
    }
}

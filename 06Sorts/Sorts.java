public class Sorts{

    public static void bubble(int[] c){
	int x = 0;
	while (x<c.length){
	    if (c[x]>c[x+1]){
		swap(c,x,x+1);
		
    }

    public static void swap(int[] c,int a,int b){
	int x = c[a];
	c[a] = c[b];
	c[b] = x;
    }
	
	
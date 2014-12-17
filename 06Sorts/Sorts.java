public class Sorts{

    public static void bubble(int[] c){
	int inplace = 0;
	while (inplace < c.length){
	    int x = 0;
	    while (x<c.length-1-inplace){
		int count = 0;
		if (c[x]>c[x+1]){
		    swap(c,x,x+1);
		} else {
		    count++;
		}
		if (count==c.length-1-inplace){
		    break;
		}
		x++;
	    }
	    inplace++;
	}
    }

    public static void swap(int[] c,int a,int b){
	int x = c[a];
	c[a] = c[b];
	c[b] = x;
    }
}
	
	

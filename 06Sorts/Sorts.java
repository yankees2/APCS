public class Sorts{

    public String name(){
	return "Won,Brian";
    }

    public int period(){
	return 6;
    }

    public static void insertionSort(int[] c){
	int s = 0;
	if(c.length > 1){
	    int x = 1;
	    while (x<c.length){
		if(c[x]<c[x+1]){
		    s = c[x];
		    int y = x;
		    while(y > 0 && s < c[y-1]){
			c[y] = c[y-1];
			y--;
		    }
		    c[y] = s;
		}
		x++;
	    }
	}
    }

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
	
	

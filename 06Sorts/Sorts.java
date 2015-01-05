public class Sorts{

    public String name(){
	return "Won,Brian";
    }

    public int period(){
	return 6;
    }

    public static void insertionSort(int[] c){
	int x = 1;
	while (x<c.length){
	    int y = x-1;
	    int beingmoved = c[x];
	    loop: while (y>=0){
		if (c[y]>beingmoved){
		    c[y+1] = c[y];
		    if (y == 0){
			c[0] = beingmoved;
			break loop;
		    }
		} else {
		    c[y+1] = beingmoved;
		    break loop;
		}
		y--;
	    }
	    x++;
	}
    }

    public static void selectionSort(int[] c){
	int min;
	int x = 0;
	while (x<c.length-1){
	    min = c[x];
	    int toswap = x;
	    int y = x;
	    while (y<c.length){
		if (c[y]<min){
		    min = c[y];
		    toswap = y;
		}
		y++;
	    }
	    swap(c,x,toswap);
	    x++;
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
	
	

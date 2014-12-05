public class SuperArray{
    private int current;
    public String[] array;

    public SuperArray(){
	array = new String[10];
    }

    public SuperArray(int x){
	array = new String[x];
    }

    public int getCap(){
	return array.length;
    }

    public String toString(){
	String contents = "[ ";
	int index = 0;
	while (index < size()){
	    contents = contents + array[index] + " ";
	    index++;
	}
	contents = contents + "]";
	return contents;
    }

    public void add(int index, String s){
	if (size()==(array.length-1)){
	    resize(2*array.length);
	}
	if (index >= 0 && index < size()){
	    String[] holder = new String[array.length];
	    int x = 0;
	    while (x<index){
		holder[x] = array[x];
		x++;
	    }
	    holder[index] = s;
	    int y = index;
	    while (y<size()){
		holder[y+1] = array[y];
		y++;
	    }
	    array = holder;
	} else if (index==size()){
	    array[index] = s;
	} else {
	    throw new IndexOutOfBoundsException();
	}
    }

    public int size(){
	int x = 0;
	while (array[x]!=null){
	    x++;
	}
	return x;
    }

    public void resize(int newCapacity){
	String[] holder = new String[newCapacity];
	int a = 0;
	while (a < size()) {
	    holder[a] = array[a];
	    a++;
	}
	array = holder;
    }

    public void clear(){
	String[] cleared = new String[array.length];
	array = cleared;
    }

    public String get(int index){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	} else {
	    return array[index];
	}
    }

    public String set(int index, String s){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	} else {
	    String replaced = array[index];
	    array[index] = s;
	    return replaced;
	}
    }

    public String remove(int index){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	} else {
	    if (size()==(array.length/4 + 1)){
		resize(array.length/2);
	    }
	    String removed = array[index];
	    String[] holder = new String[array.length];
	    int a = 0;
	    while (a < index){
		holder[a] = array[a];
		a++;
	    }
	    int b = index + 1;
	    while (b < array.length){
		holder[b-1] = array[b];
		b++;
	    }
	    array = holder;
	    return removed;
	}
    }

    public void insertionSort(){
	int index = 1;
	String hold = "hi";
	int putin = 0;
	int fill = 0;
	boolean keepgoing;
	while (index<array.length){
	    keepgoing = true;
	    int check = index;
	    while (keepgoing && check>1){
		if (array[index].compareTo(array[check-2])>=0 && array[index].compareTo(array[check-1])<=0){
		    hold = array[index];
		    fill = index;
		    putin = check-1;
		    keepgoing = false;
		}
		check--;
		if (check==1){
		    hold = array[index];
		    fill = index;
		    putin = 0;
		}
	    }
	    while (fill>putin){
		array[fill] = array[fill-1];
	    }
	    array[putin] = hold;
	    index++;
	}
    }
}

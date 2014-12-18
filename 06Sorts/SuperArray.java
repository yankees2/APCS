public class SuperArray{
    private int current;
    private Object[] array;

    public SuperArray(){
	array = new Object[10];
    }

    public SuperArray(int x){
	array = new Object[x];
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

    public void add(int index, Object o){
	if (size()==array.length-1){
	    resize(2*array.length);
	}
	if (index >= 0 && index < size()){
	    Object[] holder = new Object[array.length];
	    int x = 0;
	    while (x<index){
		holder[x] = array[x];
		x++;
	    }
	    holder[index] = o;
	    int y = index;
	    while (y<size()){
		holder[y+1] = array[y];
		y++;
	    }
	    array = holder;
	} else if (index==size()){
	    array[index] = o;
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
	Object[] holder = new Object[newCapacity];
	int a = 0;
	while (a < size()) {
	    holder[a] = array[a];
	    a++;
	}
	array = holder;
    }

    public void clear(){
	Object[] cleared = new Object[array.length];
	array = cleared;
    }

    public Object get(int index){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	} else {
	    return array[index];
	}
    }

    public Object set(int index, Object o){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	} else {
	    Object replaced = array[index];
	    array[index] = o;
	    return replaced;
	}
    }

    public Object remove(int index){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	} else {
	    if (size()==(array.length/4 + 1)){
		resize(array.length/2);
	    }
	    Object removed = array[index];
	    Object[] holder = new Object[array.length];
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
}

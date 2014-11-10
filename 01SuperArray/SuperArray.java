public class SuperArray{
    private int current;
    private Object[] array;

    public SuperArray(){
	array = new Object[10];
    }

    public SuperArray(int x){
	array = new Object[x];
    }

    public String toString(){
	String contents = "[ ";
	int index = 0;
	while (index < array.length) {
	    contents = contents + array[index] + " ";
	    index++;
	}
	contents = contents + "]";
	return contents;
    }

    public void add(int index, Object o){
	Object[] holder;
	if (index >= array.length){
	    holder = new Object[index+1];
	    holder[index] = o;
	    int a = 0;
	    while (a < array.length){
		holder[a] = array[a];
		a++;
	    }
	} else {
	    int newLength = array.length + 1;
	    holder = new Object[newLength];
	    holder[index] = o;
	    int a = 0;
	    while (a < index){
		holder[a] = array[a];
		a++;
	    }
	    int b = index + 1;
	    while (b < holder.length){
		holder[b] = array[b-1];
		b++;
	    }
	}
	array = holder;
    }

    public int size(){
	return array.length;
    }

    public void resize(int newCapacity){
	Object[] holder = new Object[newCapacity];
	int a = 0;
	while (a < newCapacity) {
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
	    System.out.println("Index is out of range");
	    return null;
	} else {
	    return array[index];
	}
    }

    public Object set(int index, Object o){
	if (index < 0 || index >= array.length){
	    System.out.println("Index is out of range");
	    return null;
	} else {
	    Object replaced = array[index];
	    array[index] = o;
	    return replaced;
	}
    }

    public Object remove(int index){
	if (index < 0 || index >= array.length){
	    System.out.println("Index is out of range");
	    return null;
	} else {
	    Object removed = array[index];
	    Object[] holder = new Object[array.length-1];
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

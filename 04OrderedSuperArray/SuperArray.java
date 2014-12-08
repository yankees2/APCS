public class SuperArray{
    private int current;
    public String[] array;

    public SuperArray(){
	current = 0;
	array = new String[10];
    }

    public SuperArray(int x){
	current = 0;
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

    public void add(String o){
	if(size() == array.length){
	    resize(current*2);
	}
	array[current] = o;
	current++;
    }

    public int size(){
	return current;
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
	String s = "";
	if(size() > 1){
	    int x = 1;
	    while (x<size()){
		if(get(x).compareTo(get(x-1)) < 0){
		    s = get(x);
		    int y = x;
		    while(y > 0 &&s.compareTo(get(y-1)) < 0){
			set(y,get(y-1));
			y--;
		    }
		    set(y,s);
		}
		x++;
	    }
	}
    }

    public void badInsertionSort(){

        OrderedSuperArray c = new OrderedSuperArray();
        while( this.size() > 0){ 
            c.add(this.remove(0));
        }
        while(c.size() > 0){
            this.add(c.remove(0));
        }
    }

    public void selectionSort(){
	String smallestWord;
	int min = 0;
	for(int i = 0; i < size(); i++){
	    smallestWord = get(i);
	    min = i;
	    for(int a = i; a < size(); a++){
		if(get(a).compareTo(smallestWord) < 0){
		    smallestWord = get(a);
		    min = a;
		}
	    }
	    set(min, get(i));
	    set(i, smallestWord);
	}
    }

    public int find(String target){
	int where = 0;
	for(int i = 0; i < size(); i++){
	    if(target.equals(get(i))){
		where = i;
		return where;
	    }
	}
	return -1;
    }
}

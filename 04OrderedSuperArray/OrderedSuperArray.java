public class OrderedSuperArray extends SuperArray{

    public OrderedSuperArray(){
    }
    
    public OrderedSuperArray(int x){
    }
    
    public void add(String element){
	int index;
	int place = 0;
	boolean keepgoing = true;
	if (size()==0){
	    add(0,element);
	} else {
	    do{
		if (element.compareTo(get(place))>0){
		    index = place+1;
		    add(index,element);
		    keepgoing = false;
		} else {
		    add(place,element);
		    keepgoing = false;
		}
		place++;
	    } while (place<array.length && keepgoing);
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

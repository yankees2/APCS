public class driver{
    public static void main(String[]args){
	WordGrid a = new WordGrid(5,5);
	System.out.println(a.toString());
	System.out.println(a.addWordVertical("shite",0,0,false));
	System.out.println(a.addWordVertical("shite",0,1,true));
	System.out.println(a.toString());
    }
}

public class driver{
    public static void main(String[]args){
	WordGrid a = new WordGrid(5,5);
	System.out.println(a.toString());
	System.out.println(a.addWordDiagonal("shite",1,1));
	System.out.println(a.addWordDiagonal("shite",0,0));
	System.out.println(a.toString());
    }
}

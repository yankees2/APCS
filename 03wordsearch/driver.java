import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class driver{
    public static void main(String[]args)throws FileNotFoundException{
	//args[0]=rows
	//args[1]=cols
	//args[2]=seed
	//args[3]=fill-in rest?
	int rows = Integer.parseInt(args[0]);
	int cols = Integer.parseInt(args[1]);
	WordGrid a = new WordGrid(rows,cols);
	if (args.length>=3){
	    int seed = Integer.parseInt(args[2]);
	    a.setSeed(seed);
	}
	boolean answer = false;
	if (args.length==4){
	    answer = true;
	}
	a.loadWordsFromFile("words.txt",answer);
	System.out.println("Find these words:\n"+ a.wordsInPuzzle() );
	System.out.println(a.toString());
    }
}

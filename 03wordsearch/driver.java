import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class driver{
    public static void main(String[]args)throws FileNotFoundException{
	WordGrid a = new WordGrid(5,5);
	File text = new File("words.txt");
	Scanner scnr = new Scanner(text);
	while (scnr.hasNext()){
	    String word = scnr.next();
	    a.fill(word);
	}
	System.out.println(a.toString());
    }
}

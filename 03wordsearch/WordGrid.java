import java.util.Random;
import java.io.File;
import java.util.Scanner;
import java.util.*;
import java.io.FileNotFoundException;

public class WordGrid{
    private char[][] data;
    Random rand = new Random();
    ArrayList<String> works = new ArrayList<String>();

    /**Initialize the grid to the size specified and fill all of the positions
     *with spaces.
     *@param row is the starting height of the WordGrid
     *@param col is the starting width of the WordGrid
     */

    public WordGrid(int rows,int cols){
	data = new char[rows][cols];
	for (int i = 0; i<rows; i++){
	    for (int j = 0; j<cols; j++){
		data[i][j] = '_';
	    }
	}
    }

    /**Set all values in the WordGrid to spaces ' '*/

    public void clear(){
	for (int i = 0; i<data.length; i++){
	    for (int j = 0; j<data[i].length; j++){
		data[i][j] = '_';
	    }
	}
    }

     /**The proper formatting for a WordGrid is created in the toString.
     *@return a String with each character separated by spaces, and each row
     *separated by newlines.
     */

    public String toString(){
	String grid = "";
	for (int i = 0; i<data.length; i++){
	    for (int j = 0; j<data[i].length; j++){
		grid+=data[i][j]+" ";
	    }
	    grid+="\n";
	}
	return grid;
    }

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     */

    public boolean addWordHorizontal(String word,int row,int col,boolean GoBack){
	char[] array = word.toCharArray();
	if (GoBack){
	    int x = 0;
	    char[] temp = new char[array.length];
	    while (x<array.length){
		temp[x] = array[array.length-x-1];
		x++;
	    }
	    array = temp;
	}
	if (array.length>data[row].length-col){
	    return false;
	} else {
	    int i = col;
	    while (i-col<array.length){
		if (array[i-col]!=data[row][i] && data[row][i]!='_'){
		    return false;
		}
		i++;
	    }
	    i = col;
	    while (i-col<array.length){
		data[row][i]=array[i-col];
		i++;
	    }
	    return true;
	}
    }

    public boolean addWordVertical(String word,int row,int col,boolean GoUp){
	char[] array = word.toCharArray();
	if (GoUp){
	    int x = 0;
	    char[] temp = new char[array.length];
	    while (x<array.length){
		temp[x] = array[array.length-x-1];
		x++;
	    }
	    array = temp;
	}
	if (array.length>data.length-row){
	    return false;
	} else {
	    int i = row;
	    while (i-row<array.length){
		if (array[i-row]!=data[i][col] && data[i][col]!='_'){
		    return false;
		}
		i++;
	    }
	    i = row;
	    while (i-row<array.length){
		data[i][col]=array[i-row];
		i++;
	    }
	    return true;
	}
    }

    public boolean addWordDiagonal1(String word,int row,int col,boolean GoUpLeft){
	char[] array = word.toCharArray();
	if (GoUpLeft){
	    int x = 0;
	    char[] temp = new char[array.length];
	    while (x<array.length){
		temp[x] = array[array.length-x-1];
		x++;
	    }
	    array = temp;
	}
	int length = 0;
	int a = row;
	int b = col;
	while (a<data.length && b<data[0].length){
	    length++;
	    a++;
	    b++;
	}
	if (array.length>length){
	    return false;
	} else {
	    a = row;
	    b = col;
	    int c = 0;
	    while (a<data.length && b<data[0].length && c<array.length){
		if (array[c]!=data[a][b] && data[a][b]!='_'){
		    return false;
		}
		a++;
		b++;
		c++;
	    }
	    a = row;
	    b = col;
	    c = 0;
	    while (a<data.length && b<data[0].length && c<array.length){
		data[a][b] = array[c];
		a++;
		b++;
		c++;
	    }
	    return true;
	}
    }

    public boolean add(String word,int row,int col,int dx,int dy){
	char[] array = word.toCharArray();
	if (dx==0 && dy==0){
	    return false;
	}
	int length = 0;
	int a = row;
	int b = col;
	while (a>=0 && a<data.length && b>=0 && b<=data[0].length){
	    length++;
	    a=a+dy;
	    b=b+dx;
	}
	if (array.length>length){
	    return false;
	} else {
	    a = row;
	    b = col;
	    int c = 0;
	    while (c<array.length && a>=0 && a<data.length && b>=0 && b<data[0].length){
		if (data[a][b]!=array[c] && data[a][b]!='_'){
		    return false;
		}
		a+=dy;
		b+=dx;
		c++;
	    }
	    a = row;
	    b = col;
	    c = 0;
	    while (c<array.length && a>=0 && a<data.length && b>=0 && b<data[0].length){		
		data[a][b]=array[c];
		a+=dy;
		b+=dx;
		c++;
	    }
	    return true;
	}
    }

    public void loadWordsFromFile(String filename,boolean fillRandomLetters)throws FileNotFoundException{
	File text = new File(filename);
	Scanner scnr = new Scanner(text);
	ArrayList<String> words = new ArrayList<String>();
	while (scnr.hasNext()){
	    words.add(scnr.next());
	}
	int x = 0;
	while (x<60){
	    int row = rand.nextInt(data.length);
	    int col = rand.nextInt(data[0].length);
	    int dx = rand.nextInt(3)-1;
	    int dy = rand.nextInt(3)-1;
	    int which = rand.nextInt(words.size());
	    if (add(words.get(which),row,col,dx,dy)){
		works.add(words.get(which));
		words.remove(which);
	    }
	    x++;
	}
	if (!fillRandomLetters){
	    for(int a = 0; a < data.length; a++){
		for(int b = 0; b <data[0].length;b++){
		    if(data[a][b] == '_'){
			data[a][b] = (char)(rand.nextInt(26) + 'a');
		    }
		}
	    }
	}
    }
    
    public String wordsInPuzzle(){
	String find = "";
	int x = 0;
	while (x<works.size()){
	    find+=works.get(x)+"   ";
	    if ((x+1)%4==0){
		find+="\n";
	    }
	    x++;
	}
	return find;
    }

    public void setSeed(long seed){
	rand = new Random(seed);
    }
}
		

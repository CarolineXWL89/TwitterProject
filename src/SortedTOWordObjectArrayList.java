/**
 * Created by princ on 10/05/2017.
 * SortedArray (from Maylis) --> Word Object --> Word Object ArrayList
 */
import java.util.ArrayList;
public class SortedTOWordObjectArrayList {
    private ArrayList<Word> wordArray = new ArrayList<>();
    private String[] sorted;

    public SortedTOWordObjectArrayList(String[] s){
        sorted = s;
    }

    public ArrayList<Word> listed(){
        int counter = 1;
        int current = 0;
        while(current < sorted.length){ //while have not reached the end
            String targetWord = sorted[current].toLowerCase(); //gets the first word to compare
            if(current == sorted.length - 1) { //cuts short if last word
                wordArray.add(new Word(targetWord, 1));
                break;
            }
            else {
                current = current + 1; //sets it to look at the next position
            }
            boolean same = true; //when the words are the same, continue on
            while(same && current < sorted.length){
                String gottenWord = sorted[current].toLowerCase();
                if(gottenWord.compareTo(targetWord) == 0){
                    counter++;
                    current++;
                }
                else{
                    same = false; //ends the while loop for this word
                }
            }
            wordArray.add(new Word(targetWord, counter));
            counter = 1;
        }
        return wordArray;
    }
    //returning everything in sorted array for testing
    public String print(ArrayList<Word> s){
        String ws = "";
        int l = s.size();
        for(int i = 0; i < l; i++){

            ws = ws + s.get(i).getWord() + ", ";
        }
        return ws;
    }
}

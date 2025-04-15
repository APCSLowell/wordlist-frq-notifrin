import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len){
   for (int count = 0; i < wordlist.size(); i++){
      if (wordlist.get(i).size() == len){
        count++;
      }
    }return count;

  }

  public void removeWordsOfLength(int len){
    for (int i = wordlist.size(); i >= 0; i--){
if (wordlist.get.(i).size() == len){
  wordlist.remove(i);
}
      return wordlist;
    }
}

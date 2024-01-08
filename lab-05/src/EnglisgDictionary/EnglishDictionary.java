package EnglisgDictionary;

import Data.Data;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EnglishDictionary {
    TreeMap<Character, TreeSet<String> > treeMap;
    public EnglishDictionary(){
        System.out.println("Hello user your english Disctionary has been Intialized !");
         treeMap = new TreeMap<Character, TreeSet<String> >();
    }

    public  void insertInDictionary(String ... values){
        Pattern alphaPattern = Pattern.compile("^[a-zA-Z]+$");
        for(int i=0; i<values.length; i++){
            char firstChar = Character.toLowerCase(values[i].charAt(0));
            if(alphaPattern.matcher(values[i]).matches()){
                if (!this.treeMap.containsKey(firstChar)) {
                    treeMap.put(firstChar, new TreeSet<String>());
                }
                treeMap.get(firstChar).add(values[i]);
            }
            else{
                System.out.println("My program exclude your word"+ values[i] +"as it does not consist of charchter only");
            }
        }
    }
    public void displayDictionary() {
        for (char key : treeMap.keySet()) {
            System.out.print("Words starting with '" + key + "': ");

            TreeSet<String> words = treeMap.get(key);
            for (String word : words) {
                System.out.print(word + " ");
            }

            System.out.println();
        }
    }
    public void search(String regexPattern) {
        Pattern pattern = Pattern.compile(regexPattern, Pattern.CASE_INSENSITIVE);
        for (TreeSet<String> words : treeMap.values()) {
            for (String word : words) {
                Matcher matcher = pattern.matcher(word);
                if (matcher.find()) {
                    System.out.println("Match found: " + word);
                }
            }
        }
    }
public String removeWord (String word){
    char firstChar = Character.toLowerCase(word.charAt(0));
    if(!this.treeMap.containsKey(firstChar)){
        return "Charachter does not exist!";
    }
    else{
        TreeSet<String> words = treeMap.get(firstChar);
        if (words.remove(word)) {
            return "Word '" + word + "' removed successfully.";
        } else {
            return "Word '" + word + "' not found in the TreeSet.";
        }
    }

}
    public String  removeAllKey(char key){
        char firstChar = Character.toLowerCase(key);
        if(!this.treeMap.containsKey(firstChar)){
            return "Charachter does not exist!";
        }
        else {
            TreeSet<String> words = treeMap.get(firstChar);
            words.clear();
            return "All words for character '" + firstChar + "' removed successfully.";
        }
    }


    public TreeSet<String> getWords(char key){
        char lowerChar = Character.toLowerCase(key);
        if (!Character.isLetter(lowerChar)) {
            throw new IllegalArgumentException("Invalid character: " + key);
        }
        return treeMap.get(lowerChar);
    }


    public void fillUpYourDictionary(){
        Data data = new Data();
        for (String[] words : data.allDictionary) {
            this.insertInDictionary(words);
        }
    }
}

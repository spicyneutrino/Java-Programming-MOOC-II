package dictionary;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SaveableDictionary {
    private HashMap<String,String> dict = new HashMap<>();
    private String fileLocation = "";

    public SaveableDictionary() {
    }
    public SaveableDictionary(String file){
        this.fileLocation = file;
    }

    public boolean load(){
        try (Scanner reader = new Scanner(Paths.get(this.fileLocation))) {
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save(){
        HashSet<String> wordList = new HashSet();
        for (String word:this.dict.keySet()){
            wordList.add(word);
        }

        try (FileWriter writer = new FileWriter(this.fileLocation)) {
            for (String word:this.dict.keySet()){
                if (wordList.contains(word)){
                    writer.write(word + ":" + this.dict.get(word) + "\n");
                    wordList.remove(word);
                    wordList.remove(this.dict.get(word));
                }
            }
            writer.close();       
            return true;      
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        
    }

    public void add(String words, String translation){

        if ( !this.dict.containsKey(words) ){
            this.dict.put(words, translation);
        }
        if ( !this.dict.containsKey(translation) ){
            this.dict.put(translation, words);
        }
    }
    public String translate(String word){
        if (this.dict.containsKey(word)){
            return this.dict.get(word);
        }
        return null;
    }
    
    //returns the translation for the given word. If the word is not in the dictionary, returns null.

    public void delete(String word){
        String translation = this.translate(word);
        if (this.dict.containsKey(translation)){
            this.dict.remove(translation);
        }
        if (this.dict.containsKey(word)){
            this.dict.remove(word);
        }
    }
    
}

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;

import java.util.ArrayList;
import java.util.List;


public class AnagramProg{
	public static void main(String[] args) {
	  final String filePath = "sample.txt";
		final Map<String, ArrayList<String>> anagrams = new HashMap<>();
		/*  anagrams will be handled and grouped by adding to the anagram list the 
		    words based on their sorted string version */ 
		try(final BufferedReader readLine = new BufferedReader(new FileReader(filePath))){
		    String line, sortedLine;
		    char[] lineChars;
		    while ((line = readLine.readLine()) != null){
		        lineChars = line.toCharArray();
		        Arrays.sort(lineChars);
		        sortedLine = new String(lineChars);
		        if(!anagrams.containsKey(sortedLine)){
		           anagrams.put(sortedLine, new ArrayList<String>()); 
		        }
		        anagrams.get(sortedLine).add(line);
		    }
		} catch(IOException e){
		    e.printStackTrace();
		}
        for(String key : anagrams.keySet()){
            for(String word : anagrams.get(key)){
                System.out.print(word + " ");
            }
            System.out.println();
        }
	}
}

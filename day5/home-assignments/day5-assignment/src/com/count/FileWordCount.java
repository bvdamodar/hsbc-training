package com.count;
/**
 * 
 * @author bvdam
 *
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileWordCount {

	public static void main(String[] args) throws Exception {
		String line;  
        int wordCount = 0, sentenceCount = 0;  
          
        FileReader f = new FileReader("count.txt");  
        BufferedReader br = new BufferedReader(f);  
              
        while((line = br.readLine()) != null) {  

        	 if(!(line.equals(""))) 
             { 
                 //Counting Words
                 String[] wordList = line.split("\\s+"); 
                 wordCount += wordList.length; 

                 //Counting Sentences
                 String[] sentenceList = line.split("[!?.:]+");                   
                 sentenceCount += sentenceList.length; 
             } 
         } 
          
        System.out.println("Number of words present in given file: " + wordCount);  
        System.out.println("Number of sentences present in given file: " + sentenceCount);  
        br.close();  
    }  

}

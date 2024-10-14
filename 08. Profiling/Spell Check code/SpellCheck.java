/*****************************************************
 *	Title: SpellCheck source code
 *	Author: Horstmann
 *	Site owner/sponsor: Wiley
 *  Date:
 *	Code version: edited October 9th 2023
 *	Availability: Instructor Companion Site (online) to Big Java: Late Objects, 1st Edition (Wiley) (Accessed 9th October 2023)
 *	Modified:
 *       Collection used instead of Set for dictionaryWords to allow us experiment with different collections.
  *****************************************************/

import javax.swing.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

/**
   This program checks which words in a file are not present in a dictionary.
*/
public class SpellCheck {
   public static void main(String[] args)
           throws FileNotFoundException {
      // Read the dictionary and the document

      Collection<String> dictionaryWords = readDictionary("08. Profiling/Spell Check code/words");
      //Set<String> documentWords = readWords("alice30.txt");
      Set<String> documentWords = readWords("08. Profiling/Spell Check code/alice30.txt"); // file to be spell-checked

      // Print all words that are in the document but not the dictionary
      int numberMisspeltWords = 0;
      for (String word : documentWords) {
         if (!dictionaryWords.contains(word)) {
            numberMisspeltWords++;
            //System.out.println(word);
         }
      }
      System.out.println("Number of misspelt words: " + numberMisspeltWords);
   }

   private static Collection<String> readDictionary(String filename)
           throws FileNotFoundException {
      Collection<String> words = new LinkedList<String>();
      Scanner in = new Scanner(new File(filename));
      // Use any characters other than a-z or A-Z as delimiters
      in.useDelimiter("[^a-zA-Z]+");
      while (in.hasNext()) {
         words.add(in.next().toLowerCase());
      }
      return words;
   }

   /**
    * Reads all words from a file.
    *
    * @param filename the name of the file
    * @return a set with all lowercased words in the file. Here, a
    * word is a sequence of upper- and lowercase letters.
    */
   public static Set<String> readWords(String filename)
           throws FileNotFoundException {
      Set<String> words = new HashSet<String>();
      Scanner in = new Scanner(new File(filename));
      // Use any characters other than a-z or A-Z as delimiters
      in.useDelimiter("[^a-zA-Z]+");
      while (in.hasNext()) {
         words.add(in.next().toLowerCase());
      }
      return words;
   }
}

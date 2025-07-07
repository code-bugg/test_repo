# test_repo
In this Java program, the sample.txt file is read line by line via the BufferedReader until the EOF. Anagrams are stored and reached to via a HashMap, using the following logic:
  1) The current read word from the text file is casted to a char array, sorted, then casted back to a string;
  2) The sorted word now serves as the key in the HashMap to the list of words that have the same ordered versions;
  3) In the case where the sorted word is not present in the keySet of the HashMap, that means that a new group of anagrams has been found, for which a new entry in the HashList is added with a new List<String> as the value for the new key, in which the new list of anagrams will be stored;
  4) The word is added to the List<String> value of its sorted word key;
  5) After the HashMap keySet iteration is over, every word from every list of the HashMap's valueSet is displayed to the System.out.

This program does not utilize any other packages besides Java's own java.util and java.io packages for both utilities and file handling. In order to run this program with the JVM it is enough to run:
  
  javac AnagramProg.java
  
  java AnagramProg

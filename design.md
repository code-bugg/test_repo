# Design decisions

## Problem statement
The goal of this problem is to create a program that would read words from a text file and output them grouped as 
anagrams, anagrams representing words that have the same amount of letters placed in a different order.

## Chosen approach
In order to group and organize words in anagram groups, I've used the **Map** and **List** interfaces, as they're the closest
abstraction to this problem, as by the definition of **Maps**, a given key (in our case, the sorted string of each word 
from the anagram group, as each word of this group has the same sorted string, which we may consider a consequence of 
the anagram words property) points to a value (the **List** of words that return equal string when sorted, which in turn 
represents the key itself). 

## Data structures
In order to implement the **Map** and **List** interfaces, I've used the **HashMap** and **ArrayList** instance classes because of
the performance gains that these classes offer compared to their instance counterparts.
```java
HashMap<String, List<String>>, ArrayList<String>
```
In the case of **HashMap<String, List<String>>**, it offered such advantages as efficient average-case constant-time
lookup and insert, while **ArrayList<String>** allowed an easy iteration and appending to it.

## External references
In this program I did not use any external reference or library, as the Java's own libraries are well suited enough
to accomplish this task without any real issue, which in turn made the program cleaner, lighter and dependency-free.

## Time and space complexity
By my estimations, for an input of **n** words and an average word length of **k**, the program has:
- Time complexity:  **O(n * k log k)** due to the sorting of each word;
- Space complexity: **O(n * k)** for words storing because of **ArrayList<String>** and **String**
  with their overheads and space occupied by their properties and methods.

## Scalability considerations
### For 10 million words
In this case, such optimizations as efficient string handling, preallocated lists and increased JVM heap size are a
must have in order to execute the task in fast on modern machines, while older ones may struggle with heap resize.
### For 100 billion words
For such a massive input size, a simple heap reallocation and preallocated lists won't be enough. In this case,
distributed computing and temporal file storage would be necessary in order to handle the words categorization in a 
reasonable amount of time, without the system throwing a **OutOfMemoryError**.

##Maintability and readability
All the code is organized and clean of obscure API calls or external references.

##Testability
By writing to the **sample.txt**, this program may be easily tested and verified in correctenss.

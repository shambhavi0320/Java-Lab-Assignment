# Assignment 13: Strings: Methods and Palindromes

**Experiment Title:** Strings: Methods and Palindromes

**Aim:** Use common String methods, reverse a word, check a palindrome and print substrings.

**Software / Tools Required:** Java Development Kit (JDK), Visual Studio Code (VS Code), and a terminal/command prompt.

**Theory:** String is a sequence of characters. length() returns its number of characters, indexOf() returns the first matching position, and toUpperCase() converts letters to uppercase.

charAt(index) returns the character at a given position in a String. A loop can build a reversed word by adding characters from right to left.

A palindrome is a word that reads the same from left to right and right to left. Comparing a word with its reverse checks this property.

The substring() method returns a part of a String between specified indexes. The ending index is excluded.

## Question 1: Use String Methods

**Algorithm / Procedure:**

142. Store Programming in a String.
143. Print its length.
144. Print the first position of g using indexOf().
145. Print the word in uppercase using toUpperCase().

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
Length: 11
Position of g: 3
Upper case: PROGRAMMING
```

**Result:**

The program was written to perform the required task and produces the output shown above.

## Question 2: Reverse a Word Using charAt

**Algorithm / Procedure:**

146. Store Java in a String.
147. Start a loop from the last index to 0.
148. Add each character to a new String.
149. Print the reversed word.

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
Reversed: avaJ
```

**Result:**

The program was written to perform the required task and produces the output shown above.

## Question 3: Check Whether a Word Is a Palindrome

**Algorithm / Procedure:**

150. Store racecar in a String.
151. Build its reverse using a loop and charAt().
152. Compare the original and reversed words.
153. Print the appropriate palindrome message.

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
racecar is a palindrome
```

**Result:**

The program was written to perform the required task and produces the output shown above.

## Question 4: Print All Substrings of a Word

**Algorithm / Procedure:**

154. Store abc in a String.
155. Use an outer loop for each starting position.
156. Use an inner loop to increase the ending position.
157. Print each substring from shortest to longest for each starting position.

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
a
ab
abc
b
bc
c
```

**Result:**

The program was written to perform the required task and produces the output shown above.

# Assignment 15: StringBuilder Methods

**Experiment Title:** StringBuilder Methods

**Aim:** Build and change text with StringBuilder, using append, insert and deleteCharAt.

**Software / Tools Required:** Java Development Kit (JDK), Visual Studio Code (VS Code), and a terminal/command prompt.

**Theory:** StringBuilder is a mutable sequence of characters. append() adds text at the end, and length() returns the number of characters.

append() adds characters to the end of a StringBuilder. deleteCharAt(index) removes the character at the specified index.

insert(index, text) inserts the given text at the specified position in a StringBuilder without replacing existing characters.

## Question 1: Append Text Using StringBuilder

**Algorithm / Procedure:**

171. Create a StringBuilder containing Hello.
172. Append the text World with a leading space.
173. Print the StringBuilder and its length.

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
Hello World
Length: 11
```

**Result:**

The program was written to perform the required task and produces the output shown above.

## Question 2: Append Numbers and Remove the Last Comma

**Algorithm / Procedure:**

174. Create an empty StringBuilder.
175. Use a loop from 1 to 5 to append each number followed by a comma.
176. Delete the final comma using deleteCharAt().
177. Print the result.

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
1,2,3,4,5
```

**Result:**

The program was written to perform the required task and produces the output shown above.

## Question 3: Insert Text Using StringBuilder

**Algorithm / Procedure:**

178. Create a StringBuilder containing Java.
179. Insert Hello followed by a space at index 0.
180. Print the updated StringBuilder.

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
Hello Java
```

**Result:**

The program was written to perform the required task and produces the output shown above.

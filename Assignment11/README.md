# Assignment 11: Bubble Sort and Selection Sort

**Experiment Title:** Bubble Sort and Selection Sort

**Aim:** Sort small arrays with bubble sort and selection sort, and count the swaps.

**Software / Tools Required:** Java Development Kit (JDK), Visual Studio Code (VS Code), and a terminal/command prompt.

**Theory:** Bubble sort repeatedly compares adjacent elements and swaps them when they are in the wrong order. After each pass, a largest unsorted value moves to the end.

Selection sort finds the smallest element in the unsorted part and places it at the beginning of that part.

In bubble sort, a swap occurs whenever two adjacent elements are exchanged to put them in increasing order. A counter can record each swap.

## Question 1: Sort an Array Using Bubble Sort

**Algorithm / Procedure:**

118. Create the array {5, 1, 4, 2, 8}.
119. Compare adjacent elements using nested loops.
120. Swap them if the left element is greater.
121. Print the sorted array.

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
Sorted: [1, 2, 4, 5, 8]
```

**Result:**

The program was written to perform the required task and produces the output shown above.

## Question 2: Sort an Array Using Selection Sort

**Algorithm / Procedure:**

122. Create the array {64, 25, 12, 22, 11}.
123. For each position, find the index of the smallest remaining element.
124. Swap it with the current position.
125. Print the sorted array.

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
Sorted: [11, 12, 22, 25, 64]
```

**Result:**

The program was written to perform the required task and produces the output shown above.

## Question 3: Count Swaps in Bubble Sort

**Algorithm / Procedure:**

126. Create the array {5, 1, 4, 2, 8}.
127. Initialize swaps to 0.
128. Perform bubble sort and increase swaps after every exchange.
129. Print the total number of swaps.

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
Swaps: 4
```

**Result:**

The program was written to perform the required task and produces the output shown above.

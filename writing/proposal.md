# An Educational Approach to Sorting Algorithms

## Declan Casey, Noor Buchi, Pedro Carmo, Nolan Thompson

## Abstract:
In this project, we will create a program that interacts with the user and explains how several sorting algorithms operate. It also generates a random set of data and sorts the data structure using the chosen algorithm. Finally, it displays the time it took to sort and general information about the worst-case time complexity of the sorting algorithm.

## Description of the main idea:
This program is intended to serve an educational purpose through helping us and other students understand how some sorting algorithms work and their performance. It will allow the user to choose a sorting algorithm and will display a step-by-step description of the first few iterations of the algorithm. The available sorting algorithms at first are bubble sort, insertion sort. Moving forward, there will be additional algorithms added. The program will also include a timing feature that displays the time it took to sort the data as well as information about the pros and cons of using this sorting method.

## Description of the tasks:

- Create a sorter class.
- Create different sorting algorithms that extend sorter.
- Create a main method that prompts the user appropriately.
- Add a timing method to the sorter class `sortToTime`.
- Add an explanatory method to each sorter `explainSort`.
- Create test cases that ensure all sorting algorithms work.
- Handle all exceptions.
- Implement scanner with conditional logic to get user input.
- Document our progress through comments and update markdown files regularly.


## Detailed Plan for Your Team to Complete the Project:

- In order to complete the project we will create a separate java file for each different sorting algorithm to better organize the code and to facilitate the division of work among our group members. For each sorting method we will write the algorithm code in a similar manner to previous labs so that all members of the group are familiar to the structure of the code and mistakes can be caught and reviewed by any group member. The sorting algorithms will belong to the `Sorter` class. Then, through a main method we will prompt the user for input and initiate the execution of the the program.

- We will create a explaining method that will print out messages in the terminal showing the progress of the sorting algorithm while the sorting is done. Since showing all the steps of the sort process might be too much we will display only the first four or five swaps in the data. The timing of the algorithms execution will be done similarly to the "Results Table" portion of previous labs and the timed runs will be separate from the explaining runs.

- We will also make test cases to assert the correctness of the sorting algorithms.

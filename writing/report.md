# Report by Team 5

## Design of your Program
Our program consists of 5 different classes, a MainApp class, InsertionSort class, SelectionSort class, BubbleSort class, and Sorter class. The MainApp class contains the main method thus controls the flow of the program. It takes in input from the user and with that it will determine what class to call, BubbleSort, InsertionSort, or SelectionSort. All three of these classes are basically the same, the only major difference is how they sort the array passed to them. The BubbleSort class compares elements next to each other and swaps them based on the value. The InsertionSort class sorts the array by putting the current element in the certain index where the previous index is less than the element. The SelectionSort class finds the minimum value and moves it to the front, then keeps doing this in the unsorted part of the array. All three of these classes extend from the Sorter class meaning they all use the Sorter class the same way, but they just use their own functions independently. The Sorter class calls both the char array and int array sort methods in the sorting classes then call a third class to get the timing of sorting methods as the first two methods contain output which makes taking the time from these means that it would not be accurate.

## Implementation of your Program


## Evaluation and Testing of your Program
To evaluate and test our program we used output statements that showed the array being sorted step by step based on which sorting class was called. This helped us find any bugs or defects in the code making it easy to see where and what things were going wrong. Another way we tested our program we used test cases. We used many different test cases like using sorted and unsorted arrays, and checking to see if random ints in the array were able to be sorted. We used many of the same test case for the three sorting class to make sure that they we all put same array in the correct order.

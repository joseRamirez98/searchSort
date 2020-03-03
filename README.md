# Search Sort
This program was a homework assignment for a data structure class. The following are the instructions given by the professor for the assignment.

Your program will sort a two dimensional array (5 * 4) based on the following:
a)	The entire array should be sorted using bubble sort based on the 1st column in ascending order and display the entire array.
b)	Reset the array to its original contents. The entire array should again be sorted using selection  sort based on the 2nd column in descending order and display the entire array.
c)	Reset the array to its original contents. The entire array should again be sorted using shell sort based on the 3rd   column in ascending order and display the entire array
d)	Reset the array to its original contents. The entire array should again be sorted using insertion sort based on the 5th   row in ascending order and display the entire array
e)  Ask the user for a number, search for that number in the 5th row of the array that was sorted via insertion sort, using binary search. Display the entire column.

##  More Information
For more detailed instructions, the word document containing the assignment instructions and requirements will be included in the repository.

##  Unit Test
The following is a unit test with the user input as 9 for the number to search for in the fifth row.

<p>Original Array:</p>

<p>5   3   2   16</p>
<p>9   8   10  17</p> 
<p>4   7   11  18</p> 
<p>2   5   9   12</p>
<p>7   9   4   10</p> 

<p>First Column Ascending Bubble Sorted Array:<p> 

<p>2 5  9 12</p>
<p>4 7 11 18</p>
<p>5 3  2 16</p> 
<p>7 9  4 10</p> 
<p>9 8 10 17</p> 

<p>Second Column Descending Selection Sorted Array:</p> 

<p>7 9  4 10</p> 
<p>9 8 10 17</p> 
<p>4 7 11 18</p> 
<p>2 5  9 12</p> 
<p>5 3  2 16</p> 

<p>Third Column Ascending Shell Sorted Array:</p> 

<p>5 3  2 16</p> 
<p>7 9  4 10</p> 
<p>2 5  9 12</p> 
<p>9 8 10 17</p> 
<p>4 7 11 18</p> 

<p>Fifth Row Ascending Insertion Sorted Array:</p> 

<p>2  5 3 16</p> 
<p>10 9 8 17</p> 
<p>11 4 7 18</p> 
<p>9  2 5 12</p> 
<p>4  7 9 10</p> 

<p>What number are you searching for in the 5th row? 9</p>

<p>Column containing the number 9</p>
<p>3</p>
<p>8</p>
<p>7</p>
<p>5</p>
<p>9</p>

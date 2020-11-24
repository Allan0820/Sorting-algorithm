# Sorting-algorithm

This is a sorting algorithm that i developed that sorts all integer elements in one pass thus has O(n) complexity and uses the numbers to be sorted as strings.

(here i have fed values by brute force into the program in a random way so as to increase the randomness of the dataset .

(1000,2,998,4 etc etc) [dataset here is for 1000 elements].



CAUTION- Though this algorithm works and sorts numbers in one pass, This algorithm is CONCEPTUALLY INCOMPETENT as it violates 

the principles of space complexity and is highly memory intensive.

This algorithm works the best for consecutive numbers but if nos like 2^34-1 are taken then fails badly with respect to other sorting algorithms.



It works on the simple mechanism as follows

Step 1- The array to be sorted is initialized with the values to be sorted. 

Step 2- A string master array is initialized with natural numbers from the minimum to the maximum number contained in the array to be sorted.( In my program it is done manually).

Step 3- A number is picked from the array in a sequential order and it is converted to a string and matched to the MasterArray simultaneously the master array is marked with a string value ( in this case "red") .

step 4- A loop is run through the master array to read the marked values that are by default in a sorted form into the output stream. 


All source codes are within assignment3/src folder, including:
  MaxHeap.java, source code for heapify (insert integer one by one) and heap sort:
    heapify(ArrayList<Integer> args), insert a list and then heapify using floyd method,
    heapSort(), return a ArrayList of sorted numbers,
  test.py, designed for test the MaxHeap.java:
    you can specify your own input sequence in line 6,
  
### How to compile and run ###
(using Linux as example, please make sure you installed java)
  command line:
    cd "to the *assignment3/src folder"
    javac *.java
    java test
  command line, using shell (test.sh):
    cd "to the *assignment3 folder"
    sh test.sh


### Requirements ###
Implement Heap Sort.
THis includes implementing the Heapify algorithm.
The input would some numbers at random.  Use at least 15 numbers. The input would not be sorted, and should not already be a heap.
1. Make a heap (min or max).  Your out put should print the array before heapify and then after heapify.
   submit the code as well as the screen shot of execution.
2. From the heap you make in step 1, use heapsort to sort the array.
   submit code and the screen shot showing before sort and after sort array. (Before sort array should be same as the after heapify array in step 1.
Please submit a single zip file that contains all your code, the screenshots and a readme file. The zip file must be named netid-assignment3.zip. For example, if your netid is lol110010, your zip file must be lol110010-assignment3.zip



all of the codes are within ./src folder
bstnode.py and bst.py are for the problem 1
bbsort.py is for problem 2
test.py can be used to test the codes

in order to 
tree construction: add integer values one by one using bst_insert(root, val), root is the tree root and val is the integer value to be inserted
in order traversal: use bst_in_trav(root), root is the tree root
delete a node: use delete_value(root, val), root is the tree root and val is the value to be deleted
bubble sort: use class bbsort, by adding parameter list for sorting
****examples can be seen in test.py, the tree used in my validation can be found in tree.pdf****

## Note !!! ##
you can modify the test.py file for validation
I provide a shell script for running the test in linux








###################################
##Requitements:
1. Write a program to delete a node from Binary search tree.
     you will first make a Binary search tree (we already did the algorithm in the class for insert a node into BST.
    a. You may hard code the values you insert into the BST. You must insert at least 15 values in random order
              (DO NOT INSERT VALUES IN SORTED ORDER).
    b. run the program to display the tree before deletion.  You will do in-order traverse to display the nodes of the tree.
    c. Delete a node in the tree.  The node should be a leaf node.  Run in-order traverse again after the delete.
     d. delete another node in the tree. This node must not be a leaf node.  Run in-order traverse again.  Also mention if you replaced by predecessor or successor node.   In PRedecessor or the successor you replace this IS a leaf node. Run in-order traversal again. 
    e. Repeat the above step (d) but this time the predecessor or the successor you replace with must NOT be a leaf node.
2. Write the program to do bubble sort.
    a. you may insert random numbers into the array and hard code the array.
    b. There must be at least 15 numbers in the array.
   c. Display the array before starting the sort.
    d. Display the array after EACH PASS.
     e. The final sorted numbers at the final pass will be displayed.
Submit the code.
Submit readme file with instructions on what environment you used and what to do to compile
Submit screen shot(s) of your program execution.

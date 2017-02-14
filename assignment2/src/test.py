'''
Created on Feb 13, 2017

@author: mdy
'''
from bst import bst
from bbsort import bbsort
import copy

def test():
    # 1
    print '#'
    print 'problme 1: please refer to the tree.pdf file to see the tree as a graph'
    print '#'
    # node list for construct binary search tree
    nd_list = [65, 28, 22, 46, 35, 32, 40, 48, 47, 55, 83, 78, 89, 85, 86, 91, 93]
    print 'tree node list'
    print nd_list
    bt = bst()
    for i in range(len(nd_list)):
        bt.bst_insert(bt.root, nd_list[i])
        
    print 'original tree, in order traversal'
    bt.bst_in_trav(bt.root)
    bt1 = copy.deepcopy(bt)
    bt2 = copy.deepcopy(bt)
    print
    print 'delete a leaf: (86), in order traversal'
    bt.delete_value(bt.root, 86)
    bt.bst_in_trav(bt.root)
    print
    print 'delete (91), its successor is (93), (93) is a leaf, in order traversal'
    bt1.delete_value(bt1.root, 91)
    bt1.bst_in_trav(bt1.root)
    print
    print 'delete (83), its successor is (85), (85) is not a leaf, in order traversal'
    bt2.delete_value(bt2.root, 83)
    bt2.bst_in_trav(bt2.root)
    print
    
    print '#'
    # 2
    # bubble sort
    print 'problem 2: bubble sort'
    print '#'
    print 'original list: '
    t_list = [32, 7, 45, 13, 64, 9, 3, 11, 9, 18, 69, 23, 33, 99, 76, 86]
    print t_list
    print 'bubble sort passes'
    bbsort(t_list)
    
    
if __name__=='__main__':
    test()
    
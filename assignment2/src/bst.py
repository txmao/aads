'''
Created on Feb 13, 2017

@author: mdy
'''
from bstnode import bstnode

class bst:
    def __init__(self):
        self.root = bstnode(None)
        return
    
    def bst_insert(self, root, val):
        if root.value == None:
            root.value = val
            #return
        else:
            if root.value == val:
                print 'insert node already exist'
                #return
            else:
                if root.value > val:
                    if root.left == None:
                        nd = bstnode(val)
                        root.left = nd
                        nd.parent = root
                        #return
                    else:
                        self.bst_insert(root.left, val)
                else:
                    if root.right == None:
                        nd = bstnode(val)
                        root.right = nd
                        nd.parent = root
                        #return
                    else:
                        self.bst_insert(root.right, val)
        #return
    
    def bst_in_trav(self, root):
        if root == None:
            return
        else:
            #print root.value,
            self.bst_in_trav(root.left)
            print root.value,
            self.bst_in_trav(root.right)
        
    
    # successor        
    def delete_value(self, root, val):
        # return result tree
        if root.value == None:
            print 'the tree is none'
        else:
            dnode = self.delete_node_position(root, val)
            if dnode.value == None:
                print 'no such a node in tree'
            else:
                # delete root
                if dnode.parent == None:
                    # root is leaf
                    if dnode.left==None and dnode.right == None:
                        root=None
                    else:
                        #find successor
                        if dnode.right == None:
                            root = root.left
                        else:
                            tmp = root.right
                            while (tmp.left!=None):
                                tmp = tmp.left
                                
                            snode = tmp
                            if snode.left==None and snode.right==None:
                                if snode.parent==dnode:
                                    dnode.value = snode.value
                                    dnode.right = None
                                else:
                                    dnode.value = snode.value
                                    snode.parent.left = None
                                #dnode.value = snode.value
                                #snode.parent.left = None
                            else:
                                dnode.value = snode.value
                                snode = snode.right
                                
                else:
                    if dnode.left==None and dnode.right == None:
                        if dnode.parent.left == dnode:
                            dnode.parent.left = None
                        else:
                            dnode.parent.right = None
                    else:
                        if dnode.left == None:
                            if dnode.parent.left == dnode:
                                dnode.parent.left = dnode.right
                            else:
                                dnode.parent.right = dnode.right
                        
                        if dnode.right == None:
                            if dnode.parent.left == dnode:
                                dnode.parent.left = dnode.left
                            else:
                                dnode.parent.right = dnode.left
                                
                        if dnode.left!=None and dnode.right!=None:
                            tmp = dnode.right
                            while (tmp.left!=None):
                                tmp = tmp.left
                                
                            snode = tmp
                            #print snode.value
                            if snode.left==None and snode.right==None:
                                dnode.value = snode.value
                                if snode.parent.left == snode:
                                    snode.parent.left = None
                                else:
                                    snode.parent.right = None
                            else:
                                dnode.value = snode.value
                                if snode.parent.left == snode:
                                    snode.parent.left = snode.right
                                else:
                                    snode.parent.right = snode.right
                                
                                
                                
        return root
                
                    
           
            
    
    def delete_node_position(self, root, val):
        if root == None or root.value == None:
            print 'no such a value'
            return bstnode(None)
        else:
            if root.value == val:
                return root
            else:
                if root.value > val:
                    n1 = self.delete_node_position(root.left, val)
                else:
                    n1 = self.delete_node_position(root.right, val)
                    
                return n1
                    
    
            
if __name__=='__main__':
    nd_list = [65, 28, 22, 46, 35, 32, 40, 48, 47, 55, 83, 78, 89, 85, 86, 91, 93]
    #nd_list = [65, 28, 22, 46, 35, 32, 40, 48, 47, 55, 83, 78, 89, 85, 91, 93]
    #nd_list = [65, 28, 22, 46, 35, 32, 40, 48, 47, 55, 83, 78]
    bst1 = bst()
    for i in range(len(nd_list)):
        bst1.bst_insert(bst1.root, nd_list[i])
        
    bst1.bst_in_trav(bst1.root)
    print
    #print bst1.root.right.right.left.right.parent.value
    bst1.delete_value(bst1.root, 86)
    bst1.bst_in_trav(bst1.root)
    
    
    
    
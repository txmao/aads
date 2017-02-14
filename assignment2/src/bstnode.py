'''
Created on Feb 13, 2017

@author: mdy
'''
class bstnode:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None
        self.parent = None
        return
    
if __name__=='__main__':
    bn = bstnode(3)
    print bn.value
    print bn.left
'''
Created on Feb 13, 2017

@author: mdy
'''
class bbsort:
    def __init__(self, target_list):
        self.lst = target_list
        self.bubble_sort(self.lst)
        
    def bubble_sort(self, lst):
        iter_cnt = 0
        print 'pass '+str(iter_cnt)+' :' , lst
        swp_note = 1
        while(swp_note):
            snp = 0
            for i in range(len(lst)-1):
                j=i+1
                if lst[j]<lst[i]:
                    tmp = lst[i]
                    lst[i] = lst[j]
                    lst[j] = tmp
                    snp = 1
            
            swp_note = snp
            iter_cnt += 1
            print 'pass '+str(iter_cnt)+' :' , lst
        
if __name__=='__main__':
    t_list = [32, 7, 45, 13, 64, 9, 3, 11, 9, 18, 69, 23, 33, 99, 76, 86]
    bb = bbsort(t_list)
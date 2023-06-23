# Complete the compare_lists function below.

#
# For your reference:
#
# SinglyLinkedListNode:
#     int data
#     SinglyLinkedListNode next
#
#
def compare_lists(headA, headB):
    if (headA==None) | (headB==None):
        if (headA==None) & (headB==None):
            return 1
        else:
            return 0 
    else:
        while (headA!=None) & (headB!=None):
            if (headA.data == headB.data):
                headA = headA.next
                headB = headB.next
            else:
                return 0 
        if (headA == None) & (headB == None):
            return 1
        else:
            return 0
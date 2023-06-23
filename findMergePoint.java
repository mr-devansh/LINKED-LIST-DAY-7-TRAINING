    // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    
        static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        //SinglyLinkedListNode next;
        
        List<SinglyLinkedListNode> list = new ArrayList<>();
        while(head1 != null){
            list.add(head1);
            head1 = head1.next;
            
        }
        while(head2 != null){
            if(list.contains(head2)){
                return head2.data;
            }
            head2 = head2.next;
        }
        return 0;


    }

    
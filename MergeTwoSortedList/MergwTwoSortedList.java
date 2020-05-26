    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //Maintaining an unchanging reference to node ahead of the return node
        ListNode prevhead = new ListNode(-1);
        ListNode prev = prevhead;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            }
            else{
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        //exactly one of the l1 or l2 can be a non-null at this point, so connect 
        //the non-null list to the end of the merged list
        prev.next = l1 == null ? l2 : l1;
        return prevhead.next;
    }
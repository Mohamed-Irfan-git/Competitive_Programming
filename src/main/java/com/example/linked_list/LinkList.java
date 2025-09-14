package com.example.linked_list;

public class LinkList {

    private static final class Node {
         int data;
         Node next;

        Node(int data) {
            this.data = data;
        }
        private Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(int data){
        if(head==null){
            head=new Node(data);
            tail=head;
        }
        Node node=new Node(data);
        node.next = head;
        head = node;
        size++;
    }
    public void insertLast(int data){
        if(tail==null){
            tail=new Node(data);
            head=tail;
        }
        Node node=new Node(data);
        tail.next=node;
        node.next=null;
        tail=node;
        size++;
    }
    public void insertRec(int data,int index){
        head = insertRec(head,data,index);
        size++;

    }
    private Node insertRec(Node node,int data,int index){
        if(index==0){
            return new Node(data,node);
        }
        node.next=insertRec(node.next,data,index-1);
        return  node;
    }
    public void reverse(){
        if(head==null){
            return;
        }
        reverse(this.head);
    }
    private void reverse(Node node){
        if(node==tail){
            head=tail;
            return;
        }
        reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }

    private void reverseInPlace(Node node){
        if(node==null){
            return;
        }
        Node prev=null;
        Node current = node;
        Node next = current.next;

        while(current.next!=null){
            current.next=prev;
            prev=current;
            current=next;

            if(next!=null){
                next =  next.next;
            }
        }
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.println("END");

    }

    public boolean hasCycle(){
        Node slow = head;
        Node fast = head;

        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public Node cycleFormingNode(){
        Node slow = head;
        Node fast = head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){

                Node entry = head;

                while(entry!=slow){
                    entry=entry.next;
                    slow=slow.next;
                }
                return entry;
            }
        }
        return null;
    }
    public boolean isHappyNumber(int n){
        Node fast = new Node(getSqureSum(getSqureSum(n)));
        Node slow = new Node(getSqureSum(n));

        if(fast.data!=1 && fast.data!=slow.data){
            slow = new Node (getSqureSum(slow.data));
            fast = new Node (getSqureSum(getSqureSum(fast.data)));

        }
        return fast.data==1;

    }
    private int getSqureSum(int n){
        int sum = 0;
        while(n>0){
            int rem= n%10;
            sum = sum + rem*rem;
            n=n/10;
        }
        return sum;
    }
    public Node reverseKGroup(Node head, int k){
        if(k<=1 || head==null){
            return head;
        }

        Node pre = null;
        Node current = head;

        int length = getSize(head);
        int count = length/k;

        while(count > 0){
            Node last = pre;
            Node newEnd = current;
            Node next = current.next;

            for (int i=0; current!= null && i<k; i++){
                current.next = pre;
                pre = current;
                current = next;
                if(next!=null){
                    next = next.next;
                }
            }
            if(last!=null){
                last.next = pre;
            }else {
                head = pre;
            }
            newEnd.next = current;
            pre = newEnd;

            count--;
        }
        return head;

    }

    // leetcode question
    public void removeNthFromEnd(int n){
        this.head=removeNthFromEnd(this.head,4);

    }

    private Node removeNthFromEnd(Node head, int n) {
        if (head == null) return null;

        int indexToRemove = getSize(head) - n;

        // removing head
        if (indexToRemove == 0) {
            return head.next;
        }

        Node node = head;
        for (int i = 0; i < indexToRemove - 1; i++) {
            node = node.next;
        }

        if (node.next != null) {
            node.next = node.next.next;
        }

        return head;
    }

    private int getSize(Node head){
        int count = 0;
        Node temp = head;

        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;

    }


}

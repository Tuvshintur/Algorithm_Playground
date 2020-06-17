package DataStructures;

public class Queue {
    class Node {
        int val;
        Node(int val) {
            this.val = val;
        }
        Node next;
    }

    Node head, tail;
    int size = 0;

    void add(int val) {
        Node tmp = new Node(val);

        if(head == null) {
            head = tmp;
            tail = tmp;
        } else {
            tail.next = tmp;
            tail = tail.next;
        }
        size++;
    }

    Node pop() {
        Node res = head;
        if(head != null) {
            head = head.next;
            size--;
        }
        return res;
    }

    Node peek() {
        return head;
    }

    int size() {
        return size;
    }

    boolean find(int val) {
        Node tmp = head;

        while(tmp != null) {
            if(val == tmp.val) {
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }


    void deleteIndex(int index) {
        if(size <= index || index <0) {
            return;
        }
        size--;
        Node tmp = head;

        if(index ==0) {
            head=head.next;
            return;
        }

        while(tmp!=null && index >1) {
            tmp = tmp.next;
            index--;
        }

        if(tmp !=null && tmp.next !=null){
            tmp.next = tmp.next.next;
        }
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        Node tmp = head;

        if(tmp != null) {
            s.append(tmp.val);
            tmp = tmp.next;
        }

        while(tmp !=null) {
            s.append("->").append(tmp.val);

            tmp = tmp.next;
        }

        return s.toString();
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        //1->2->3

        q.deleteIndex(-1);
        System.out.println(q.toString());

//        System.out.println(q.peek().val);
//        //1
//        System.out.println(q.pop().val);
//        //1, 2->3
//        System.out.println(q.peek().val);
//        //2
//        q.add(4);
//        q.add(5);
//        //2->3->4->5
//        System.out.println(q.pop().val);
//        //2
//        q.add(6);
//        //3->4->5->6
//        System.out.println(q.peek().val);
//        //3
//        System.out.println(q.pop().val);
//        //3
//        System.out.println(q.pop().val);
//        //4
//        System.out.println(q.pop().val);
//        //5
//        System.out.println(q.pop().val);
//        //6
//
//        System.out.println(q.pop());
//        //null
//
//        System.out.println(q.pop());
//        //null
//        q.add(7);
//        System.out.println(q.size());
        //0
    }

}

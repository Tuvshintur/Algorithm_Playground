
public class Stack {
    private Node res;

    class Node {
        int val;
        Node(int val) {
            this.val = val;
        }
        Node next;
    }

    Node head;
    int size = 0;

    void add(int val) {
        Node tmp = new Node(val);
        tmp.next = head;
        head = tmp;
        size++;
    }

    Node pop() {
        Node res = head;
        if(head !=null) {
            size--;
            head = head.next;
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
            if(tmp.val == val) {
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

        if(index == 0) {
            head = head.next;
            return;
        }

        Node tmp = head;

        while(tmp != null && index > 1) {
            tmp = tmp.next;
            index--;
        }

        if(tmp != null && tmp.next != null) {
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
        Stack s = new Stack();

        s.add(1);
        s.add(2);
        s.add(3);
        //3->2->1
        s.deleteIndex(2);
        System.out.println(s.toString());
//        s.add(4);
//        s.add(5);
//        System.out.println(s.pop().val);
//        s.add(6);
//
//        System.out.println(s.find(6));
//
//        //1,2,3,4,6
//
//        System.out.println(s.deleteIndex(2).val);
//        //3
//
//        //1,2,4,6
//
//        System.out.println(s.toString());
//
//        System.out.println(s.peek().val);
//        System.out.println(s.pop().val);
//        System.out.println(s.pop().val);
//        System.out.println(s.pop().val);
//        System.out.println(s.pop().val);
//
//        System.out.println(s.pop());
//
//        System.out.println(s.pop());
//        System.out.println(s.size());



    }

}

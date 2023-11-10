public class DLList {
    class Node{
        int x;
        Node next;
        Node prev;
        public Node(int x){
            this.x = x;
            this.next = null;
            this.prev = null;
        }
    }
    Node start;
    Node end;

    public DLList(){
        start = null;
        end = null;
    }
    public void print(){
        Node t = start;
        while (t != null){
            System.out.println(t.x + " ");
        }
        System.out.println();
    }
    public void push_front(int x){
        Node t = new Node(x);
        if (start == null){
            start =t;
            end = t;
            return;
        }
        t.next = start;
        start.prev = t;
        start = t;

    }
}

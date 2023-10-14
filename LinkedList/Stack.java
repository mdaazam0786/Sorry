public class Stack {
    static Node head = null;
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    void push(int data){
        Node newnNode = new Node(data);
        if(head == null){
            head = newnNode;
        }
        else{
            newnNode.next = head;
            head = newnNode;
        }
    }
    int pop(){
        if(head == null){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }
    int peek(){
        if(head == null){
            return -1;
        }
        return head.data;
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        while(head != null){
            System.out.print(s.peek() + " ");
            s.pop();
        }


    }
}

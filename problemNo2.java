public class problemNo2 {
    static Node headNode = null;
    static Node tailNode = null;
    int length = 0;
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    void add1(int data) {
        Node tempNode = new Node(data);
        if (headNode == null) {
            headNode = tempNode;
        } else {
            tailNode.next = tempNode;
        }
        tailNode = tempNode;
        length++;
    }
    void deleteAtIndex(Node a , int n) {
        if(headNode == null || headNode.next == null){
            return;
        }
        int size = 0;
         Node prev = headNode;
         Node curr = headNode.next;
         while(curr != null){
             size++;
             prev = prev.next;
             curr = curr.next;
         }
         int m = size - n + 1;
         prev = headNode;
         curr = headNode.next;
         for(int i = 1 ; i<=m-1;i++){
             prev = prev.next;
             curr = curr.next;
         }
         prev.next = prev.next.next;
    }
    void printList() {
        if (headNode == null) {
            System.out.println("Empty List");
        } else {
            Node tempNode = headNode;
            while (tempNode != null) {
                System.out.print(tempNode.data + "-->");
                tempNode = tempNode.next;
            }
            System.out.print("NULL");
        }
    }
    public static void main(String[] args) {
        problemNo2 list = new problemNo2();
        list.add1(0);
        list.add1(1);
        list.add1(2);
        list.add1(3);
        list.printList();
        System.out.println();
        list.deleteAtIndex(headNode, 3);
        list.printList();
        
    }
}

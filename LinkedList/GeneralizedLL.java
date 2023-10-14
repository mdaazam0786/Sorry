public class GeneralizedLL {
    static Node headNode = null;
    public class Node{
        boolean flag;
        char  data;
        Node down;
        Node next;
        Node(boolean flag,char data){
            this.flag = flag;
            this.data = data;
        }
    }
    void check(boolean flag , char data , Node head){
            Node temp = head;
            while(temp.next!=null && flag == false){
                Node down = null;
                System.out.print(temp.data + "-->");
            }
            // while(temp!=null){
            //     Node next = null;
            //     Node node = new Node(false, ' ');
            //     Node temp2 = node;
            //     while(temp2!=null){
            //     Node a = new Node(false, data);
            //     temp.down = a;
            //     System.out.print(temp2.data + "-->");
            //     temp2 = temp2.down;
            //     }
            //     System.out.print("NULL");
            //     temp = temp.next;
            // }

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
    void add2(boolean flag,char data) {
        Node newNode = new Node(flag , data);
        Node currNode = headNode;
        if (headNode == null) {
            headNode = newNode;
        } else {
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
            currNode = newNode;
        }
    }
    
    public static void main(String[] args) {
        GeneralizedLL list = new GeneralizedLL();
        list.add2(false, 'a');
        list.add2(true, 'b');
        list.add2(true, 'c');
        list.add2(true, 'd');
        list.add2(false, 'e');
        list.add2(true, 'f');
        list.add2(true, 'g');
        list.printList();
        System.out.println();
        list.check(false, 'a',headNode);
        System.out.println();
        list.check(false, 'b',headNode);
        list.check(false, 'c',headNode);
        list.check(false, 'd',headNode);
        System.out.println();
        list.check(false, 'e',headNode);
        System.out.println();
        list.check(false, 'f',headNode);
        list.check(false, 'g',headNode);

    }
}

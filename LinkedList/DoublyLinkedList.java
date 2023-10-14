public class DoublyLinkedList {
    static Node headNode = null;
    static Node tailNode = null;
    int length = 0;

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }
    Node add(int data){
        Node newNode = new Node(data);
        if(headNode == null){
            headNode = newNode;
        }
        else{
            tailNode.next = newNode;
            newNode.prev = tailNode;
        }
        tailNode = newNode;
        length++;
        return tailNode;
    }
    void addAtIndex(int data,int n){
        Node tempNode = new Node(data);
        if(headNode == null){
            headNode = tempNode;
            length++;
            return;
        }
        //adding at the beginning of the list
        if(n==0){
            tempNode.next = headNode;
            headNode.prev = tempNode;
            headNode = tempNode;
            length++;
            return;
        }
        //adding at the end of the list
        if(n==length){
            Node currNode = headNode;
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = tempNode;
            tempNode.prev = currNode;
            currNode = tempNode;
            return;
        }
        //add at any index of the list
        Node currNode = headNode;
        for(int i=1;i<=n;i++){
            currNode = currNode.next;
        }
        currNode.prev.next = tempNode;
        tempNode.prev = currNode.prev;
        currNode.next.prev = tempNode;
        tempNode.next = currNode.next;
        length++;
        return;
    }
    void deleteAtIndex(int n){
        //Delete first the node
        if(n==0){
            headNode = headNode.next;
            headNode.prev = null;
            length--;
            return;
        }
        //Delete the last node
        if(n==length){
            Node tempNode = headNode;
            while(tempNode.next !=null){
                tempNode = tempNode.next;
            }
            tempNode.prev.next = null;
            tailNode = tempNode;
            length--;
            return;
        }
        //delete at the any index of the list
        Node currNode = headNode;
        for(int i=1;i<=n;i++){
            currNode = currNode.next;
        }
        currNode.prev.next = currNode.next;
        currNode.next.prev = currNode.prev;
        length--;
        return;

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
    void circular(Node random){
        Node tempNode = random;
        while(tempNode.prev!=null){
            tempNode = tempNode.prev;
        }
        while (tempNode != null) {
            System.out.print(tempNode.data + "-->");
            tempNode = tempNode.next;
        }
        System.out.print("NULL");
    }
    void reverse(Node tailNode){
        while(tailNode.prev!=null){
            System.out.print(tailNode.data + "-->");
            tailNode = tailNode.prev;
        }
        System.out.print("NULL");
    }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.printList();
        System.out.println();
        list.addAtIndex(3, 3);
        list.printList();
        System.out.println();
        list.addAtIndex(5, 2);
        list.printList();
        System.out.println();
        list.deleteAtIndex(4);
        list.printList();

    }
}


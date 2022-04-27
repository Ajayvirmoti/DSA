public class SinglyLinkedList {
    Node head = new Node(10);

    private static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Method to print/display list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --->");
            current = current.next;
        }
        System.out.println("Null");
    }
// To find the length of linked list
    public int length() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    //Insert first
    public void insetFirst(int value){
        Node newNode = new Node(value);
        newNode.next=head;
        head = newNode;
    }
// Inserting Last

    public void insertLast(int value){
        Node newNode = new Node(value);
        if (head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(null!=current.next){
            current = current.next;
        }
        current.next = newNode;}

// Inserting at Given Position
   public void Insert(int data, int position){
        Node node = new Node(data);
        if(position==1){
            node.next=head;
            head = node;
        } else {
            Node previous = head;
            int count = 1;
            while(count<position-1){
                previous = previous.next;
                count++;
            }
            Node current = previous.next;
            node.next = current;
            previous.next = node;
        }
}
// Delete first Node
    public void DeleteFirst(){
        head = head.next;

        }
// Delete Last
    public void DeleteLast(){
        Node node = head;
        while(node.next.next!=null){
            node = node.next;
        }
        node.next = null;
    }
// Deleting any element
    public void Delete(int Position){
        Node node = head;
        int count = 1;
        while(count<Position-1){
            node = node.next;
            count++;
        }
      /*  Node previous = node;
        previous.next = node.next.next;*/
        node.next = node.next.next;
    }
// Search Element in sll
    public int SearchNode(int element){
        if(head.data == element) return 1;
        Node node = head;
        while(node.next != null){
            if (node.data == element) return 1;
            node = node.next;
        }
        return 0;
    }
//  List search and delete
    public void SearchAndDelete(int Value){
        Node current = head;
        int count =1;
        while(current.next != null){
            if(current.data == Value) break;

        }
        current.next = current.next.next;

    }


// Main method
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new Node(10);
        Node second = new Node(04);
        Node third = new Node(3);
        Node four = new Node(20);
        sll.head.next = second;
        second.next = third;
        third.next = four;
        sll.display();
        System.out.println("The value of length : " + sll.length());
        //Insert First
        sll.insetFirst(11);
        sll.insetFirst(12);
        sll.display();
        //Insert at last
        sll.insertLast(30);
        sll.insertLast(30);
        sll.display();
        //Insert
        sll.Insert(7,3);
        sll.display();
        // Delete First
        sll.DeleteFirst();
        System.out.println("After Delete first");
        sll.display();
        // DeleteLast
        sll.DeleteLast();
        System.out.println("Delete Last ");
        sll.display();
        // Delete : Deleting from any Position
        sll.Delete(3);
        System.out.println("Deleting from position 3");
        sll.display();

        // Search element
        sll.SearchNode(4);
        // Search and delete
        sll.SearchAndDelete(30);
        System.out.println("j");
        sll.display();







    }

}

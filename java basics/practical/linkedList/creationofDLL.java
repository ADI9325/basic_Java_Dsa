public class creationofDLL {
                    class Node {
                                        int data;
                                        Node prev;
                                        Node next;

                                        Node(int data) {
                                                            this.data = data;
                                        }
                    }

                    public Node head = null;
                    public Node tail = null;

                    public void addNode(int data) {
                                        Node temp = new Node(data);
                                        if (head == null) {
                                                            head = temp;
                                                            tail = temp;
                                        } else {
                                                            tail.next = temp;
                                                            tail = temp;
                                        }

                    }

                    public void display() {
                                        // Node current will point to head
                                        Node current = head;

                                        if (head == null) {
                                                            System.out.println("List is empty");
                                                            return;
                                        }
                                        System.out.println("Nodes of singly linked list: ");
                                        while (current != null) {
                                                            // Prints each node by incrementing pointer
                                                            System.out.print(current.data + " ");
                                                            current = current.next;
                                        }
                                        System.out.println();
                    }

                    public static void main(String[] args) {
                                        creationLL sList = new creationLL();
                                        sList.addNode(1);
                                        sList.addNode(2);
                                        sList.addNode(3);
                                        sList.addNode(4);
                                        sList.display();

                    }

}

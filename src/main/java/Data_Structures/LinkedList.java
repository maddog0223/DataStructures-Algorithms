package Data_Structures;

public class LinkedList <T> {


    Node head;

    //APPEND (add) method
    public void append(T data) {

        // if the head is null, add new data, then return
        if (head == null) {

            head = new Node(data);
            return;
        }

        //After new data is added to the head, now current will equal to head
        Node current = head;

        //If the next current is not null, let current go to the next current
        while (current.next == null) {

            current.next = new Node(data);

        }
        // If current is equal to null, then add a new data to the next current
        if (current != null) {

            while (current.data != data)

            //and return
            return;

        }
    }

    // PREPEND Method
    public void prepend(T data) {

        //A new head will have a new data
        Node newHead = new Node(data);

        // if head does not equal null, then head.next will equal to head
        while (head != null) {

            head.next = head;

        }
        //else NewHead will equal to the head object
        newHead = head;
        //Then head will have a new data
        head = newHead;

        return;
    }

    //Find Method
    public T find(T data) {

        Node current = head;

        //If current is not equal to the data it wants, let current equal to current.next

        if (current == null) {

            System.out.println("Add new data");
            current = new Node(data);

        }

            while (current.data != data) {

                current = current.next;

            }

                //If the next current data is equal to the data
                if (current.data == data) {

                    //Then print out the data
                    System.out.println(current.data);

            }

        return data;

        }





    //DELETE Method
    public void delete(T data){

        //Let current be head
        Node current = head;
        //If the currents next data is equal to data,
        if (current.next.data == data){

            //Then make that next current equal to the next next current
            current.next = current.next.next;

        }

    }
}

////creating a Data_Structures.Node class to add the datas for the Practice class

class Node<T, V>{
    T data;
    T key;
    V value;
    Node next;

    Node(T key, V value){

        this.key = key;
        this.value = value;
    }

    Node( T data){

        this.data = data;

    }

}





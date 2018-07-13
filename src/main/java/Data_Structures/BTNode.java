package Data_Structures;


public class BTNode {

    // Left and right nodes
    BTNode left, right;
    BTNode root;

    //the data inside the node(which is an int)
    int data;

    //A Node constructor to add the data inside
    BTNode(int data) {

        this.data = data;

    }

    BTNode(){}


    // INSERT method
    public void insert(int value) {


        BTNode current = root;
        //if value that I want to add is less than the data
        if (value <= current.data) {

            // and if left is null
            if (left == null) {
                //then create new Node and add a value for the left node
                left = new BTNode(value);

                return;
            }
            //or call the value of the insert method of the left node
            left.insert(value);

            return;

            //if  value is greater than data
        } else if (value > current.data) {

            // and if the right Node is null
            if (right == null) {

                //then create a new node for the right node and add the value
                right = new BTNode(value);

            }

            //else call the insert method of the right node
            right.insert(value);

            System.out.println(value + " added");

            return;
        }
    }

    //REMOVE method
    public BTNode remove(BTNode node,int value) {

        if (BTNode node == null){

        }



    }

    // FIND method named holds
    // A method to determine if the value exist or not.
    public boolean holds(int value) {
        //if the value exist in the data,
        if (value == data) {

            System.out.println(value + " exist");

            //then return true
            return true;
            //if the value is greater than data,
        } else if (value < data) {

            //and when left is null (it hits the leaf)
            if (left == null) {

                // Return false
                System.out.println("There is no (ends left) " + value);
                return false;

                // else call back the left node that contains the value (This will go back in to the method  to see if the number exist)
            } else {

                return left.holds(value);
            }

            // else if the value is greater than data,
        } else if (value > data) {

            //and if the the right node is equal to null,
            if (right == null) {

                //then return false
                System.out.println("There is no (ends right) " + value);
                return false;

                // else call back the right node that holds the value
            } else {

                return right.holds(value);
            }
        }

        // return the holds method (to return the boolean statement)
        return holds(value);
    }


    public void PrintInOrder() {


        if (left != null){

            left.PrintInOrder();

        }

        System.out.println(data);


        if (right != null) {


        right.PrintInOrder();

            System.out.println(data);

    }
        System.out.println(data);
    }

}



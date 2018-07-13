package Data_Structures;



public class PracticeHashMap<T,V> {

    Node<T, V>[] array;

    PracticeHashMap() {

        array = new Node[5];

    }


    //HASH
    int hash(T key) {


        int x = Math.abs(key.hashCode());


        x = x % array.length;


        return x;
    }

    //ADD
    public void add(T key, V value) {

        int x = hash(key);

        Node<T, V> node = new Node(key, value);


        // If the array index you're in is null,
        if (array[x] == null) {

            //add node which is a new key and value
            array[hash(key)] = node;

            System.out.println("added : " + key);


            return;

        }

        Node current = array[x];

        if (current.key == key) {

            current.value = value;

            System.out.println("added : " + key);

            return;

        }

       while (current != null) {

            current = current.next;
        }
        current.next = node;

        System.out.println("added : " + key);

       if (array.length >= array.length *.7){

           resize(key);

       }

    }


    //REMOVE
    public void remove(T key) {
        PracticeHashMap<T, V> hm = new PracticeHashMap();

        int r = hm.hash(key);

        Node current = array[Math.addExact(0,r)];

        if (current == null) {

            return;

        } else if (current != null) {

            if (current.key == key) {

                array[Math.addExact(0,r)] = current.next;


                System.out.println("Deleted : " + key);

                return;
            }

            while (current.next.key != key) {

                current = current.next;

            }

            if (current.next.key == key) {

                current.next = current.next.next;

                System.out.println("Deleted : " + key);
            }
        }

    }


    //RESIZE
    public void resize(T key) {

        PracticeHashMap<T, V> hm = new PracticeHashMap();


        int a = hash(key);
        if (array[array.length] == null) {

            System.out.println("Array is null");
        }

       else if (array[a] == array[array.length] ) {

           a = 0;

            System.out.println(array[a]);
        }

    }




    //Find
    public V find(T key) {
        PracticeHashMap<T, V> hm = new PracticeHashMap();

        int l = hm.hash(key);

        Node current = array[l];

        if (current == null) {

            System.out.println("Empty");

        } else if (current != null) {

            if (current.key == key) {

                System.out.println(current.value);
                return (V) current.value;
            }


            while (current.next != null) {

                if (current.next.key == key) {

                    System.out.println(current.value);
                    return (V) current.next.value;

                }
                current = current.next;

            }

        }

        System.out.println("Element not found");

        return (V) current.value;

    }

    public void list() {

        PracticeHashMap<T, V> hm = new PracticeHashMap();

        int i;

        for (i = 0; i < array.length; i++){

            try {
                Node<T, V> node = array[i];

                System.out.println(node.key + " " + node.value);

                while (node.next != null) {
                    node = node.next;

                    System.out.println(node.key + " " + node.value);

                }
            } catch(Exception e) {

                continue;
            }

        }

    }
}

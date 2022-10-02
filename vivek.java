import BTreeNode.*;

class BTree{
    BTreeNode root;
    int MinDeg;

    // Constructor
    public BTree(int deg){
        this.root = null;
        this.MinDeg = deg;
    }

    public void traverse(){
        if (root != null){
            root.traverse();
        }
    }

    // Function to find key
    public BTreeNode search(int key){
        return root == null ? null : root.search(key);
    }

    public void insert(int key){

        if (root == null){

            root = new BTreeNode(MinDeg,true);
            root.keys[0] = key;
            root.num = 1;
        }
        else {
            // When the root node is full, the tree will grow high
            if (root.num == 2*MinDeg-1){
                BTreeNode s = new BTreeNode(MinDeg,false);
                // The old root node becomes a child of the new root node
                s.children[0] = root;
                // Separate the old root node and give a key to the new node
                s.splitChild(0,root);
                // The new root node has 2 child nodes. Move the old one over there
                int i = 0;
                if (s.keys[0]< key)
                    i++;
                s.children[i].insertNotFull(key);

                root = s;
            }
            else
                root.insertNotFull(key);
        }
    }

    public void remove(int key){
        if (root == null){
            System.out.println("The tree is empty");
            return;
        }

        root.remove(key);

        if (root.num == 0){ // If the root node has 0 keys
            // If it has a child, its first child is taken as the new root,
            // Otherwise, set the root node to null
            if (root.isLeaf)
                root = null;
            else
                root = root.children[0];
        }
    }
}


public class vivek {

    public static void main(String[] args) {

        BTree t = new BTree(2); // A B-Tree with minium degree 2
        t.insert(1);
        t.insert(3);
        t.insert(7);
        t.insert(10);
        t.insert(11);
        t.insert(13);
        t.insert(14);
        t.insert(15);
        t.insert(18);
        t.insert(16);
        t.insert(19);
        t.insert(24);
        t.insert(25);
        t.insert(26);
        t.insert(21);
        t.insert(4);
        t.insert(5);
        t.insert(20);
        t.insert(22);
        t.insert(2);
        t.insert(17);
        t.insert(12);
        t.insert(6);

        System.out.println("Traversal of tree constructed is");
        t.traverse();
        System.out.println();

        t.remove(6);
        System.out.println("Traversal of tree after removing 6");
        t.traverse();
        System.out.println();

        t.remove(13);
        System.out.println("Traversal of tree after removing 13");
        t.traverse();
        System.out.println();

        t.remove(7);
        System.out.println("Traversal of tree after removing 7");
        t.traverse();
        System.out.println();

        t.remove(4);
        System.out.println("Traversal of tree after removing 4");
        t.traverse();
        System.out.println();

        t.remove(2);
        System.out.println("Traversal of tree after removing 2");
        t.traverse();
        System.out.println();

        t.remove(16);
        System.out.println("Traversal of tree after removing 16");
        t.traverse();
        System.out.println();
    }
} 
public class vivek {
    public static void main(String[] args) {

        BTree t = new BTree(2); // A B-Tree with minium degree 2
        t.insert(1);
        t.insert(3);
        t.insert(7);
        t.insert(10);
        t.insert(11);
        t.insert(13);
        t.insert(14);
        t.insert(15);
        t.insert(18);
        t.insert(16);
        t.insert(19);
        t.insert(24);
        t.insert(25);
        t.insert(26);
        t.insert(21);
        t.insert(4);
        t.insert(5);
        t.insert(20);
        t.insert(22);
        t.insert(2);
        t.insert(17);
        t.insert(12);
        t.insert(6);

        System.out.println("Traversal of tree constructed is");
        t.traverse();
        System.out.println();

        t.remove(6);
        System.out.println("Traversal of tree after removing 6");
        t.traverse();
        System.out.println();

        t.remove(13);
        System.out.println("Traversal of tree after removing 13");
        t.traverse();
        System.out.println();

        t.remove(7);
        System.out.println("Traversal of tree after removing 7");
        t.traverse();
        System.out.println();

        t.remove(4);
        System.out.println("Traversal of tree after removing 4");
        t.traverse();
        System.out.println();

        t.remove(2);
        System.out.println("Traversal of tree after removing 2");
        t.traverse();
        System.out.println();

        t.remove(16);
        System.out.println("Traversal of tree after removing 16");
        t.traverse();
        System.out.println();
    }
}
    


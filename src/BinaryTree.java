public class BinaryTree {
    class Node {
        int data;
        Node leftChild;
        Node rightChild;

        Node(int data){
            this.data = data;
            leftChild =  null;
            rightChild = null;
        }
    }
    Node root;
    BinaryTree() {
        root = null;
    }

    private Node insertUtil(Node node, int data) {
        if (node == null) {
           return new Node(data);
        }

        if(data < node.data){
            node.leftChild = insertUtil(node.leftChild,data);
        }

        if(data > node.data){
            node.rightChild = insertUtil(node.rightChild, data);
        }

        return node;
    }
    private void insert(int data){
        root = insertUtil(root, data);
    }
    private void inOrder(Node node){
        if (node == null){
            return;
        }

        inOrder(node.leftChild);

        System.out.print(node.data + " ");

        inOrder(node.rightChild);

    }
    private void preOrder(Node node){
        if (node == null){
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.leftChild);
        preOrder(node.rightChild);

    }
    private void postOrder(Node node){
        if (node == null){
            return;
        }
        postOrder(node.leftChild);
        postOrder(node.rightChild);
        System.out.print(node.data + " ");
    }

    private void delete(int data){
        root = deleteUtil(root, data);
    }
    private Node deleteUtil(Node root, int data){
        if(root == null){
            return null;
        }

        if(data < root.data){
           root.leftChild = deleteUtil(root.leftChild, data);
        } else if (data > root.data){
            root.rightChild = deleteUtil(root.rightChild,data);
        } else {

            //with one child
            if( root.leftChild == null){
                return root.rightChild;
            } else if ( root.rightChild == null){
                return root.leftChild;
            }


        }
        return root;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(20);
        tree.insert(30);
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(25);
        tree.insert(35);

        tree.inOrder(tree.root);
        System.out.println("");
        tree.preOrder(tree.root);
        System.out.println("");
        tree.postOrder(tree.root);
        System.out.println("");


    }


}

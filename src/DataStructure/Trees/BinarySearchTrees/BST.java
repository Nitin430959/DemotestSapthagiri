package DataStructure.Trees.BinarySearchTrees;
import java.util.LinkedList;
import java.util.Queue;


class Node {
    int key;
    Node left;
    Node right;

    Node(int key) {
    this.key = key;
    this.left = null;
    this.right = null;
}


}
public class BST {
    Node root;
    BST(){
        root=null;

    }

    static private Node insertRec(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.key) {
            root.left = insertRec(root.left, key);

        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    public void insert(int key){
        root=insertRec(root,key);
    }

    //search
    public boolean search(int key){
        return searchRec(root,key);
    }
    private boolean searchRec(Node root,int key){
        if(root==null){
            return false;
        }
        if (key==root.key){
            return true;
        }
        if(key<root.key){
            return searchRec(root.left,key);
        }else{
            return searchRec(root.right,key);
        }
    }
     private Node findSuccessor(Node node){
        while(node.left!=null){
            node=node.left;

        }
        return node;
     }
     private Node removeRec(Node root,int key){
        if(root==null){
            return null;
        }
        if(key<root.key){
            root.left=removeRec(root.left,key);

        }else if(key>root.key){
            root.right=removeRec(root.right,key);
        }else{
            // you found the target to be deleted!
            // case1 -Node with 0 or 1 child
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            //case2 - Node 2 children

            Node successor = findSuccessor(root.right);
            root.key=successor.key;
            root.right=removeRec(root.right,successor.key);
        }
        return root;
     }
     public void remove(int key){
        root=removeRec(root,key);
     }

    void DFS(Node root){
        if(root==null){
            return;
        }
        DFS(root.left);
        System.out.print(root.key+" ");
        DFS(root.right);
    }

    void BFS(){
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node temp=q.poll();
            System.out.print(temp.key+" ");
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }






        }
    }

}

class Driver{
    public static void main(String[] args){
        BST bst=new BST();
        bst.insert(100);
        bst.insert(50);
        bst.insert(180);
        bst.insert(30);
        bst.insert(80);
        bst.insert(60);
        bst.insert(150);
        bst.insert(180);
        bst.insert(200);

        System.out.print("BFS Traversal: ");
        bst.BFS();
        System.out.println();
        System.out.print("DFS InOrder Traversal: ");
        bst.DFS(bst.root);

        int key=10;
        System.out.print("Search "+key+ ": "+bst.search(key));



        bst.remove(150);
        System.out.println();
        System.out.print("DFS InOrder Traversal after deletion ");
        bst.DFS(bst.root);






    }
}

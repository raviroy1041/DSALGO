package Tree.BTree;

public class LeftView {

    static BTreeNode root;
    static int max_level=0;

    public static void main(String[] args) {
        LeftView tree=new LeftView();
        tree.root=new BTreeNode(10);

        tree.root.left = new BTreeNode(2);
        tree.root.right = new BTreeNode(3);
        tree.root.left.left = new BTreeNode(7);
        tree.root.left.right = new BTreeNode(8);
        tree.root.right.right = new BTreeNode(15);
        tree.root.right.left = new BTreeNode(12);
        tree.root.right.right.left = new BTreeNode(14);
        tree.leftView();
    }

    private void leftView() {

        max_level=0;
        leftViewUtil(root,1);

    }

    private void leftViewUtil(BTreeNode root, int level) {

        if(root==null)
            return;
        if(max_level<level){
            System.out.println(root.data);
            max_level=level;
        }
        leftViewUtil(root.right,level+1);
        leftViewUtil(root.left,level+1);
    }


}

class BTreeNode{
    int data;
    BTreeNode left;
    BTreeNode right;
    BTreeNode(int data){
        this.data=data;
        left=null;
        right=null;
    }

}

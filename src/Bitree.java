import java.util.Scanner;

public class Bitree {
    String data;
    Bitree left;
    Bitree right;
}
class NTree{
    public Bitree insert( Bitree node,String data){
        if (node==null){
            Bitree n=new Bitree();
            n.data=data;
            n.left=null;
            n.right=null;
            return n;
        }
        if (data.compareToIgnoreCase(node.data)<=0){
            node.left=insert(node.left ,data);
        }
        else if (data.compareToIgnoreCase(node.data)>0){
            node.right=insert(node.right ,data);
        }
        return node;
    }
    public static Bitree minElemant(Bitree minNode){
        if (minNode.left==null)return minNode;
        else return minElemant(minNode.left);
    }

    void inorder(Bitree n){
       if (n==null)return;
       inorder(n.left);
        System.out.print(n.data+",");
        inorder(n.right);
    }


}
class A{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NTree a= new NTree();
        Bitree root = null;
        System.out.println("How many name to enter?");
        int n=scanner.nextInt();
        System.out.println("Enter"+n+"name");
        for (int i=0; i<n; i++){
            String str=scanner.next();
            root = a.insert(root , str);
        }
        a.inorder(root);
    }
}

public class Main {
    public static void main(String[] args) {
        FlappyBird<Character> BST = new FlappyBird<>();

        System.out.print("Tambah data:");
            BST.insert();
        System.out.print("\nPost order : ");
            BST.postorder();
        System.out.print("\nPre order : ");
            BST.preorder();
        System.out.print("\nIn order : ");
            BST.inorder();
    }
}
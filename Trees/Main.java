public class Main {
    public static void main(String[] args) {
        AVL tree = new AVL();

        int[] values = {30, 10, 20, 40, 50, 25};
        tree.populate(values);

        tree.display();

        

        System.out.println("Is tree balanced? " + tree.balanced());
        
    }
}

package Main;

import AVLTree.*;

public class Main {
    public static void main(String[] args) {
        AVLTree<Integer> avl = new AVLTree<Integer>();
        avl.insert(5);
        avl.insert(10);
        avl.insert(-2);
        avl.insert(7);
        avl.insert(0);
        avl.insert(3);
        avl.print();
    }
}
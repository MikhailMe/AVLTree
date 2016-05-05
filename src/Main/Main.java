package Main;

import AVLTree.AVLTree;

public class Main {
    public static void main(String[] args) {
        AVLTree<Integer> avl = new AVLTree<Integer>();
        avl.insert(1);
        avl.insert(2);
        avl.insert(5);
        avl.insert(6);
        avl.insert(0);
        avl.insert(-4);
        avl.insert(-6);
        avl.insert(12);
        avl.insert(-1);
        avl.print();
    }
}
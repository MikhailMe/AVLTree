package AVLTree;

public class Node<T extends Comparable<T>> implements Comparable<T>{

    private T data;
    private int h;
    private int balance;
    private Node<T> left;
    private Node<T> right;
    private Node<T> parent;

    public Node(){
        this.data = null;
        left = this;
        right = this;
        parent = this;
    }
    public Node(T newData, Node<T> newParent) {
        this.data = newData;
        this.parent = newParent;
        this.left = null;
        this.right = null;
        this.h = 1;
        this.balance = 0;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public Node<T> getRight() {
        return right;
    }
    public void setRight(Node<T> right) {
        this.right = right;
    }
    public Node<T> getLeft() {
        return left;
    }
    public void setLeft(Node<T> left) {
        this.left = left;
    }
    public Node<T> getParent() {
        return parent;
    }
    public void setParent(Node<T> parent) {
        this.parent = parent;
    }
    @Override
    public int compareTo(T o) {
        return o.compareTo(data);
    }
}
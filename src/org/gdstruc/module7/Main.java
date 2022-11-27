package org.gdstruc.module7;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

        // getting the min & max
        System.out.println("Minimum: " + tree.getMin());
        System.out.println("Maximum: " + tree.getMax());
        System.out.println("\n");

        // reverse traverse-in-order
        System.out.println("Traverse in Order");
        tree.traverseInOrder();
        System.out.println("\n");
        System.out.println("Traverse in Descending Order");
        tree.traverseInOrderDescending();

        //System.out.println(tree.get(1000));
    }
}
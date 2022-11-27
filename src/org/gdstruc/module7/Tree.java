package org.gdstruc.module7;

public class Tree {
    private Node root;
    private Node current;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        }
        else {
            root.insert(value);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

    public Node getMin()
    {
        current = root;

        while (current != null)
        {
            current = current.getMin();
            if (current.getMin() == null)
            {
                break;
            }
        }

        return current;
    }

    public Node getMax()
    {
        current = root;
        while (current != null)
        {
            current = current.getMax();
            if (current.getMax() == null)
            {
                break;
            }
        }
        return current;
    }

    public void traverseInOrderDescending() {
        if (root != null) {
            root.traverseInOrderDescending();
        }
    }

    public Node get(int value) {
        if (root != null) {
            return root.get(value);
        }

        return  null;
    }
}

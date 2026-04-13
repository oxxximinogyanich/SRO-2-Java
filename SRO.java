class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

public class SRO {

    // Вставка в бинарное дерево поиска
    public static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // Вывод дерева
    public static void printTree(Node node, int level, String prefix) {
        if (node != null) {
            System.out.println(" ".repeat(level * 4) + prefix + node.value);
            printTree(node.left, level + 1, "L--- ");
            printTree(node.right, level + 1, "R--- ");
        }
    }

    public static void main(String[] args) {
        Node root = null;

        int[] values = {10, 5, 15, 3, 7, 12, 18};

        for (int v : values) {
            root = insert(root, v);
        }

        printTree(root, 0, "Root: ");
    }
}

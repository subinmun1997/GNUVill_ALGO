import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Way_finding_game {


    private class Node {
        public int value;
        public int y;
        public int x;

        public Node(int value, int y, int x) {
            this.value = value;
            this.y = y;
            this.x = x;
        }
    }

    private class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public Node node;

        public TreeNode(Node node) {
            this.node = node;
        }
    }

    private class BinaryTree {
        private TreeNode root;
        private int size;


        public void addNode(Node node) {
            TreeNode tmpNode = null;
            size++;

            if(root == null) {
                root = new TreeNode(node);
                return;
            }

            tmpNode = root;

            while(true) {

                if(node.x < tmpNode.node.x) {
                    if(tmpNode.left == null) {
                        tmpNode.left = new TreeNode(node);
                        break;
                    } else {
                        tmpNode = tmpNode.left;
                    }
                } else if (node.x > tmpNode.node.x) {
                    if(tmpNode.right == null) {
                        tmpNode.right = new TreeNode(node);
                        break;
                    } else {
                        tmpNode = tmpNode.right;
                    }
                }

            }

        }

        public ArrayList<Integer> getPreorderList() {
            ArrayList<Integer> list = new ArrayList<>();

            findPreorder(list, root);

            return list;
        }

        public ArrayList<Integer> getPostorderList() {
            ArrayList<Integer> list = new ArrayList<>();

            findPostorder(list, root);

            return list;
        }

        private void findPreorder(List<Integer> list, TreeNode node) {
            if(node == null)
                return;

            list.add(node.node.value);
            findPreorder(list, node.left);
            findPreorder(list, node.right);
        }

        private void findPostorder(List<Integer> list, TreeNode node) {
            if(node == null)
                return;

            findPostorder(list, node.left);
            findPostorder(list, node.right);
            list.add(node.node.value);
        }

        public int getSize() {
            return size;
        }

    }

    private int index = 0;

    public int[][] solution(int[][] nodeinfo) {
        BinaryTree tree = new BinaryTree();

        Node[] nodeList = Arrays.stream(nodeinfo)
                .map(node -> new Node(++index, node[1], node[0]))
                .sorted((a, b) -> {
                    if(a.y == b.y) {
                        return Integer.compare(a.x, b.x);
                    }

                    return -Integer.compare(a.y, b.y);
                })
                .toArray(ary -> new Node[nodeinfo.length]);

        for (Node n : nodeList) {
            tree.addNode(n);
        }

        return new int[][] {
                tree.getPreorderList().stream().mapToInt(val -> val).toArray(),
                tree.getPostorderList().stream().mapToInt(val -> val).toArray()
        };
    }


}

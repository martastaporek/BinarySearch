import java.util.*;

public class Tree {

    private Node root;

    private void buildTree(List<Integer> numbers) {

        SortedSet<Integer> numbersSet = new TreeSet<>(numbers);
        Integer first = numbersSet.first();
        this.root = new Node(first);
        numbersSet.remove(first);

        for(Integer elem : numbersSet) {
            Node toAdd = findNode(elem);
        }

    }

    private Node findNode(Integer val) {
        while (true) {
            Node temp = this.root;
            if (this.root.value > val) { // val na prawo
                if (temp.children[0] != null && temp.children[1]){

            }
        }
    }



    private class Node {
        private Integer value;
        private Node[] children = new Node[2];

        private Node(Integer value) {
            this.value = value;
        }

        private void addChildren(Node child) { //call on object to which node is add
            if (this.value > child.value) {
                this.children[0] = child;
            } else {
                this.children[1] = child;
            }


        }
    }
}


}


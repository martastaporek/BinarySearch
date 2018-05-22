import java.util.*;

public class Tree {

    private Node root;

    private void buildTree(List<Integer> numbers) {

        SortedSet<Integer> numbersSet = new TreeSet<>(numbers);
        Integer first = numbersSet.first();
        this.root = new Node(first);
        numbersSet.remove(first); // create first node, root

        for(Integer elem : numbersSet) {
            addLeaf(elem);
        }

    }


    private void addLeaf(Integer val) {
        Node parent = null;
        Node current = root;
        boolean loopContinue = true;

        while(loopContinue){
            parent = current;
            if(val< current.value){
                current = current.children[0];
                if(current==null){
                    parent.children[0] = new Node(val);
                    loopContinue = false;
                }
            }else{
                current = current.children[1];
                if(current==null){
                    parent.children[0] = new Node(val);
                    loopContinue = false;
                }
            }
        }
    }



    private class Node {
        private Integer value;
        private Node[] children = new Node[2];

        private Node(Integer value) {
            this.value = value;
        }

        }

    }





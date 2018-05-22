import java.util.*;

public class Tree {

    private Node root;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void buildTree(List<Integer> numbers) {

        SortedSet<Integer> numbersSet = new TreeSet<>(numbers);
        Integer first = numbersSet.first();
        this.root = new Node(first);
        numbersSet.remove(first); // create first node, root
        ++size;

        for(Integer elem : numbersSet) {
            addLeaf(elem);
            ++size;
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
                    parent.children[1] = new Node(val);
                    loopContinue = false;
                }
            }
        }
    }

    public boolean findValue(int val){

        Node current = root;
        boolean loopContinue = true;

        while(loopContinue){
            if(val == current.value){
                return true;
            }
            if(val < current.value){
                current = current.children[0];
                if(current == null){
                    return false;
                }

            }else{
                current = current.children[1];
                if(current == null){
                    return false;
                }
            }
        }
        return false;
    }



    private class Node {
        private Integer value;
        private Node[] children = new Node[2];

        private Node(Integer value) {
            this.value = value;
        }
    }

    }





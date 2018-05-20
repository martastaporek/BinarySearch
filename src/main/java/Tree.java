public class Tree {
    

    private class Node{
        private Integer value;
        private Node [] children = new Node[2];

        private void Node(Integer value){
            this.value = value;
        }

        private void addChildren(Node child){ //call on object to which node is add
            if(this.value > child.value){
                this.children[0] = child;
            }else{
                this.children[1] = child;
            }


        }
    }


}


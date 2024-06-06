public class FlappyNode<E extends Comparable<E>> {
    public FlappyNode<E> leftNode;
    public E data;  
    public FlappyNode<E> rightNode;

    public FlappyNode(E item) {
        data = item;
        leftNode = rightNode = null;
    }

    public E getData() {
        return data;
    }

    public FlappyNode<E> getLeftNode() {
        return leftNode;
    }

    public FlappyNode<E> getRightNode() {
        return rightNode;
    }
    
    public void insert(E insertValue) {
        if (insertValue.compareTo(data) < 0) {
        if (leftNode == null) {
            leftNode = new FlappyNode<E>(insertValue);
        } else {
            leftNode.insert(insertValue);
            }
        }
        else if (insertValue.compareTo(data) > 0) {
            if (rightNode == null) {
                rightNode = new FlappyNode<E>(insertValue);
            } else { 
                rightNode.insert(insertValue);
            }
        }
    }
}

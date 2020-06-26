public class Stack {

    Node stackTop;

    public void push(Point aPoint) {
        Node tempNode = new Node();
        tempNode.aPoint = aPoint;
        tempNode.next = stackTop;
        stackTop = tempNode;
    }

    public Point pop() {
        Point tempPoint = stackTop.aPoint;
        stackTop = stackTop.next;
        return tempPoint;
    }

    public boolean isEmpty() {
        return stackTop == null;
    }

}

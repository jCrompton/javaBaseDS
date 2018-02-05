public class Stack {
  private static class Node {
    private int data;
    private Node next;
    private Node(int data){
      this.data = data;
    }
  }
  private Node top;

  public boolean isEmpty() {
    return top == null;
  }
  public int peek() {
    return top.data;
  }
  public void push(int data) {
    Node node = new Node(data);
    node.next = top;
    top = node;
  }
  public int pop() {
    int data = top.data;
    top = top.next;
    return data;
  }
  public static void main(String[] args) {
    Stack stack = new Stack();
    Stack stack2 = new Stack();
    stack.push(3);
    stack.push(4);
    while (!stack.isEmpty()){
      System.out.println(stack.pop());
    }
    System.out.println(stack2.isEmpty());
    System.out.println(stack.peek());
  }
}

public class tester {
    public static void main(String[] args) throws Exception {
        ArrayStack<String> myStack = new ArrayStack<String >();
        System.out.println("top count: " + myStack.top);
        myStack.push("pie");
        System.out.println("top count: " + myStack.top);
        try {
            System.out.println("My element after pop: " + myStack.pop());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("top count: " + myStack.top);
    }
}

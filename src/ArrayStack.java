public class ArrayStack<Object> implements Stack{
    int max = 1000;
    String[] stkAry = new String[max];
    int top = 0;


    @Override
    public void push(java.lang.Object item) {
        if(stkAry[stkAry.length-1] == null){
            stkAry[top] = (String) item;
            top++;
        }
    }

    @Override
    public String pop() throws Exception {
        if(top > 0){
            return stkAry[--top];
        }
        return null;
    }

    @Override
    public String peek() throws Exception {
       if(top > 0){
           return stkAry[top-1];
       }
        return null;
    }

    @Override
    public boolean empty() {
       return top ==0;
    }
}
public class ArrayQueue<Object> implements Queue{
	int max = 1000;
	String[] stkAry = new String[max];
	int head = 0;
	int tail = 0;

	@Override
	public java.lang.Object dequeue() throws Exception {
		if(stkAry[head]!=null){
			return stkAry[head++];
		}
		return null;
	}

	@Override
	public void enqueue(java.lang.Object item) {
		if(stkAry[stkAry.length-1] == null){
			stkAry[tail++]= (String) item;
		}
	}

	@Override
	public boolean empty() {
		return head == tail;
	}
}
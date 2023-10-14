package OOPsDemo;

public class queue {
     
	 private int front;
	 private int rear;
	 private int size;
	 private int cap;
	 private int [] data;
	
	public queue() {
		
		size=0;
		front=0;
		rear=0;
		cap=5;
		data= new int[cap];
	}
	
	public boolean IsEmpty() {
		
		return size==0;
	}
	
	public boolean Isfull() {
		
		return size==cap;
	}
	
	public int GetSize() {
		
		return size;
	}
	
	public void Enque(int val) throws Exception {
		
		 if(Isfull()){
			
			throw new Exception("Queue Overflow");
		}else {
			
			data[rear]=val;
			rear= (rear+1)%cap;
			size++;
		}
	}
	
	public int deque() throws Exception {
		
		if(IsEmpty()) {
			
			throw new Exception("Queue is Empty");
		}else {
			int val= data[front];
			front=(front+1)%cap;
			size--;
			return val;
		}
	}
	
	public int peek() throws Exception {
		
       if(IsEmpty()) {
			
			throw new Exception("Queue is Empty");
		}else {
			int val= data[front];
//			front=(front+1)%cap;
//			size--;
			return val;
		}
	}
	
	public void display() {
		
		 int index=front;
		 
		 int temp=size;
		 
		 while(temp>0) {
			 System.out.println(data[index]+" ");
			 index= (index+1)%cap;
			 temp--;
		 }
	}
}

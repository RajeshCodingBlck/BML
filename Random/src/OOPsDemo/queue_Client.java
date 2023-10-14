package OOPsDemo;

public class queue_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     queue q= new queue();
     
        q.Enque(2);
        q.Enque(3);
        q.Enque(4);
        q.Enque(50);
        q.Enque(80);
        q.display();
        System.out.println();
        
        System.out.println(q.deque());
        System.out.println(q.deque());
        System.out.println(q.deque());
        System.out.println(q.deque());
        q.Enque(5);
        q.Enque(6);
        q.display();
//        q.Enque(7);
	}

}

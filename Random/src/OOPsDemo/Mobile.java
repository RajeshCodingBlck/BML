package OOPsDemo;

public class Mobile {
    
	  static int b=13;
	 String Brand="Raju";
	 
	 static int a=13;
	 int camera=10;
	 
	 
	 Mobile(){
		 Brand="Ram";
		 
	 }
	 
	 
	 public void Intro() {
		 
		 System.out.println("hello");
	 }
	 
	 public void get(int cam) throws Exception{
		 if(cam<0) {
			 
			 throw new Exception("cam is neg");
			 }else {
				 this.camera=cam;
			 }
		 
		 
		 
	 }


	
	 
}

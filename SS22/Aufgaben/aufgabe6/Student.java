package aufgabe6;



public class Student implements Listener  {

	private String name; 
	private Publisher publisher;

 public Student(String name) {
	 this.name=name;
 }

	
	@Override
	public void update() {
		String msg =publisher.getUpdate(this);
		System.out.println( this.name + " received " + msg);
		
	}

	@Override
	public void setPublisher(Publisher publisher) {

     publisher.register(this);  //// was geht hier ab ? Fragestunde
		this.publisher=publisher;
		System.out.println(this.name+" registered !");

	}

	@Override
	public void removePublisher(Publisher publisher) {
		publisher.unregister(this);
		
		System.out.println(this.name+" deregistered!");
		
	}
	
	
    @Override
    public boolean equals(Object other)
    {
        if(other==null) return false;       
        if(this==other) return true;       
        if(this.getClass() != other.getClass()) return false;           

        Student otherV = (Student)other;
        return this.name.equals(otherV.name);
}
    @Override
    public int hashCode() {
    	return name.hashCode();
    }
	
}

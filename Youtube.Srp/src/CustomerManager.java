
public class CustomerManager {
	
	public void TransactionOperation() {
		
		
		Update();
		Insert(); 
	}

	
	public void Insert() {
		MyContext context = new MyContext();
		context.Update();
	}
	
	public void Update() {
		MyContext context = new MyContext();
		context.Update();
	}
	
	
}

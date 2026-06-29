package PreparedStatementMySQL;

/**
 * 
 */
public class AddRemobeDriver {
	public static void main(String[] args) throws Exception{
		Add add_thread = new Add();
		Remove delete_thread = new Remove();
		
		add_thread.start();
		add_thread.join();
		delete_thread.start();
		delete_thread.join();
		
		
		
		
	}
}

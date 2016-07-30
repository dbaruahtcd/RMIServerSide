import java.rmi.*;   
import java.rmi.registry.LocateRegistry;
 
public class AdditionServer {
	   public static void main (String[] args) {
		   try {
			   System.setSecurityManager(new RMISecurityManager());
			   LocateRegistry.createRegistry(44332);
			   Addition Hello = new Addition();			   		   
			   Naming.rebind("rmi://127.0.0.1:44332/ABC", Hello);
 
			   System.out.println("Addition Server is ready.");
			   }catch (Exception e) {
				   System.out.println("Addition Server failed: " + e);
				}
		   }
}
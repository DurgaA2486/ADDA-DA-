package velloremaven;
import java.util.ResourceBundle;
public class App {
	public int login(String username,String userid){
		ResourceBundle rb= ResourceBundle.getBundle("config");
		String usern=rb.getString("username");
		String id=rb.getString("password");
		if(userid.equals(usern)&& userid.equals(id))
			return 1;
		else
			return 0;
	}

}

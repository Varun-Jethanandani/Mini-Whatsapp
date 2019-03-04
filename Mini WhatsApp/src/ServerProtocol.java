import java.net.Socket;

public class ServerProtocol {
	public String reciever;
    // public String processInput(String input){
    // 	if(input==null){
    // 		return 
    // 	}
    // }
    public Socket socket;
    public ServerProtocol(Socket socket){
    		this.socket = socket;
    }
    public String getRecieverName(){
    	return this.reciever;
    }
    public void setRecieverName(String reciever){
    	 this.reciever = reciever;
    }
}

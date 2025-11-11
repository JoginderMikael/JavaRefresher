package oneWaySocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocServer {

	public static void main(String[] args) throws IOException {
		
		//two sockets, one to accept all the request and the other for the client. 
		System.out.println("Server has started");
		ServerSocket serverSocket = new ServerSocket(9999);  //Socket for all the requests. 
		
		System.out.println("Server is waiting for client request....");
		Socket socket = serverSocket.accept(); //socket for client request.
		
		System.out.println("Client Connected.!!");
		
		//fetch data from client. 
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String str = bufferedReader.readLine();
		System.out.println("Client data : " + str);
		serverSocket.close();
	}

}

package oneWaySocketAndTwoWay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocServer {

	public static void main(String[] args) throws IOException {
		
		//two sockets, one to accept all the request and the other for the client. 
		System.out.println("S: Server has started");
		ServerSocket serverSocket = new ServerSocket(9990);  //Socket for all the requests. 
		
		System.out.println("S: Server is waiting for client request....");
		Socket socket = serverSocket.accept(); //socket for client request.
		
		System.out.println("S: Client Connected.!!");
		
		//fetch data from client. 
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String str = bufferedReader.readLine();
		
		System.out.println("S: Client data : " + str);
		
		//extract nick name from the full name.
		String nickName = str.substring(0, 3);
		
		//send nick name to client.
		OutputStreamWriter os = new OutputStreamWriter(socket.getOutputStream());
		PrintWriter out = new PrintWriter(os, true);
		out.println(nickName);
		out.flush();
		System.out.println("S: Nick name sent to client FROM SERVER.");
		
		
		serverSocket.close();
	}

}

package oneWaySocketAndTwoWay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		String ip = "localhost";
		int port = 9990;
		Socket socket = new Socket(ip, port);
		
		String str = "Joginder Mikael";
		
		//sending data to server
		OutputStreamWriter os = new OutputStreamWriter(socket.getOutputStream());
		PrintWriter out = new PrintWriter(os, true);
		out.println(str);
		os.flush();
		
		//receive nick name from server.
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String nickName = bufferedReader.readLine();
		System.out.println("C: Nick name received from server : " + nickName);
	
		
		
		socket.close();
	}

}

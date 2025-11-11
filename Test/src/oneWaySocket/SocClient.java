package oneWaySocket;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		String ip = "";
		int port = 9999;
		Socket socket = new Socket(ip, port);
		
		String str = "Joginder Mikael";
		OutputStreamWriter os = new OutputStreamWriter(socket.getOutputStream());
		//PrintWriter out = new PrintWriter(os);
		os.write(str);
		os.flush();
		socket.close();
	}

}

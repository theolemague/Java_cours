import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;;

public class Server {
	public static void main (String args[]){
		int numeroPort = 8089;
		try{
			ServerSocket connection = new ServerSocket(numeroPort);
			Socket socket = connection.accept();
			System.out.println("connection to"+ socket.getInetAddress());
			
			BufferedReader reader  = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			String line = reader.readLine();
			while (line != null){
				System.out.println(line);
				line = reader.readLine();
			}
			connection.close();
		}
		catch (IOException e){
			System.out.println("Error : input/output error");
		}
	}
}
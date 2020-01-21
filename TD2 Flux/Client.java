import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        int numeroPort = Integer.parseInt(args[0]);
        Socket socket = new Socket("localhost", numeroPort);
        OutputStream os = socket.getOutputStream();
        int val = 0;
        while (val != -1) {
            os.write(val);
		}
		socket.close();
    }
}

import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyClass{
	private static void copy(InputStream is, OutputStream os) throws IOException {
		while (true) {
			int b = is.read();
			if (b != -1) os.write(b);
			else break;
		}
	}
	public static void main (String args[]){
		int mode = args.length;
		InputStream in;
		OutputStream out;
		if (mode == 2){
			File f1 = new File(args[0]);
			File f2 = new File(args[1]);
			in = new FileInputStream(f1);
			out = new FileOutputStream(f2);
		}
		if (mode == 1) {
			File f1 = new File(args[0]);
			in = new FileInputStream(f1);
			out = new DataOutputStream(System.out);
		}
		else {
			in = new DataInputStream(System.in);
			out = new DataOutputStream(System.out);
		}	
		CopyClass.copy(in, out);
		in.close();
		out.close();
	}
}
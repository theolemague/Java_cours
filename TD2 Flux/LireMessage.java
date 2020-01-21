import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LireMessage{
	public static void main(String args[]){
		if (args.length > 1){
			try {
				File src = new File(args[0]);
				FileInputStream fls = new FileInputStream(src);
				ObjectInputStream ols = new ObjectInputStream(fls);

				Object message = ols.readObject();
				System.out.print(message);
				ols.close();
				fls.close();
			}
			catch(FileNotFoundException e){
				System.out.print("Error");
			}
			catch(IOException e){
				System.out.print("Error");
			}
			catch(ClassNotFoundException e){
				System.out.print("Error");
			}
			finally{
				System.out.print("End");
			}
			
			
			

		}
	}
}
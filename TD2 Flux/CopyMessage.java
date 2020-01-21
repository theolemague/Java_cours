import java.io.*;

public class CopyMessage {
    public static void main(String[] args){
        InputStream fin;
        OutputStream fout;
        try {
            switch (args.length){
                case 0:
                    fin = System.in;
                    fout = System.out;
                    Copy(fin, fout);
                    break;
                case 1:
                    fin = new FileInputStream(new File(args[0]));
                    fout = System.out;
                    Copy(fin, fout);
                    break;
                case 2:
                    fin = new FileInputStream(new File(args[0]));
                    fout = new FileOutputStream(new File(args[1]));
                    Copy(fin, fout);
                    break;
                default:
                    fin = new FileInputStream(new File(args[0]));
                    fout = new FileOutputStream(new File(args[1]));
                    break;
            }

        } catch(FileNotFoundException e){
            System.err.println("ERROR: File not found");
        } catch(IOException e) {

        }
    }

    private static void Copy(InputStream is, OutputStream os) throws IOException {
        int val = 0;
        while (val != -1) {
            val = is.read();
            os.write(val);
        }
        is.close();
        os.close();
    }
}
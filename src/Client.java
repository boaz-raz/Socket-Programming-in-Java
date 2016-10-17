import java.io.IOException;
import java.net.Socket;

/**
 * Created by boazraz on 10/16/16.
 */
public class Client {

    Socket MyClient;

    // for input stream
    DataInputStream input;

    // for output stream
    DataOutputStream output;



    public void openClientSocket(){
        try {
            MyClient = new Socket( "ec2-52-90-109-143.compute-1.amazonaws.com", 6000);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    public void inputStream(){
        try {
            input = new
                    DataInputStream(MyClient.getInputStream());
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    public void outStream(){
        try {
            output = new DataOutputStream(MyClient.getOutputStream()); }
        catch (IOException e) {
            System.out.println(e);
        }
    }

}

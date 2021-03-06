import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by boazraz on 10/16/16.
 */
public class Server {

    ServerSocket MyService;

    DataInputStream input;

    DataOutputStream output;

    // use DataInputStream to receive input from the client
    Socket serviceSocket = null;


    public void openServerSocket(){
        try {
            MyService = new ServerSocket(6000);
        }
        catch (IOException e) {
            System.out.println(e);
        }

    }

    //Create a socket object from the ServerSocket in order
    // to listen for and accept connections from clients.

    public void listenToClients(){
        try {
            serviceSocket =
                    MyService.accept();
        }
        catch (IOException e) {
            System.out.println(e);
        }

    }

    public void dataInputStream(){
        try {

            input = new
                    DataInputStream(serviceSocket.getInputStream());
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    public void dataOutputStream(){
        try {
            output = new DataOutputStream(serviceSocket.getOutputStream( ));
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    public void closeSocket(){
        try {
            MyService.close();
            MyService.close();
            serviceSocket.close();
            MyService.close();
        }
        catch (IOException e) {
        }
    }


}

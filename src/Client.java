import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;









public class Client
{

    static final int PORT = 1234;










    public static void main(String[] args)
    {
        Socket socket;

        try
        {
            socket = new Socket("localhost", PORT);

            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());







            // close everything
            inputStream.close();
            outputStream.close();
            socket.close();
        }
        catch (IOException e)
        {
            System.err.println("Client exeption : " + e);
        }







    }
}

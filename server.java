import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;


public class server {
    public static void main(String[] args) {
        
        try {
                System.out.println("Waiting for clients...");
                ServerSocket ss = new ServerSocket(4040);
                Socket soc = ss.accept();
                System.out.println("Connection established!");

                BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));

                String str = in.readLine();

                PrintWriter out = new PrintWriter(soc.getOutputStream(), true);

                out.println("Server message: " + str);
             }
             
    catch(Exception e) {
        e.printStackTrace();
    }
}
}
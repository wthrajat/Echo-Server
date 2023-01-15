import java.net.Socket;
import java.io.*;

public class client {
    public static void main(String[] args) {

        try {
            System.out.println("Client started...");
            Socket soc = new Socket("localhost", 4040);
            
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the message:");
        String str = userInput.readLine();

        PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
        
        out.println(str);

        BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        
        System.out.println(in.readLine());

        }
        catch (Exception e) {
            e.printStackTrace();
        }
}
}

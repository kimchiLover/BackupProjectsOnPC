package question4;

import java.io.*;
import java.net.Socket;

public class Q4client {

    public static void main(String[] args)  {

        try {
            Socket s = new Socket("localhost", 1234);

            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());


            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String in = br.readLine();


            dout.writeUTF(in);

            String str = din.readUTF();
            int n = Integer.parseInt(str);

            System.out.println("total files are " + str);
            while (true) {

                str = din.readUTF();
                System.out.println(str);
                n--;
                if (n == 0)
                    break;

            }

            //  System.out.println("bye");


            String[] input = br.readLine().split(" ");

            dout.writeUTF(input[0]);
            dout.writeUTF(input[1]);


            str = din.readUTF();


            if (str.equals("Ok")) {

                str = null;
                while (true) {
                    str = null;
                    str = din.readUTF();
                    System.out.println(str);

                    if (str.equals(null))
                        break;
                }
            } else
                System.out.println("Error");
        } catch (IOException e) {
                          }
    }
}
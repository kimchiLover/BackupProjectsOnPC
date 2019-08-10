
package question4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Q4server {

    public static  void  main(String [] args) throws IOException, NullPointerException{
        ServerSocket ss=new ServerSocket(1234);

        Socket s=ss.accept();

        System.out.println("Give Path of Directory ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String path=br.readLine();

        File f=new File(path);
        File arr[]=f.listFiles();

        DataOutputStream dout= new DataOutputStream(s.getOutputStream());
        DataInputStream din=new DataInputStream(s.getInputStream());


        String str=din.readUTF();

        ArrayList<String> arrayList = new ArrayList<>();

        if(str.equals("index"))
        {

            dout.writeUTF(String.valueOf(arr.length));
            for(int i=0;i<arr.length;i++) {
                // if(arr[i].isFile())
                dout.writeUTF(arr[i].getName());
                arrayList.add(arr[i].getName() ) ;
                System.out.println(arr[i].getName());
            }



            String inputFromClient[]=new String[2];

            inputFromClient[0]=din.readUTF();
            inputFromClient[1]=din.readUTF();


            System.out.println("Reply from Client is "+ inputFromClient[0]+ "  "+ inputFromClient[1]);


            if(inputFromClient[0].equals("get") && arrayList.contains(inputFromClient[1]))
            {
                ;dout.writeUTF("Ok");

                File f1= new File(path+inputFromClient[1]);

                BufferedReader bf=new BufferedReader(new FileReader(f1));


                String temp1;
                while((temp1=bf.readLine())!=null)
                {
                    dout.writeUTF(temp1);
                }
                System.out.println("File sent sucessfully.");

            }
            else
                dout.writeUTF("Error in sending");

        }
    }
}
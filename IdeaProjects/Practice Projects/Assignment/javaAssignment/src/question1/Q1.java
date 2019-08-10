package question1;

import java.util.*; //for Scanner Class
import java.io.*;   // for Buffered Class

class Q1 {
    public static void main(String args[]) throws IOException { //Since BufferedReader is used
        /*Scanner sl = new Scanner(System.in);
        String consolePath = sl.nextLine();
        System.out.println(consolePath);*/

        /*InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);  //BufferedReader throws IOException
        String consolePath2 = br.readLine();
        System.out.println(consolePath2);*/

        Console c = System.console();
        String consolePath3 = c.readLine();
        //System.out.println(consolePath3);

        File f = new File(consolePath3); //java.io was used

        if(f.isDirectory()) {
            File dir[] = f.listFiles();
            for (int i = 0; i < dir.length; i++)
                System.out.println(dir[i].getName());
        }
        else
        System.out.println(f.getName());
    }
}
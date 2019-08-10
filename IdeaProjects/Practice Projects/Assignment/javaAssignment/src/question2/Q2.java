package question2;

import java.util.*;
import java.io.*;

class Q2 {
    public static void main(String args[]) throws IOException {

        for(int i=0;i<args.length;i++){

            BufferedReader br = null;
            FileReader fr =  null;
            File f = null;

            try {
                f = new File(args[i]);
                fr = new FileReader(f);
                br = new BufferedReader(fr);
            }
            catch (Exception e) {

                int idx=args[i].lastIndexOf(".");
                int idx2=args[i].lastIndexOf("/");

                if(idx==-1||idx2==-1) {
                    System.out.println("Invalid pathname");
                    continue;
                }

                String filename =args[i].substring(idx2+1);
                System.out.println("Error in opening "+filename);
                continue;
            }

            int linecount = 0;

            try {

                while (br.readLine() != null)
                    linecount++;

                fr.close();

                System.out.println(f.getName() + " " + linecount);
            }
            catch (Exception e){
                System.out.println("Error in reading the file.");
            }

        }
    }
}
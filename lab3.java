//buffer
import  java.io.*;
public class lab3 {

    public static void main(String args[]) {

        String a0, a1, a2;

        if (args.length != 3){
            a0 = "C:\\Users\\Trung tam TNTH\\IdeaProjects\\IO1\\src\\plaintext.txt";
            a1 = "C:\\Users\\Trung tam TNTH\\IdeaProjects\\IO1\\src\\encryptedtext.txt";
            a2 = "3";
        } else{
            a0 = args[0];
            a1 = args[1];
            a2 = args[2];
        }

        SimpleEncryption se = new SimpleEncryption();
        se.encrypt(a0, a1, Integer.parseInt(a2));

        /* print content of encrypted file */
        System.out.println("Displaying encrypted words from words.txt...");
        se.viewFileContent(a1);

    }
}

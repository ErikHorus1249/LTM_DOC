import java.io.*;

public class lab2 {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("C:\\Users\\Trung tam TNTH\\IdeaProjects\\IO1\\src\\dimin1.txt");
        File outputFile = new File("C:\\Users\\Trung tam TNTH\\IdeaProjects\\IO1\\src\\dimout.txt");

        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        int c;

        while ((c = in.read()) != -1){
            System.out.println(c);
            out.write(c);
        }

        System.out.println("FileInputStream is used to read a file and FileOutPutStream is used for writing.");

        in.close();
        out.close();
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {
    File file = new File("C:\\Users\\Personal\\Desktop\\JavaDSA\\Welcome.txt");
    public static void main(String[] args) {
        fileHandling file = new fileHandling();
//        file.createFile();
//         createFile.writeFile();
//        file.readFile();
        file.deleteFile();
    }
    void createFile(){
        try {
            if(file.createNewFile()){
                System.out.println("File Created Successfully " +file.getName());
            }else{
                System.out.println("File not Created");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    void writeFile(){
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Welcome to Pune");
            fileWriter.close();
            System.out.println("File Written Successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void readFile(){
        try{
            Scanner sc = new Scanner(file);
            String content = sc.nextLine();
            System.out.println(content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    void deleteFile(){
        file.delete();
        System.out.println("File Deleted Successfully");
    }
}

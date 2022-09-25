package mentorAssignment;

import java.io.*;

public class JavaFileReading {

    public static void main(String[] args) {

       String path =  "C:\\Users\\Zerome\\IdeaProjects\\Assignments\\src\\mentorAssignment\\JavaFileReading.java";
       String destPath = "E:\\CopyFile.java";
       File source = new File(path);
       File destination = new File(destPath);

       int[] x = reader(path, source, destination);
       System.out.println("File Name : " +source.getName() + "\nCharacters : " + x[0] + "\nRows : " + x[1]);
        System.out.println("Copy Filed Destination : " + destPath);
    }


    private static int[] reader(String path, File f, File f2) {
        int charCount = 0,row = 0;
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            boolean flag = f2.createNewFile();
            FileWriter fw = new FileWriter(f2);
            String line;
            while((line = br.readLine()) != null){
                fw.write(line + "\n");
                fw.flush();
                charCount += characterCounter(line);
                row++;

            }
        } catch(FileNotFoundException e)
        {
            System.out.print("File not found.");
        }
        catch(IOException k)
        {
            System.out.print("Different input-output exception.");
        }catch (Exception e1){
            System.out.println("Error");
        }
        return new int[]{charCount,row};
    }
    private static int characterCounter(String line) {
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if(line.charAt(i) != ' ') count++;
        }
        return count;
    }
}
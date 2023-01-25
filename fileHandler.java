import java.io.*;
import java.util.ArrayList;


public class fileHandler {


    public void readTheWholeThing(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName));) {
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readOneLine(String fileName, int lineNumber) {
        ArrayList<String> contents = new ArrayList();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName));) {
            String line = br.readLine();
            while (line != null){
                contents.add(line);
                line = br.readLine();
            }
            System.out.println(contents.get(lineNumber));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList arrayMaker(String fileName){
        ArrayList<String> names = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            while (line != null){
                names.add(line);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return names;
    }

    public boolean fileSearch(String fileName, String loginName){
        boolean found = false;
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {

                if (line.equals(loginName)) {
                    found = true;
                }
                line = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return found;
    }

    public void writeToAdd(String fileName, String inputThing, boolean append){
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName, append)); BufferedReader br = new BufferedReader(new FileReader(fileName))
        ){
          String line = br.readLine();
        
              while (line != null){
                line = br.readLine();
             }  
              pw.println(inputThing);
          
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void compactFile(String fileName){
        ArrayList<String> content = new ArrayList<>();
        ArrayList<String> newContent = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            while (line != null){
                content.add(line.replace(" ", ""));
                line = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName));
        ){
            for (int i =0; i<content.size(); i++)
                pw.print(content.get(i));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void createFile(String fileName) {
        File file = new File(fileName);

        try {
            file.createNewFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }







}









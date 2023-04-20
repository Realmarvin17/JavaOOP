package seminar5.Phonebook;

import java.util.ArrayList;
import java.io.*;

//rename class
public class FileManager {
    String FILE_PATH="./seminar5/Phonebook/";
    String FILE_NAME_EXPORT="export.csv";
    String FILE_PATH_FULL=FILE_PATH+FILE_NAME_EXPORT;

    ArrayList<Phonebook> phb = new ArrayList<>();

    public void ExportFile(ArrayList<Phonebook> pb){
        try(FileWriter writer=new FileWriter("export.csv"
          ,false))
        {
            for(Phonebook i:pb){
                String text=i.getName()+";"+i.getPhone()+";"+i.getCity();
                writer.write(text);
                writer.append('\n');
            }

            writer.flush();
        }
          catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<Phonebook> ImportFile(){
        try
        {
            File file=new File(FILE_PATH_FULL);
            FileReader fr=new FileReader(file);
            //remove not usage variable
            BufferedReader reader=new BufferedReader(fr);
            String line=reader.readLine();

            while(line!=null){
                // System.out.println(line);
                String[] tmp=line.split(";");
                phb.add(new Phonebook(tmp[0],tmp[1],tmp[2]));
                line=reader.readLine();
            }
        } catch(IOException e){
            e.printStackTrace();
        }

        return phb;
    }
}
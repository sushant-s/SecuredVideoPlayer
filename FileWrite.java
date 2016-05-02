import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class FileWrite {
    static BufferedReader in;
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        write_function1();
        long end =  System.currentTimeMillis();
        System.out.println("Total time for writing 1 file 235000 = "
           + (end - start) / 1000f + " seconds");
    }
    public static void write_function1(){
        try {
            List<String> myarraylist = new ArrayList<String>();
            BufferedWriter bw = null;
            String str;
            in = new BufferedReader(new FileReader("your_path"));
                while ((str = in.readLine()) != null ){
                    myarraylist.add(str);
                }
                int stationline = myarraylist.indexOf("str00000.ts");
                System.out.println(Integer.toString(stationline));
                String line1 = "#EXT-X-KEY:METHOD=AES-128,URI=\"https://onlinetyari/videos/player/drive-key.php\",IV=0x52616e646f6d496e6974566563746f72";
                myarraylist.add((stationline-1), line1);
                File file = new File("your_path");
                bw = new BufferedWriter(new FileWriter(file));
                for(int i =0; i< myarraylist.size(); i++){                   
                bw.write(myarraylist.get(i));
                bw.newLine();
                }
                bw.flush();
                bw.close();
                myarraylist.clear();
                myarraylist.removeAll(myarraylist); 
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }finally {
            if(in != null){
                try {
                    in.close(); 
                } catch (IOException e) {
                }
            }
        }   
    }   
}

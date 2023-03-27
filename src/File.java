import java.io.*;

public class File {
    public String fileReader(String file) {
        FileReader reader;
        String result = "";
        try {
            reader = new FileReader(file);
            int caracter = reader.read();
            while (caracter != -1) {
                result += (char) caracter;
                caracter = reader.read();
            }
            reader.close();
        } catch (IOException ex) {
            result = ex.toString();
        }
        return result;
    }

    public boolean saveData(String str, String file, boolean bool) {
        FileWriter writer;
        try {
            writer = new FileWriter(file, bool);
            writer.write(str);
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
            return false;
        }
        return true;
    }
}

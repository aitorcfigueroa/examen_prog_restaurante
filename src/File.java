import java.io.*;
import java.util.ArrayList;

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

    public String objectReader(String file) {
        ArrayList<Object> objectArrayList = new ArrayList<>();
        FileInputStream reader;
        ObjectInputStream objectReader;
        Object object;
        try {
            reader = new FileInputStream(file);
            objectReader = new ObjectInputStream(reader);
            do {
                try {
                    object = objectReader.readObject();
                    objectArrayList.add(object);
                } catch (EOFException ex) {
                    object = null;
                }
            } while (object != null);
            objectReader.close();
            reader.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
            return ex.toString();
        }

        return objectArrayList.toString();
    }

    public boolean objectWriter(Menu objectList, String file, boolean bool) {
        FileOutputStream writer;
        ObjectOutputStream byteObject;

        try {
            writer = new FileOutputStream(file, bool);
            byteObject = new ObjectOutputStream(writer);
            byteObject.writeObject(objectList);
            byteObject.close();
            writer.close();
        } catch (IOException ex) {
            return false;
        }

        return true;
    }
}

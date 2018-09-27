import java.io.*;

public class ReadWriteFileExample {
    public String readFileText(String filePath) {
        String line = "";
        String returnValue = "";
        try {
            // Read the file by path
            File file = new File(filePath);

            // Check if the file does not exist and throw an exception
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader read = new BufferedReader(new FileReader(file));
            while ((line = read.readLine()) != null) {
                returnValue += line +"\n";
            }
            read.close();

        } catch (Exception e) {
            // The file does not exist or the file contains errors, it will display an error message.
            System.err.println("Fie does not exist or has defective content!");
        }
        return returnValue;
    }

    public void coppyFile(String filePath, String value) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            FileWriter fw = new FileWriter(file);
            fw.write(value);
            fw.close();
        } catch (Exception e) {
            System.err.println("@@@@@!");
        }
    }
}

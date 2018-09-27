import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter the file path: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        System.out.println("Enter the path to the file to write: ");
        String pathWrite = sc.nextLine();

        ReadWriteFileExample readWriteFileExample = new ReadWriteFileExample();
        readWriteFileExample.coppyFile(pathWrite,readWriteFileExample.readFileText(path));
    }
}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LeerTXT {

    private BufferedReader bf;

    public String LeerTXT() {
        String info = "";

        try {
            bf = new BufferedReader(new FileReader("ListadoProducto.txt"));
            String txt = "";
            String lectura;

            while ((lectura = bf.readLine()) != null) {
                txt = txt + lectura;
            }
            info = txt;

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");
        }
        return info;
    }

    public String LeerTXTop2() {
        String info = "";
        try {
            File texto = new File("ListadoProducto.txt");
            Scanner scanner = new Scanner(texto);
            while (scanner.hasNextLine()) {
                info = String.valueOf(scanner.hasNextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
            e.printStackTrace();
        }
        return info;
    }

}

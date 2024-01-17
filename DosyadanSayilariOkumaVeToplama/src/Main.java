import java.io.BufferedReader;
import java.io.FileReader;


public class Main {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("numbers.txt");
            BufferedReader input = new BufferedReader(file);
            String line;
            int total = 0;
            while ((line = input.readLine()) != null) {
                total += Integer.parseInt(line);
            }
            System.out.println("Sayıların Toplamı: " + total);
            input.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

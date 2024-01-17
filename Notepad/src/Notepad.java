import java.io.*;
import java.util.Scanner;

public class Notepad {
    static Scanner scanner = new Scanner(System.in);

    public static void run() {
        boolean isRun = true;
        do {
            System.out.println("==== Not Defteri ====");
            System.out.println();
            System.out.print("Yapmak istediğiniz işlemi seçiniz: \n1. Yeni Not Defteri Oluşturma\n2. Notları Oku\n3. Not Defterlerini Listele\n4. Not Silme\n5. Çıkış\nSeçiminiz : ");
            int choice = scanner.nextInt();
            System.out.println();
            System.out.println("--------------------");


            switch (choice) {
                case 1:
                    System.out.print("Dosya adını giriniz: ");
                    String fileName = scanner.next();
                    try {
                        Notepad.write(fileName);
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Not defteri oluşturuldu.");
                    System.out.println("--------------------");
                    break;
                case 2:
                    System.out.print("Dosya adını giriniz: ");
                    String fileName2 = scanner.next();
                    System.out.println("--------------------");
                    try {
                        Notepad.read(fileName2);
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("--------------------");
                    break;
                case 3:
                    File file = new File("C:\\Users\\Pehli\\IdeaProjects\\Patika\\Hafta-6\\Notepad\\NotDefteri"); //Buraya kendi dosya yolunuzu yazınız.
                    String[] fileList = file.list();
                    assert fileList != null;
                    System.out.println("Not Defterleri: ");
                    System.out.println("--------------------");
                    int i = 1;
                    for (String name : fileList) {
                        System.out.println(i +". " + name);
                        i++;
                    }
                    System.out.println("--------------------");
                    break;
                case 4:
                    System.out.print("Silmek istediğiniz dosyanın adını giriniz: ");
                    String fileName3 = scanner.next();
                    File file2 = new File("C:\\Users\\Pehli\\IdeaProjects\\Patika\\Hafta-6\\Notepad\\NotDefteri\\" + fileName3 + ".txt"); //Buraya kendi dosya yolunuzu yazınız.
                    if (file2.delete()) {
                        System.out.println("Dosya silindi.");
                    } else {
                        System.out.println("Dosya silinemedi.");
                    }
                    System.out.println("--------------------");
                    break;
                case 5:
                    System.out.println("Çıkış yapılıyor...");
                    isRun = false;
                    break;
                default:
                    System.out.println("Yanlış seçim yaptınız.");
                    break;
            }
        } while (isRun);
    }


    public static void write(String fileName) throws IOException {

        try {
            File file = new File("C:\\Users\\Pehli\\IdeaProjects\\Patika\\Hafta-6\\Notepad\\NotDefteri\\" + fileName + ".txt"); //Buraya kendi dosya yolunuzu yazınız.
            PrintWriter output = new PrintWriter(file);
            System.out.print("Notunuzu giriniz: ");
            String data1 = scanner.nextLine();
            String data = scanner.nextLine();
            output.print(data);
            output.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void read(String fileName) throws IOException {

        FileReader fileReader = new FileReader("C:\\Users\\Pehli\\IdeaProjects\\Patika\\Hafta-6\\Notepad\\NotDefteri\\" + fileName + ".txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String okunanMetin = bufferedReader.readLine();
        System.out.println(okunanMetin);
        bufferedReader.close();
    }
}


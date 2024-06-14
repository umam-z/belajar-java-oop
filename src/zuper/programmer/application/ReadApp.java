package zuper.programmer.application;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadApp {
    public static void main(String[] args) {
        // manual
        // BufferedReader reader = null;
        // try {
        //     reader = new BufferedReader(new FileReader("README.md"));
        //     while (true) {
        //         String line = reader.readLine();
        //         if (line == null) {
        //             break;
        //         }
        //         System.out.println(line);
        //     }
        // } catch (Throwable e) {
        //     System.out.println("Error Membaca File " + e.getMessage());
        // } finally {
        //     if (reader != null) {
        //         try {
        //             reader.close();
        //             System.out.println("Sukses Menutup");
        //         } catch (IOException e) {
        //             System.out.println("Error menutup resource " + e.getMessage());
        //         }
        //     }
        // }

        // try with resource
        try(BufferedReader reader = new BufferedReader(new FileReader("RADME.md"));) {
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable e) {
            System.out.println("Error Membaca File " + e.getMessage());
        }
    }
}

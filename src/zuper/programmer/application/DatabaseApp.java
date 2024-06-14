package zuper.programmer.application;

import zuper.programmer.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("umam", null);
        System.out.println("Sukses");
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("tidak terhubung ke database");
        }
    }
}

package zuper.programmer.application;

public class StackTraceApp {
    public static void main(String[] args) {
        try {
            sampleError();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public static void sampleError() {
        try {
            String[] names = {
                "Mohammad", "Sirajul", "Umam"
            };
            System.out.println(names[3]);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}

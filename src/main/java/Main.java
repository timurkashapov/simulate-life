import ui.MainWindow;

/**
 * Entry point for app.
 * Created by shako on 6/3/2017.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");


        try {
            // Create Main Window
            new MainWindow();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}

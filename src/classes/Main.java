package classes;


/**
 * Created by ABoK4Do on 11.12.16.
 */
public class Main {
    public static void main(String[] args)
    {
        DataBaseWorker.addOne("Milk", 78);
        DataBaseWorker.addOne("Cake", "second", 100);
        DataBaseWorker.delOne("Cake");
        DataBaseWorker.showDB();
    }
}

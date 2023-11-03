import functions.*;
import functions.basic.Log;

public class Main {
    public static void main(String[] args) {
        try {
            Log logarifm = new Log(2);
            System.out.println(logarifm.getFunctionValue(125));
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
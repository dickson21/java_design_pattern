import framework.*;
import idcard.*;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("BCT");
        Product card2 = factory.create("Master");
        Product card3 = factory.create("Visa");
        card1.use();
        card2.use();
        card3.use();
    }
}


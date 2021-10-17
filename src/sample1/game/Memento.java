package game;
import java.util.Vector;

public class Memento {
    int money;                              // ��������`�B
    Vector fruits;                          // ���G
    public int getMoney() {                 // ���o��������`�B�]narrow interface�^
        return money;
    }
    Memento(int money) {                    // �غc�l�]wide interface�^
        this.money = money;
        this.fruits = new Vector();
    }
    void addFruit(String fruit) {           // �s�W���G�]wide interface�^
        fruits.add(fruit);
    }
    Vector getFruits() {
         return (Vector)fruits.clone();
    }
}

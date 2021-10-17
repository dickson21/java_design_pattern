import java.util.Vector;
import java.util.Iterator;

public abstract class NumberGenerator {
    private Vector observers = new Vector();        // �x�sObserver 
    public void addObserver(Observer observer) {    // �s�WObserver
        observers.add(observer);
    }
    public void deleteObserver(Observer observer) { // �R��Observer
        observers.remove(observer);
    }
    public void notifyObservers() {               // �q��Observer
        Iterator it = observers.iterator();
        while (it.hasNext()) {
            Observer o = (Observer)it.next();
            o.update(this);
        }
    }
    public abstract int getNumber();                // ���o�ƭ�
    public abstract void execute();                 // ���ͼƭ�
}

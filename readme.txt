Subject : Adapter pattern
Created : 2021-01-01
Author : dickson.cheng
Detail :
 adapter : printweak() --> showWithParen()
Uses :
An adapter allows two incompatible interfaces to work together.
Interfaces may be incompatible, but the inner functionality should suit the need. 
The adapter design pattern allows otherwise incompatible classes to work together 
by converting the interface of one class into an interface expected by the clients.


Structure :
Main -> PrintBanner extends Banner implements Print

Main   -> PrinterBanner -> Print   -> Banner
Client -> target        -> Adapter -> Adaptee

PrintBanner.printWeak() -> Print.printWeak() -> Banner.showWithParen();
PrintBanner.printStrong() -> Print.printStrong() -> Banner.showWithAster();

/* Print.java */
public interface Print {
    public abstract void printWeak();
    public abstract void printStrong();
}

/* Banner.java */
public class Banner {
    private String string;
    public Banner(String string) {
        this.string = string;
    }
    public void showWithParen() {
        System.out.println("(" + string + ")");
    }
    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}

/* PrinterBanner.java */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }
    public void printWeak() {
        showWithParen();
    }
    public void printStrong() {
        showWithAster();
    }
}

/* Main.java */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}

C:\myprogram\java\design-pattern\02-Adapter\Sample1\classes>java -cp ./ Main
(Hello)
*Hello*
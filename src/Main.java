import Decorator.Circle;
import Decorator.DrawDecRed;
import Decorator.Rectangle;
import Decorator2.CompressionDecorator;
import Decorator2.EncryptionDecorator;
import Decorator2.NormalFile;
import Factory.FileFactory;
import Factory.PDF;
import Factory.Word;
import Prototype.Laptop;
import Prototype.Registry;
import Prototype.Tablet;
import Proxy.InternetProxy;
import singletone.Accountant;

public class Main {

    public static void main(String[] args) {
        // singletone
//        Accountant a1 = Accountant.getInstance();
//            a1.info();
//
//        Accountant a2 = Accountant.getInstance();
//            a2.setFirstName("John");
//
//            a2.info();
//            a1.info();


        // prototype
//
        Laptop l1 = (Laptop) new Registry().getClone("Laptop");
        Tablet t1 = (Tablet) new Registry().getClone("Tablet");

        t1.setPrice(12.2);
        l1.display();
//        Laptop l1 = new Laptop("Lenovo", "16.5", "16GB", 100000, "mechanical");



//        Tablet t1 = new Tablet("Samsung", "16.5", "16GB", 4000);

//        t1.display();

        // factory
//        FileFactory f = new FileFactory("./test.java");
//        PDF p1 = (PDF) f.getFileType("pdf");
//        Word p2 = (Word) f.getFileType("word");
//
//        p1.delete();
//        p2.delete();

        // proxy
//
//        InternetProxy proxy = new InternetProxy();
//        proxy.connect("google.com");
//        proxy.connect("www.google.com");
        // decorator
//        Circle c = new Circle();
//        Rectangle r = new Rectangle();
//
//        DrawDecRed withRed = new DrawDecRed(c);
//        withRed.draw();
//        withRed.drawWithRed();
//
//        withRed = new DrawDecRed(r);
//        withRed.draw();
//        withRed.drawWithRed();
        // decorator 2

        NormalFile nf = new NormalFile("main.java");
        CompressionDecorator cd = new CompressionDecorator(nf);
        EncryptionDecorator ec = new EncryptionDecorator(nf);

        System.out.println(nf.read());
        nf.write("test.java");
        System.out.println("=============================");
        System.out.println(cd.read());
        cd.write("test.java");
        System.out.println("=============================");
        System.out.println(ec.read());
        ec.write("test.java");
    }

}
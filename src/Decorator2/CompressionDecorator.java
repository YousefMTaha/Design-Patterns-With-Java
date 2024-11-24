package Decorator2;

public class CompressionDecorator extends FileDecorator {

    public CompressionDecorator(File f) {
        super(f);
    }

    private void compress() {
        System.out.println("compress the file ");
    }

    private void deCompress() {
        System.out.println("deCompress the file ");
    }

    public String read() {
        deCompress();
        return f.read();
    }

    public void write(String fileName) {
        f.write(fileName);
        compress();
    }
}

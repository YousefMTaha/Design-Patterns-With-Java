package Decorator2;

public class EncryptionDecorator extends FileDecorator {

    public EncryptionDecorator(File f) {
        super(f);
    }

    private void encrypt() {
        System.out.println("encrypt the file ");
    }

    private void decrypt() {
        System.out.println("decrypt the file ");
    }

    public String read() {
        decrypt();
        return f.read();
    }

    public void write(String fileName) {
        f.write(fileName);
        encrypt();
    }
}

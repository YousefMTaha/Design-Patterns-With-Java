package Decorator2;

abstract public class FileDecorator implements File {
    File f;

    public FileDecorator(File f) {
        this.f = f;
    }

    @Override
    public String read() {
        return f.read();
    }

    @Override
    public void write(String fileName) {
        f.write(fileName);
    }
}

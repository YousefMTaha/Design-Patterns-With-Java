package Decorator2;

public class NormalFile implements File {

    private String fileName = "";

    public NormalFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String read() {
        return "read from normal file:";
    }

    @Override
    public void write(String fileName) {
        System.out.println("Write on file Named : " + fileName);
    }

}

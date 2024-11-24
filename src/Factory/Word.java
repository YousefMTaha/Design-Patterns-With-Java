package Factory;

public class Word extends File {

    public Word(String fileName) {
        super(fileName);
    }

    @Override
    public void open(String fileLocation) {
        System.out.println("open from word " + fileLocation);
    }

    @Override
    public void delete() {
        System.out.println("delete from word " + this.getFileName());
    }

}

package Factory;

public class PDF extends File {

    public PDF(String fileName) {
        super(fileName);
    }

    @Override
    public void open(String fileLocation) {
        System.out.println("open from pdf " + fileLocation);
    }

    @Override
    public void delete() {
        System.out.println("delete from PDF " + this.getFileName());
    }

}

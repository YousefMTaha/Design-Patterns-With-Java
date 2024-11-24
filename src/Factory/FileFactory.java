package Factory;

public class FileFactory {
    private String fileLocation;

    public FileFactory(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public File getFileType(String fileType) {
        switch (fileType) {
            case "Word":
            case "word":
                return (File) new Word(fileLocation);
            case "PDF":
            case "pdf":
                return (File) new PDF(fileLocation);
            default:
                return null;

        }
    }
}

import java.util.List;

public class Folder {
    // uma pasta contem uma ou mais pastas
    private List<Folder> folderList;

    // uma pasta contem um ou mais arquivos
    private List<File> fileList;

    // uma pasta tem um nome
    private String name;

    @Override
    public String toString() {
        return "Folder{" +
                "\n\tname='" + name + '\'' +
                "\n\tFolder List=" + folderList +
                "\n\tFile List=" + fileList +
                "}";
    }

    public List<Folder> getFolderList() {
        return folderList;
    }

    public void setFolderList(List<Folder> folderList) {
        this.folderList = folderList;
    }

    public List<File> getFileList() {
        return fileList;
    }

    public void setFileList(List<File> fileList) {
        this.fileList = fileList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void printName(){
        System.out.println(name);
    }
}

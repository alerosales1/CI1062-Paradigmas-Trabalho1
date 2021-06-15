import java.util.List;

public class FolderControl {

    public void print(Folder folder, String blanks){
        System.out.println(blanks + folder.getName());

        blanks = blanks + "  ";

        List<Folder> folders = folder.getFolderList();
        for(int i = 0; i < folders.size(); i++){
            Folder subFolder = folders.get(i);
            print(subFolder, blanks);
        }

        List<File> files = folder.getFileList();
        for(int j = 0; j < files.size(); j++){
            File subFile = files.get(j);
            System.out.println(blanks + subFile.getName());
        }
    }

    public void printFileByType(List<File> fileList, Type type){
        for (File file : fileList){
            if (file.getType() == type){
                System.out.println(file.getName());
            }
        }
    }

}

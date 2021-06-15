import java.util.*;

public class Program {
    public static void main(String[] args) {

        List<Folder> folderList = new ArrayList<>();

        Folder folder = new Folder();
        folder.setName("Desktop");

        Folder folder1 = new Folder();
        Folder folder2 = new Folder();
        Folder folder3 = new Folder();

        folder1.setName("Movies");
        folder2.setName("Note");
        folder3.setName("Books");

        File file1 = new File();
        File file2 = new File();
        File file3 = new File();
        File file4 = new File();

        file1.setType(Type.TEXT);
        file1.setExtension(".txt");
        file1.setName("List supermarket");
        file1.setSize(200);

        file2.setType(Type.TEXT);
        file2.setExtension(".txt");
        file2.setName("List movies");
        file2.setSize(100);

        file3.setType(Type.IMAGE);
        file3.setExtension(".JPG");
        file3.setName("Party photo");
        file3.setSize(500);

        file4.setType(Type.PDF);
        file4.setExtension(".PDF");
        file4.setName("Java");
        file4.setSize(1024);

        // add file in folders
        folder.setFileList(Collections.emptyList());
        folder1.setFileList(Arrays.asList(file2));         // Movies/List movies.txt
        folder2.setFileList(Arrays.asList(file1, file3));  // Note/List supermarket.txt  Note/Party photo.JPG
        folder3.setFileList(Arrays.asList(file3));         // Books/Party photo.jpg

        folder.setFolderList(Arrays.asList(folder1, folder2)); // Desktop/Movies Desktop/Note
        folder1.setFolderList(Arrays.asList(folder3));       // Movies/Books
        folder2.setFolderList(Collections.emptyList());
        folder3.setFolderList(Collections.emptyList());

        FolderControl folderControl = new FolderControl();
        folderControl.print(folder, "");

        /**
         * Desktop
         *   Movies
         *     Books
         *       Party photo
         *     List movies
         *   Note
         *     List supermarket
         *     Party photo
         */

        folderControl.printFileByType(Arrays.asList(file1, file2, file3, file4), Type.TEXT);

        /**
         * List movies
         * List supermarket
         */

//        Scanner qualquerCoisa = new Scanner(System.in);
//        double a = qualquerCoisa.nextDouble();
    }
}

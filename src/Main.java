import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private static StringBuilder sb = new StringBuilder();
    private static ArrayList<File> fileList = new ArrayList<File>();

    public static void main(String[] args) {
        createFoldersAndFiles();
        writeLogToFile();
    }

    private static void createFoldersAndFiles() {
        createDirectory("C://Games/Games/src/main", "Директория 'Games/src/main'");
        createFile("C://Games/Games/src/main/Main.java", "Файл 'Main.java'");
        createFile("C://Games/Games/src/main/Utils.java", "Файл 'Utils.java'");
        createDirectory("C://Games/Games/src/test", "Директория 'Games/src/test'");
        createDirectory("C://Games/Games/res/drawables", "Директория 'Games/res/drawables'");
        createDirectory("C://Games/Games/res/vectors", "Директория 'Games/res/vectors'");
        createDirectory("C://Games/Games/res/icons", "Директория 'Games/res/icons'");
        createDirectory("C://Games/Games/savegames", "Директория 'Games/savegames'");
        createDirectory("C://Games/Games/temp", "Директория 'Games/temp'");
        createFile("C://Games/Games/temp/temp.txt", "Файл 'temp.txt'");
    }

    private static void createDirectory(String path, String logMessage) {
        File dir = new File(path);
        if (dir.mkdirs()) {
            sb.append(logMessage).append(" успешно создана\n");
            fileList.add(dir);
        } else {
            sb.append(logMessage).append(" не создана\n");
        }
    }

    private static void createFile(String path, String logMessage) {
        File file = new File(path);
        try {
            if (file.createNewFile()) {
                sb.append(logMessage).append(" создан\n");
                fileList.add(file);
            } else {
                sb.append(logMessage).append(" не создан\n");
            }
        } catch (IOException e) {
            sb.append(logMessage).append(" не создан\n");
            e.printStackTrace();
        }
    }

    private static void writeLogToFile() {
        File logFile = new File("C://Games/Games/temp/temp.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile))) {
            writer.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

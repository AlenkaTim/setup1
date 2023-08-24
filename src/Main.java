import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        File Games20 = new File("C://Games/Games/src/main");
        File Games2 = new File("C://Games/Games/src/main/Main.java");
        File Games22 = new File("C://Games/Games/src/main/Utils.java");
        File Games222 = new File("C://Games/Games/src/test");
        File Games3 = new File("C://Games/Games/res/drawables");
        File Games33 = new File("C://Games/Games/res/vectors");
        File Games333 = new File("C://Games/Games/res/icons");
        File Games4 = new File("C://Games/Games/savegames");
        File Games55 = new File("C://Games/Games/temp");
        File Games5 = new File("C://Games/Games/temp/temp.txt");
        if (Games20.mkdirs()) {
            sb.append("Директория 'Games/src/main' успешно создана\n");
        } else {
            sb.append("Директория 'Games/src/main' не создана\n");
        }

        if (Games222.mkdirs()) {
            sb.append("Директория 'Games/src/test' успешно создана\n");
        } else {
            sb.append("Директория 'Games/src/test' не создана\n");
        }

        if (Games3.mkdirs()) {
            sb.append("Директория 'Games/res/drawables' успешно создана\n");
        } else {
            sb.append("Директория 'Games/res/drawables' не создана\n");
        }

        if (Games33.mkdirs()) {
            sb.append("Директория 'Games/res/vectors' успешно создана\n");
        } else {
            sb.append("Директория 'Games/res/vectors' не создана\n");
        }

        if (Games333.mkdirs()) {
            sb.append("Директория 'Games/res/icons' успешно создана\n");
        } else {
            sb.append("Директория 'Games/res/icons' не создана\n");
        }

        if (Games4.mkdirs()) {
            sb.append("Директория 'Games/savegames' успешно создана\n");
        } else {
            sb.append("Директория 'Games/savegames' не создана\n");
        }

        if (Games55.mkdirs()) {
            sb.append("Директория 'Games/temp' успешно создана\n");
        } else {
            sb.append("Директория 'Games/temp' не создана\n");
        }

        try {
            Games2.createNewFile();
            sb.append("Файл 'Main.java' создан\n");
        } catch (IOException var20) {
            sb.append("Файл Main.java' не создан\n");
            var20.printStackTrace();
        }

        try {
            Games22.createNewFile();
            sb.append("Файл 'Utils.java' создан\n");
        } catch (IOException var19) {
            sb.append("Файл 'Utils.java' не создан\n");
            var19.printStackTrace();
        }

        try {
            Games5.createNewFile();
            sb.append("Файл 'temp.txt' создан\n");
        } catch (IOException var18) {
            sb.append("Файл 'temp.txt' не создан\n");
            var18.printStackTrace();
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(Games5));

            try {
                writer.write(sb.toString());
            } catch (Throwable var16) {
                try {
                    writer.close();
                } catch (Throwable var15) {
                    var16.addSuppressed(var15);
                }

                throw var16;
            }

            writer.close();
        } catch (IOException var17) {
            var17.printStackTrace();
        }

    }
}

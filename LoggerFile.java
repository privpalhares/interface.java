package LoggerFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class LoggerFile implements System.Logger {
    @Override
    public String getName() {
        return "";
    }

    @Override
    public boolean isLoggable(Level level) {
        return false;
    }

    @Override
    public void log(Level level, ResourceBundle bundle, String msg, Throwable thrown) {

    }

    @Override
    public void log(Level level, ResourceBundle bundle, String format, Object... params) {

    }

    @Override
    public void log(Level level, String msg) {
        LocalDateTime dataAtual = LocalDateTime.now();
        DateTimeFormatter formartar = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String filename = "teste.txt";
        String mensagem = "[" + dataAtual.format(formartar) + "] " + msg + "\n";
        try {
            Files.write(Paths.get(filename), mensagem.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.Logger.super.log(level, msg);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

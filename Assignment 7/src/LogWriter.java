import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LogWriter {
    private static LogWriter instance = null;

    private LogWriter() {
    }

    public static LogWriter getInstance() {
        if (instance == null) {
            instance = new LogWriter();
        }

        return instance;
    }

    public void writer(String logs) throws IOException {
        String filePath = "log.text";
        Files.writeString(Paths.get(filePath), logs);
    }
}
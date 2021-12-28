package Challenge;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Challenge {
    public static void main(String[] args) throws IOException {
        readFromCSV();
        archiveFile("C:\\Users\\97250\\Challenge.java");
        getWebsite();
}

    private static void readFromCSV() throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader("C:\\Users\\97250\\Players.csv"));
        String row;
        while ((row = csvReader.readLine()) != null) {
            // use comma as separator
            String[] data = row.split(",");
            System.out.println(data[0] + " , " + data[1]);

        }
        csvReader.close();
    }

    private static void archiveFile(String fileToArchive) throws IOException {
        File f = new File("C:\\Users\\97250\\Challenge.zip");
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(f));
        ZipEntry e = new ZipEntry(fileToArchive);
        out.putNextEntry(e);
        out.closeEntry();
        out.close();
    }

    private static void getWebsite() throws IOException {
        String content = null;
        URLConnection connection = null;
        try {
            connection =  new URL("https://www.google.com").openConnection();
            Scanner scanner = new Scanner(connection.getInputStream());
            scanner.useDelimiter("\\Z");
            content = scanner.next();
            String filePath = "2.txt";
            Files.writeString(Paths.get(filePath), content);
            scanner.close();
        }catch ( Exception ex ) {
            ex.printStackTrace();
        }
    }
}
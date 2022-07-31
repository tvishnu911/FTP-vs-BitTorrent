import java.io.IOException;
import java.util.ArrayList;

public class CommonConfig {

    static int numberOfPreferredNeighbors;
    static int unchokingInterval;
    static int optimisticUnchokingInterval;
    static String fileName;
    static int fileSize;
    static int pieceSize;
    static int totalPieces;

    public static void read(String filePath) throws IOException {
        ArrayList<String> lines = Utils.getFileLines(filePath);
        numberOfPreferredNeighbors = Integer.parseInt(lines.get(0).split(" ")[1]);
        unchokingInterval = Integer.parseInt(lines.get(1).split(" ")[1]);
        optimisticUnchokingInterval = Integer.parseInt(lines.get(2).split(" ")[1]);
        fileName = lines.get(3).split(" ")[1];
        fileSize = Integer.parseInt(lines.get(4).split(" ")[1]);
        pieceSize = Integer.parseInt(lines.get(5).split(" ")[1]);
        totalPieces = (int) Math.ceil((double) fileSize / pieceSize);
    }


}



package streams.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path filePath = null;

        try {
            filePath = Paths.get("/home/artur/Dokumenty/GitHub/RestMoney/src/main/java/streams/file1.txt");
        } catch (InvalidPathException e) {
            System.out.println("Path's error " + e);
            return;
        }

        try (SeekableByteChannel fChan = Files.newByteChannel(filePath)) {
            ByteBuffer mBuf = ByteBuffer.allocate(128);

            do {
                count = fChan.read(mBuf);

                if (count != -1) {
                    mBuf.rewind();  // set channel to 0, otherwise buffer starts counting from first empty position to end of capacity
                    for (int i = 0; i < count; i++) {
                        System.out.print(mBuf.get() + " ");
                    }
                }

            } while (count != -1);
            System.out.println();
        } catch (IOException e) {
            System.out.println("IO error" + e);
        }
    }
}

import java.io.IOException;

public class Main {

    private static final int PORT = 9999;

    public static void main(String[] args) throws IOException {
        Server server = new Server();
        server.start(PORT);
    }
}

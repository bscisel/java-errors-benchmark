package app;
import java.util.List;
import java.util.Arrays;

public class MessageSender {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("A", "B");
        for (String item : items) {
            Connection connection = new Connection();
            connection.send(item);
            connection.close();
        }
    }

    private static class Connection {
        public Connection() {
            System.out.println("Opening connection");
        }
        public void send(String data) {
            System.out.println("Sending: " + data);
        }
        public void close() {
            System.out.println("Closing connection");
        }
    }


}

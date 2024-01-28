import java.nio.ByteBuffer;

public class BufferExample {
    public static void main(String[] args) {
        // Create a ByteBuffer with capacity for 10 bytes
        ByteBuffer buffer = ByteBuffer.allocate(10);

        // Add data to the buffer
        buffer.put((byte) 1);
        buffer.put((byte) 2);
        buffer.put((byte) 3);

        // Read data from the buffer
        buffer.flip();
        while (buffer.hasRemaining()) {
            byte data = buffer.get();
            System.out.println(data);
        }
    }
}

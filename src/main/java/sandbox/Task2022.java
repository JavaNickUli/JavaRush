package sandbox;

import java.io.*;

public class Task2022 implements Serializable, AutoCloseable {

    transient private FileOutputStream stream;
    private String fileName;

    public Task2022(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName = fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Task2022 solution = new Task2022("FileName");
        solution.writeObject("Test line first");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        new ObjectOutputStream(out).writeObject(solution);
        ByteArrayInputStream input = new ByteArrayInputStream(out.toByteArray());
        Task2022 newObject = (Task2022) new ObjectInputStream(input).readObject();
        newObject.writeObject("Test line second");
    }
}

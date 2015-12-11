package strq;

/**
 * Created by Luke Lee on 12/10/15.
 */
public class SimpleStringQueue implements StringQueue {

    private String queue;

    public SimpleStringQueue() {
        queue = "";
    }

    @Override
    public int length() {
        return queue.length();
    }

    @Override
    public void enqueue(String string) {
        queue += string;
    }

    @Override
    public String dequeue(int length) {
        String result = queue.substring(0, length);
        queue = queue.substring(length);
        return result;
    }
}

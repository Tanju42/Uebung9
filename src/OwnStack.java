import java.util.ArrayList;
import java.util.List;

public class OwnStack {
    List<Point> list = new ArrayList<>();


    OwnStack() {

    }

    public void push(Point aPoint) {
        list.add(aPoint);
    }

    public void pop() {
        if (!list.isEmpty()) {
            list.remove(list.size()-1);
        }
    }

    public Point peek() {
        if (!list.isEmpty()) {
            return list.get(list.size()-1);
        }
        return null;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}

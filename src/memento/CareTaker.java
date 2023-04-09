package memento;
import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    public List<Memento> mementoList = new ArrayList<Memento>();
    static int saveId = 0;

    public void add(Memento memento) {
        this.mementoList.add(memento);
        System.out.println("State save " + saveId + "\n");
        saveId++;
    }

    public Memento get(int index) {
        return this.mementoList.get(index);
    }
}

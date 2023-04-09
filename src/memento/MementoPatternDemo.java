package memento;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Character player = new Character("Olha", "hunter");
        Stats temp = Stats.generate();
        player.setAttributes(temp);
        player.printSheet();

        CareTaker careTaker = new CareTaker();
        Memento mem = new Memento();

        temp = Stats.generate();
        temp.printStats();
        mem.setState(temp);
        careTaker.add(mem.saveStateToMemento());

        temp =Stats.generate();
        temp.printStats();
        mem.setState(temp);
        careTaker.add(mem.saveStateToMemento());

        mem.getStateFromMemento(careTaker.get(0).getState());
        temp = mem.getState();
        temp.printStats();

        mem.getStateFromMemento(careTaker.get(1).getState());
        temp = mem.getState();
        temp.printStats();

    }
}

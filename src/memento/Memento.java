package memento;

public class Memento {
    public Stats state;
    public int strength;
    public int dexterity;

    public int constitution;
    public int intellect;
    public int wisdom;
    public int charisma;

    public Memento() {
    }

    public Memento(Stats state) {
        this.state = state;
        this.strength = state.getStrength();
        this.dexterity = state.getDexterity();
        this.constitution = state.getConstitution();
        this.intellect = state.getIntellect();
        this.wisdom = state.getWisdom();
        this.charisma = state.getCharisma();
    };

    public void setState(Stats state) {
        this.state = state;
        this.strength = state.getStrength();
        this.dexterity = state.getDexterity();
        this.constitution = state.getConstitution();
        this.intellect = state.getIntellect();
        this.wisdom = state.getWisdom();
        this.charisma = state.getCharisma();
    };
    public Stats getState() {
        return this.state;
    }

    public Memento saveStateToMemento() {
        System.out.println("State ready to save");
        return new Memento(state);
    }

    public void getStateFromMemento(Stats state) {
        this.state = state;
    }
}

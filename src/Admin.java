public class Admin extends Client{
    public Admin(Type type, String name, int age) {
        super(type, name, age);
    }

    @Override
    public String toString() {
        return "Животное № " + this.animalCount + ": "  + this.name;
    }
    static int sum() {
        return animalCount;
    }
}

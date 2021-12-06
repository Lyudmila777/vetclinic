public class Client {
    static int animalCount;
    public String name;
    private int age;
    private Type type;
    public Client(Type type, String name, int age) {
        this.age = age;
        this.name = name;
        this.type = type;
    }
        @Override
    public String toString() {
        return type +" " + name + "; возраст: " + age + " лет";
    }
    public  void print() {
        animalCount++;
        System.out.println("Животное № " + animalCount + ": " + type + " по кличке " + name + "; возраст: " + age + " лет");
    }
}




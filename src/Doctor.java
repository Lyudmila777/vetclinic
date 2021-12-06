public class Doctor extends Client {
    private Type type; // приватное поле не передается с базового класса
    //только если от открытого метода или конструктора в родителе
    //значит надо инициализировать в наследнике
    private int age;

    public Doctor(Type type, String name, int age) {
        super(type, name, age);
    }

    @Override
    public String toString() {
        return "Животное № " + this.animalCount + ": " + type + " по кличке " + this.name + "; возраст: " + age + " лет";
    }
}





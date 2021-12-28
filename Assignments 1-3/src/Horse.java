public class Horse {
    private String name;
    private int age;

    public Horse (String horseName, int horseAge){
        name = horseName;
        age = horseAge;
    }

    public Horse(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

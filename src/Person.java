public class Person {

    private String name;
    private int age;
    private boolean married;

    public Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", married=" + married +
                '}';
    }

    public static void main(String[] args) {

        Person person1 = new Person("Mihai", 30, true);
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Married: " + person1.isMarried());
        person1.setAge(35);
        person1.setMarried(false);
        System.out.println("Updated Age: " + person1.getAge());
        System.out.println("Updated Married: " + person1.isMarried());
        System.out.println(person1);

        Person person2 = new Person("Anca", 27, true);
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Married: " + person2.isMarried());
        person2.setAge(27);
        person2.setMarried(false);
        System.out.println("Updated Age: " + person2.getAge());
        System.out.println("Updated Married: " + person2.isMarried());
        System.out.println(person2);

        Person person3 = new Person("Maria", 32, true);
        System.out.println("Name: " + person3.getName());
        System.out.println("Age: " + person3.getAge());
        System.out.println("Married: " + person3.isMarried());
        person3.setAge(32);
        person3.setMarried(false);
        System.out.println("Updated Age: " + person3.getAge());
        System.out.println("Updated Married: " + person3.isMarried());
        System.out.println(person3);
    }
}

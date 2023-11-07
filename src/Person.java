public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.printf("Hello, %s", name);
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
//        Person andrew = new Person();
//        andrew.name = "Andrew";
//        andrew.sayHello();

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}

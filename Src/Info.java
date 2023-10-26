public class Info {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person();
        Person person2 = new Person();
        person.personInfo("Will ", "Smith ", "New York", 293672946);
        person1.personInfo("Jackie ", "Chan ", "Нью-Shanghai ", 1231241241);
        person2.personInfo("Sherlock ", "Holmes ", "London ", 1205745412);
        System.out.println(person.personInfo());
        System.out.println(person1.personInfo());
        System.out.println(person2.personInfo());
    }
}

public class Person {
     String name;
     String surname;
     String city;
     long phone;
    public void personInfo(String name, String surname, String city, long phone){
        this.name = name;

        this.surname = surname;

        this.city = city;

        this.phone = phone;
    }
    public String personInfo() {
        return "Зателефонувати громадянинов " + name + " " + surname + " з міста " + city + " можна за номером " + phone;

    }

}

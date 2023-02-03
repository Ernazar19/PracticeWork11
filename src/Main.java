public class Main {
    public static void main(String[] args)
    {
        Person person = new Person();
        person.firstName = "Shabdan";
        person.lastName = "Tilek uulu";
        person.age = 26;
        person.gender = "male";
        person.countryOfBirth = "Kyrgyzstan";
        System.out.println(person.work("Boris"));
        System.out.println(person.eat("Salat"));

    }
}
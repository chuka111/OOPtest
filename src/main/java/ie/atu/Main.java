package ie.atu;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Trawler user = new Trawler();

        user.setName("chuka123");
        user.setId("12345678912");
        user.setType("freezer");

        String name = user.getName();
        String id = user.getId();
        String type = user.getType();

        System.out.println(user.toString());




    }
}
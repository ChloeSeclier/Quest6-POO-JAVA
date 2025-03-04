public class Classroom {
    public static void main(String[] args) {
        Wilder Chloe = new Wilder("Chloe",true);
        Chloe.setFirstName("Chloé");
        Chloe.setAware(false);
        Wilder Yahia= new Wilder("Yahia",true);
        Wilder Charles = new Wilder("Charles",false);


        System.out.println(Chloe.whoAmI());
        System.out.println(Yahia.whoAmI());
        System.out.println(Charles.whoAmI());
    }
}

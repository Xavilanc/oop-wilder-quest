public class Classroom {
    public static void main(String[] args) {

        //Wilder Xavier
        Wilder xavier = new Wilder("Xavier", false);
        System.out.println(xavier.whoAmI());
        
        //Wilder Amina
        Wilder amina = new Wilder("Amina", true);
        System.out.println(amina.whoAmI());

        //Wilder Nicolas
        Wilder nicolas = new Wilder("Nicolas", false);
        System.out.println(nicolas.whoAmI());

        //Wilder Laurent
        Wilder laurent = new Wilder("Laurent", true);
        System.out.println(laurent.whoAmI());
    }
}

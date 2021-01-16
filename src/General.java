import java.sql.SQLOutput;

class Generate {
    public void print(String name){
        System.out.println("Hello " + name);
    }
}
public class General extends Generate {

    public void print(String name, String greet) {
        System.out.println(greet + name);
        super.print(name);
    }

    public static void main(String[] args) {

        General general = new General();
        general.print("maulik","hello");
    }
}

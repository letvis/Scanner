import java.util.Scanner;

public class scanner2 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "Человек по имени  ";
        String city = "живет в городе  ";
        String age = "Этому человеку  ";
        String hobby = "и любит он заниматься  ";
        String str = scanner.next();
        String str2 = scanner.next();
        int Возраст = scanner.nextInt();
        String str3 = scanner.next();
        System.out.println(ANSI_BLUE+name+" "+ANSI_RESET + str +"\t " + ANSI_RED+city+""+ANSI_RESET +str2);
        System.out.println(ANSI_BLUE+age+" "+ANSI_RESET+Возраст+ANSI_BLUE+" лет\t "+ANSI_RESET+ANSI_RED+hobby  +ANSI_RESET+str3);

    }
}

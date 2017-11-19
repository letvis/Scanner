import java.util.Scanner;

public class scanner3 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "- имя";
        String city = "- город";
        String age = "- возраст";
        String hobby = "- хобби";
        String str = scanner.next();
        String str2 = scanner.next();
        int Возраст = scanner.nextInt();
        String str3 = scanner.next();
        System.out.println(ANSI_BLUE+str+ANSI_RESET +name);
        System.out.println(ANSI_BLUE+str2+ANSI_RESET+city);
        System.out.println(ANSI_BLUE+Возраст+ANSI_RESET+age);
        System.out.println(ANSI_BLUE+str3+ANSI_RESET+hobby);
    }

}


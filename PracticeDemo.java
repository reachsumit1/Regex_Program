package RegexProgram;

public class PracticeDemo {
    public static void main(String[] args) {
        String Firstname="Akhil";
        String number="91 8794561232";
        String regex="[A-Z]{1}[a-z]{3,6}";
        String mobregex="^91\\s\\d{10}$";
        String email="gautham.y@bridgelabz.com";
        String emailregex="[a-zA-Z0-9._%-]+@bridgelabz.com";
        System.out.println("FN" +Firstname.matches(regex));
        System.out.println("MB" +number.matches(mobregex));
        System.out.println("Gmail" +email.matches(emailregex));
    }
}


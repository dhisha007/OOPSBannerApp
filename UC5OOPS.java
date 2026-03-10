public class UC5OOPS {
    public static void main(String[] args) {

        // Creating each line of the banner using String.join()

        String line1 = String.join(" ", " OOO ", " PPP ", " SSS ");
        String line2 = String.join(" ", "O   O", "P   P", "S    ");
        String line3 = String.join(" ", "O   O", "PPP  ", " SSS ");
        String line4 = String.join(" ", "O   O", "P    ", "    S");
        String line5 = String.join(" ", " OOO ", "P    ", "SSSS ");

        // Printing the banner
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}
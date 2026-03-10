public class UC4OOPS {

    public static void main(String[] args) {

        // Banner lines stored in String array
        String[] banner = {
            String.join(" ", "*     *", "*****", "*****", "*****"),
            String.join(" ", "*     *", "*   *", "*   *", "*    "),
            String.join(" ", "*     *", "*   *", "*   *", "*****"),
            String.join(" ", "*     *", "*   *", "*   *", "    *"),
            String.join(" ", " ***** ", "*****", "*****", "*****")
        };

        // Print banner using enhanced for loop
        for(String line : banner) {
            System.out.println(line);
        }
    }
}
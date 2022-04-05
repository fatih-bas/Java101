public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Ali",15,100,85,30);
        Fighter f2 = new Fighter("Veli",13,101,75,30);
        Match match = new Match(f1, f2, 65, 105);
        match.run();
    }
}
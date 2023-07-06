/*. Write a method that allows you to pass any number of Strings as parameter inputs without using an array.

 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        main.input("Leo", "Marco", "Giovanni");
        main.input("Torino", "Milano", "Roma");
        main.input("Rosso", "Verde", "Nero");
        main.input("Germamnia", "Spagna", "Italia","Francia");
    }
    public void input(String...args){}
}
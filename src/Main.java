import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
 //       HorseGame horseGame = new HorseGame();
//        horseGame.printBoard();
 //       HorseGameUI uitest = new HorseGameUI();

        DictionaryReader dict = new DictionaryReader();
        System.out.println(dict.firstWordofFile());
    }
}

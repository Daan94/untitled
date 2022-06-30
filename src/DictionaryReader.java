import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DictionaryReader {
  private File file;

  public DictionaryReader() {
    this.file = new File("words.txt");
  }

  public String firstWordofFile() throws IOException {
 //   FileReader reader = new FileReader(this.file);
    Scanner reader = new Scanner(this.file);

    while (reader.hasNextLine()){
      String reducedString = reader.nextLine();

      if (isAlphaNumeric(reducedString) && reducedString.length() == 8){
        return reducedString;
      }
    }
    return "";
  }

  private boolean isAlphaNumeric(String string){
    return string.matches("^[a-z]*$");
  }

  private File eightLetterWordTextFile() throws FileNotFoundException {
    Scanner reader = new Scanner(this.file);
    FileWriter writer = new FileWriter();


    writer.append()
    File file = new File();

    return file;
  }


  private int countLines(Scanner reader) throws FileNotFoundException {
    reader = new Scanner(this.file);
    int number = 0;
    while (reader.hasNextLine()){
      number++;
    }
    return number;

  }

}

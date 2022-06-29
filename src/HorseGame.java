import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HorseGame {
    private Random random = new Random();
    private Cell[][] board;
    public List<String> legalWords;
    private String currentWord;
    private DirectionList directionList;
    private String wordSoFar;



    public HorseGame() {
        this.board = new Cell[3][3];
        this.legalWords = new ArrayList<>();
        this.legalWords.add("AUTORACE");
        this.legalWords.add("VERFTUBE");
        this.currentWord = legalWords.get(random.nextInt(legalWords.size()));
        this.directionList = new DirectionList();
        this.wordSoFar = "";
        initializeBoard();
        setUpBoard();

    }

    public void initializeBoard(){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                board[i][j] = new Cell();
            }
        }
    }

    public boolean isWithinBoard(int x, int y){
        if (x == 1 && y == 1){
            return false;
        }
        if (x <= 2 && y <= 2 && x >= 0 && y >= 0) { //TODO AVAILABLE OOK BUITEN GRID CHECKEN.
            return board[x][y].getAvailable();
        }

        return false;
    }
    public void setUpBoard() {
        int currentX;
        int currentY;
        /*
        sets startposition
         */
        while (true) {
            currentX = random.nextInt(3);
            currentY = random.nextInt(3);
            if (isWithinBoard(currentX,currentY)) {
                System.out.println("test");
                break;
            }
        }


        int count = 0;
        for (int i = 0; i < currentWord.length(); i++) {
            for (int j = 0; j < directionList.size(); j++) {
                if (isWithinBoard(currentX + directionList.getX(j), currentY + directionList.getY(j))){
                    System.out.println(currentX + " " + currentY);
                    currentX += directionList.getX(j);
                    currentY += directionList.getY(j);
                    board[currentX][currentY].setCellCharacter(currentWord.charAt(count));
                    count++;

                }
            }
        }
    }
    public char getChar(int x, int y){
        return this.board[x][y].getCellCharacter();
    }

    public String updateWordAndReturn(Character c){
        StringBuilder word = new StringBuilder();
        word.append(c);
        return word.toString();
    }
    public String returnWord(){
        return this.currentWord;
    }


        public void printBoard(){
            for (int i = 0; i < board.length; i++){
                System.out.println();
                for (int j = 0; j < board[i].length; j++){
                    System.out.print(board[i][j].toString() + " ");
                }
            }
        }

    }



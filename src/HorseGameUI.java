import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class HorseGameUI {
   private ArrayList<JButton> buttonList;
   private HorseGame horseGame;
   private JFrame frame;
   private JLabel textLabel;
   private JPanel textpanel;
   private JPanel boxPanel;
   private String word;
   private ActionListener listener;
   private int pressCount;


    public HorseGameUI() {

        this.horseGame = new HorseGame();
        this.buttonList = new ArrayList<>();
        this.boxPanel = new JPanel();
        this.frame = new JFrame();
        this.textpanel = new JPanel();
        this.textLabel = new JLabel();
        this.word = "";
        this.pressCount = 0;
        init();
        }

    public void init() {


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(2,1));

        boxPanel.setLayout(new GridLayout(3, 3, 5, 5));
        textpanel.setSize(500, 20);
        textpanel.setLayout(new BorderLayout());


        textLabel.setText("________");
        textpanel.add(textLabel);

        frame.add(boxPanel);

        frame.add(textpanel);
        frame.setVisible(true);
        initBoard();

    }


    private void initBoard() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    char character = this.horseGame.getChar(i, j);
                    JButton buttonToAdd = createButton(character);
                    if (i == 1 && j == 1){
                        buttonToAdd.setEnabled(false);
                    }
                    buttonList.add(buttonToAdd);
                    boxPanel.add(buttonToAdd);
                }
            }

            }

      private JButton createButton(char c){

            JButton button = new JButton("" + c);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    addText(button.getText());
                    System.out.println(button.getText());
                    changeLabel();
                    button.setEnabled(false);
                    pressCount++;

                    if(pressCount == 8){
                        if (checkIfWordCorrect()){
                            textLabel.setText("You won!");
                            System.out.println("You won!");
                        } else {
                            textLabel.setText("You lost!");
                            System.out.println("You lost!");
                        }
                    }

                }
            }
            );

        return button;
      }

      private void changeLabel(){
            this.textLabel.setText(word);
      }


    private void addText(String textToAdd){
    this.word += textToAdd;
    }

    public boolean checkIfWordCorrect(){
        return this.word.equals(horseGame.returnWord());
    }

}





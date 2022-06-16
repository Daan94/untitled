import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Javauitest {
   private ArrayList<JButton> buttonList;
   private HorseGame horseGame;
   private JLabel text;


    public Javauitest() {
        this.horseGame = new HorseGame();
        this.buttonList = new ArrayList<>();
        init();
    }
    public void init() {


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(2, 1, 10, 10));
        JPanel boxPanel = new JPanel();
        boxPanel.setLayout(new GridLayout(3, 3, 5, 5));

        JPanel textpanel = new JPanel();
        textpanel.setSize(500, 20);
        textpanel.setLayout(new BorderLayout());
        this.text = new JLabel();
        StringBuilder word = new StringBuilder("");

        initBoard(word);

    }
        //TODO text moet een



        private void initBoard(StringBuilder word){
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    char character = this.horseGame.getChar(i,j);
                    JButton buttonToAdd = new JButton(""+(character));
                    buttonToAdd.addActionListener(e -> text.setText(word.toString()));
                    word.append(character);
                    buttonList.add(buttonToAdd);

                }
            }

        }




        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                char character = this.horseGame.getChar(i,j);
                JButton buttonToAdd = new JButton(""+(character));

                buttonToAdd.addActionListener(e -> text.setText(word.toString()));
                word.append(character);
                buttonList.add(buttonToAdd);

            }
        }


        for (int i = 0; i < buttonList.size(); i++){
            boxPanel.add(buttonList.get(i));
        }



        textpanel.add(text);
        frame.add(boxPanel);
        frame.add(textpanel);
        frame.setVisible(true);



    }



}

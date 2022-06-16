import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameUI extends JPanel {
    private Color gridColor = new Color(0xBBADA0);
    private Color emptyColor = new Color(0xCDC1B4);
    private State gamestate = State.start;

    public GameUI() {
        setPreferredSize(new Dimension(500,500));
        setBackground(new Color(0xFAFAFA));
        setFont(new Font("SansSerif",Font.BOLD,40));
        setFocusable(true);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
    }

    enum State{
    start, won, running,
    }

    final Color[] colorTable = new Color[]{
            new Color(0x701710),
            new Color((0xbe7e56))};
    }






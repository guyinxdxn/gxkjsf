import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    int x=0;
    int y=0;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {

                    label_txt.setBounds(x,y+=10,128,128);
                    myPanel.repaint();
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {

                    label_txt.setBounds(x-=10,y,128,128);
                    myPanel.repaint();
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

                    label_txt.setBounds(x+=10,y,128,128);
                    myPanel.repaint();
                }
                if (e.getKeyCode() == KeyEvent.VK_UP) {

                    label_txt.setBounds(x,y-=10,128,128);
                    myPanel.repaint();
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    label_txt.getX();
                    label_txt.getY();
                    label_txt.setText("X"+label_txt.getX()+"Y"+label_txt.getY()+"");
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        label_txt.setText("大飞机");
        label_txt.setBounds(0,0,64,64);
        java.net.URL imgURL = App.class.getResource("img/plane0.png");
        label_txt.setIcon(new ImageIcon(imgURL));

        myPanel.add(label_txt);
        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}

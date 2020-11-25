import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JTextArea a=new JTextArea();
    JTextArea b= new JTextArea();

    //构造方法
    public App() {
        a.setBounds(100,100,100,100);
        b.setBounds(300,300,100,100);
        a.setBackground(Color.red);
        b.setBackground(Color.green);
        a.append("谁最帅？？");
        myPanel.add(a);
        myPanel.add(b);

        b.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                super.keyPressed(e);


                    if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                        if (b.getText().replace("\n","").replace(" ","").equals("王大锤")) {
                            b.setText(null);
                            a.setText("对了");
                        } else {
                            b.setText(null);
                            a.setText("丑拒");
                        }
                    }

            }
        });
    }
    //显示窗体方法
    void go(){
        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args) {

        new App().go();
    }
}

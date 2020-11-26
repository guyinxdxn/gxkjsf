import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_fenshu=new JLabel();
    JLabel label_nb=new JLabel();
    JLabel label_ceshi=new JLabel();
    int a=0;
    //构造方法
    public App() {
        label_ceshi.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                label_ceshi.setOpaque(true);
                label_ceshi.setBackground(Color.red);
                label_ceshi.setText("恭喜恭喜好眼力！！");
                a++;
                label_nb.setText(""+a+"");
            }
        });

    }


    //显示窗体方法
    void go(){

        java.net.URL imgURL =App.class.getResource("img/687.jpg");
        label_txt.setIcon(new ImageIcon(imgURL));
        label_txt.setBounds(0,0,1000,687);
        label_txt.setForeground(Color.red);
        label_fenshu.setBounds(1,1,50,50);
        label_fenshu.setText("分数");
        label_fenshu.setOpaque(true);
        label_fenshu.setBackground(Color.green);


        label_ceshi.setBounds(10,250,100,120);
        label_nb.setBounds(30,1,50,50);
        label_nb.setText(""+a+"");
        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);

        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,1000,687);
        myPanel.add(label_ceshi);
        myPanel.add(label_nb);
        myPanel.add(label_fenshu);
        myPanel.add(label_txt);

        //frame.pack();
        frame.setVisible(true);
        myPanel.getFocusListeners();

    }
    public static void main(String[] args) {
        new App().go();
    }
}

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Cjc {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    List<JLabel> a=new ArrayList<>();
    //构造方法
    public Cjc() {
        a.add(new JLabel());
        a.add(new JLabel());
        a.add(new JLabel());
        java.net.URL imgURL = App.class.getResource("img/ball.png");
        a.get(0).setIcon(new ImageIcon(imgURL));
        a.get(0).setBounds(100,100,128,128);
        myPanel.add(a.get(0));

        a.get(1).setIcon(new ImageIcon(imgURL));
        a.get(1).setBounds(200,100,128,128);
        myPanel.add(a.get(1));

        a.get(2).setIcon(new ImageIcon(imgURL));
        a.get(2).setBounds(300,100,128,128);
        myPanel.add(a.get(2));

    }
    //显示窗体方法
    void go(){
        label_txt.setText("这是一个Label标签。");
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Cjc().go();
    }
}

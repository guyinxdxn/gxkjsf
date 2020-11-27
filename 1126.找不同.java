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
    JLabel label_ceshi2=new JLabel();
    JLabel label_ceshi3=new JLabel();
    JLabel label_ceshi4=new JLabel();
    JLabel label_ceshi5=new JLabel();
    JLabel label_ceshi6=new JLabel();
    JLabel label_cg=new JLabel();
    int a=0;
    //构造方法
    public App() {
        myPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("坐标X:"+e.getX()+",坐标Y:"+e.getY()+"");
            }
        });


        label_ceshi.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                if (!label_ceshi.getText().equals("恭喜恭喜好眼力！！")||!label_ceshi2.getText().equals("恭喜恭喜好眼力！！")){
                    a++;
                }
                if(a==3){
                    label_cg.setOpaque(true);
                    label_cg.setBackground(Color.YELLOW);
                    label_cg.setText("恭喜老板！通过成功!!!");
                    label_cg.setForeground(Color.red);
                    label_cg.setFont(new Font("隶书",Font.BOLD,28));
                }
                label_ceshi.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.BLUE));
                label_ceshi.setText("恭喜恭喜好眼力！！");
                label_ceshi2.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.BLUE));
                label_ceshi2.setText("恭喜恭喜好眼力！！");

                label_nb.setText(""+a+"");
            }
        });
        label_ceshi2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (!label_ceshi.getText().equals("恭喜恭喜好眼力！！")||!label_ceshi2.getText().equals("恭喜恭喜好眼力！！")){
                    a++;
                }
                if(a==3){
                    label_cg.setOpaque(true);
                    label_cg.setBackground(Color.YELLOW);
                    label_cg.setText("恭喜老板！通过成功!!!");
                    label_cg.setForeground(Color.red);
                    label_cg.setFont(new Font("隶书",Font.BOLD,28));
                }
                label_ceshi.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.BLUE));
                label_ceshi.setText("恭喜恭喜好眼力！！");
                label_ceshi2.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.BLUE));
                label_ceshi2.setText("恭喜恭喜好眼力！！");

                label_nb.setText(""+a+"");
            }
        });
        label_ceshi3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (!label_ceshi3.getText().equals("恭喜恭喜好眼力！！")||!label_ceshi4.getText().equals("恭喜恭喜好眼力！！")){
                    a++;
                }
                if(a==3){
                    label_cg.setOpaque(true);
                    label_cg.setBackground(Color.YELLOW);
                    label_cg.setText("恭喜老板！通过成功!!!");
                    label_cg.setForeground(Color.red);
                    label_cg.setFont(new Font("隶书",Font.BOLD,28));
                }
                label_ceshi3.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.green));
                label_ceshi3.setText("恭喜恭喜好眼力！！");
                label_ceshi4.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.green));
                label_ceshi4.setText("恭喜恭喜好眼力！！");

                label_nb.setText(""+a+"");
            }
        });
        label_ceshi4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (!label_ceshi3.getText().equals("恭喜恭喜好眼力！！")||!label_ceshi4.getText().equals("恭喜恭喜好眼力！！")){
                    a++;
                }
                if(a==3){
                    label_cg.setOpaque(true);
                    label_cg.setBackground(Color.YELLOW);
                    label_cg.setText("恭喜老板！通过成功!!!");
                    label_cg.setForeground(Color.red);
                    label_cg.setFont(new Font("隶书",Font.BOLD,28));
                }
                label_ceshi3.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.green));
                label_ceshi3.setText("恭喜恭喜好眼力！！");
                label_ceshi4.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.green));
                label_ceshi4.setText("恭喜恭喜好眼力！！");

                label_nb.setText(""+a+"");
            }
        });
        label_ceshi5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (!label_ceshi5.getText().equals("恭喜恭喜好眼力！！")||!label_ceshi4.getText().equals("恭喜恭喜好眼力！！")){
                    a++;
                }
                if(a==3){
                    label_cg.setOpaque(true);
                    label_cg.setBackground(Color.YELLOW);
                    label_cg.setText("恭喜老板！通过成功!!!");
                    label_cg.setForeground(Color.red);
                    label_cg.setFont(new Font("隶书",Font.BOLD,28));
                }
                label_ceshi5.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.red));
                label_ceshi5.setText("恭喜恭喜好眼力！！");
                label_ceshi6.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.red));
                label_ceshi6.setText("恭喜恭喜好眼力！！");

                label_nb.setText(""+a+"");
            }
        });
        label_ceshi6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (!label_ceshi5.getText().equals("恭喜恭喜好眼力！！")||!label_ceshi6.getText().equals("恭喜恭喜好眼力！！")){
                    a++;
                }
                if(a==3){
                    label_cg.setOpaque(true);
                    label_cg.setBackground(Color.YELLOW);
                    label_cg.setText("恭喜老板！通过成功!!!");
                    label_cg.setForeground(Color.red);
                    label_cg.setFont(new Font("隶书",Font.BOLD,28));
                }
                label_ceshi5.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.red));
                label_ceshi5.setText("恭喜恭喜好眼力！！");
                label_ceshi6.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.red));
                label_ceshi6.setText("恭喜恭喜好眼力！！");

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

//        蓝块
        label_ceshi.setBounds(10,250,100,120);
        label_ceshi2.setBounds(520,250,100,120);

//        绿块
        label_ceshi3.setBounds(70,100,100,120);
        label_ceshi4.setBounds(550,100,100,120);
        //        红块
        label_ceshi5.setBounds(400,500,100,120);
        label_ceshi6.setBounds(900,500,100,120);
//成功

        label_cg.setBounds(330,20,330,100);



        label_nb.setBounds(30,1,50,50);
        label_nb.setText(""+a+"");
        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);

        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,1000,687);
        myPanel.add(label_cg);
        myPanel.add(label_ceshi5);
        myPanel.add(label_ceshi6);
        myPanel.add(label_ceshi4);
        myPanel.add(label_ceshi3);
        myPanel.add(label_ceshi2);
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

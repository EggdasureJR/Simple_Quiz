package simple_quiz_test;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Buttons {
    static int Button_width = (int) (Windows.Window.getWidth() / 2 - 38);

    static int Button_Hight = Windows.Window.getHeight() / 11 * 3 - 50;

    static JPanel Button_1;

    static JLabel answer_text_1;

    static JPanel Button_2;

    static JLabel answer_text_2;

    static JPanel Button_3;

    static JLabel answer_text_3;

    static JPanel Button_4;

    static JLabel answer_text_4;

    static JPanel Button_True;

    static JLabel answer_text_True;

    static JPanel Button_False;

    static JLabel answer_text_False;

    static int option = 0;


    public static void Button_1(String answer){
        Button_1 = new JPanel();

        Button_1.setBackground(new Color(255, 0, 0));

        Button_1.setBounds(25, Windows.question_box.getHeight() + 50, (int) (Windows.Window.getWidth() / 2 - 38), Windows.Window.getHeight() / 11 * 3 - 50);


        Button_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                option = 1;

                Button_1.setBackground(new Color (200, 0, 0));
                
                Button_2.setBackground(new Color (0, 255, 0));

                Button_3.setBackground(new Color (0, 0, 255));

                Button_4.setBackground(new Color (255, 255, 0));
            }
        });


        answer_text_1 = new JLabel("<html><div style='text-align: center;'>" + answer + "</div></html>", JLabel.CENTER);

        answer_text_1.setHorizontalAlignment(JLabel.CENTER);

        answer_text_1.setVerticalAlignment(JLabel.CENTER);

        Button_1.setLayout(new BorderLayout());

        answer_text_1.setFont(new Font("Arial", Font.BOLD, Buttons.Button_1.getHeight() / 5));

        answer_text_1.setForeground(new Color(50, 50, 50));


        Button_1.add(answer_text_1, BorderLayout.CENTER);

        Windows.Window.add(Button_1);
    }

    public static void Button_2(String answer){
        Button_2 = new JPanel();

        Button_2.setBackground(new Color(0, 255, 0));

        Button_2.setBounds(Buttons.Button_1.getWidth() + 50, Windows.question_box.getHeight() + 50, (int) (Windows.Window.getWidth() / 2 - 38), Windows.Window.getHeight() / 11 * 3 - 50);


        Button_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                option = 2;

                Button_1.setBackground(new Color (255, 0, 0));
                
                Button_2.setBackground(new Color (0, 200, 0));

                Button_3.setBackground(new Color (0, 0, 255));

                Button_4.setBackground(new Color (255, 255, 0));
            }
        });


        answer_text_2 = new JLabel("<html><div style='text-align: center;'>" + answer + "</div></html>", JLabel.CENTER);

        answer_text_2.setHorizontalAlignment(JLabel.CENTER);answer_text_2.setFont(new Font("Arial", Font.BOLD, Buttons.Button_2.getHeight() / 5));

        answer_text_2.setVerticalAlignment(JLabel.CENTER);

        Button_2.setLayout(new BorderLayout());

        answer_text_2.setFont(new Font("Arial", Font.BOLD, Buttons.Button_2.getHeight() / 5));

        answer_text_2.setForeground(new Color(50, 50, 50));


        Button_2.add(answer_text_2, BorderLayout.CENTER);
        
        Windows.Window.add(Button_2);
    }

    public static void Button_3(String answer){
        Button_3 = new JPanel();

        Button_3.setBackground(new Color(0, 0, 255));

        Button_3.setBounds(25, Windows.question_box.getHeight() + Buttons.Button_1.getHeight() + 75, (int) (Windows.Window.getWidth() / 2 - 38), Windows.Window.getHeight() / 11 * 3 - 50);


        Button_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                option = 3;

                Button_1.setBackground(new Color (255, 0, 0));
                
                Button_2.setBackground(new Color (0, 255, 0));

                Button_3.setBackground(new Color (0, 0, 200));

                Button_4.setBackground(new Color (255, 255, 0));
            }
        });


        answer_text_3 = new JLabel("<html><div style='text-align: center;'>" + answer + "</div></html>", JLabel.CENTER);

        answer_text_3.setHorizontalAlignment(JLabel.CENTER);

        answer_text_3.setVerticalAlignment(JLabel.CENTER);

        Button_3.setLayout(new BorderLayout());

        answer_text_3.setFont(new Font("Arial", Font.BOLD, Buttons.Button_3.getHeight() / 5));

        answer_text_3.setForeground(new Color(50, 50, 50));


        Button_3.add(answer_text_3, BorderLayout.CENTER);

        Windows.Window.add(Button_3);
    }

    public static void Button_4(String answer){
        Button_4 = new JPanel();

        Button_4.setBackground(new Color(255, 255, 0));

        Button_4.setBounds(Buttons.Button_3.getWidth() + 50, Windows.question_box.getHeight() + Buttons.Button_2.getHeight() + 75, (int) (Windows.Window.getWidth() / 2 - 38), Windows.Window.getHeight() / 11 * 3 - 50);


        Button_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                option = 4;

                Button_1.setBackground(new Color (255, 0, 0));
                
                Button_2.setBackground(new Color (0, 255, 0));

                Button_3.setBackground(new Color (0, 0, 255));

                Button_4.setBackground(new Color (200, 200, 0));
            }
        });


        answer_text_4 = new JLabel("<html><div style='text-align: center;'>" + answer + "</div></html>", JLabel.CENTER);

        answer_text_4.setHorizontalAlignment(JLabel.CENTER);

        answer_text_4.setVerticalAlignment(JLabel.CENTER);

        Button_4.setLayout(new BorderLayout());

        answer_text_4.setFont(new Font("Arial", Font.BOLD, Buttons.Button_4.getHeight() / 5));

        answer_text_4.setForeground(new Color(50, 50, 50));


        Button_4.add(answer_text_4);

        Windows.Window.add(Button_4);
    }

    public static void Button_True(){
        Button_True = new JPanel();

        Button_True.setBackground(new Color(255, 0, 0));

        Button_True.setBounds(25, Windows.question_box.getHeight() + 50, Windows.Window.getWidth() - 50, Windows.Window.getHeight() / 11 * 3 - 50);


        Button_True.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                option = 1;

                Button_True.setBackground(new Color(200, 0, 0));

                Button_False.setBackground(new Color(255, 255, 0));
            }
        });


        answer_text_True = new JLabel("<html><div style='text-align: center;'>True</div></html>", JLabel.CENTER);

        answer_text_True.setHorizontalAlignment(JLabel.CENTER);

        answer_text_True.setVerticalAlignment(JLabel.CENTER);

        Button_True.setLayout(new BorderLayout());

        answer_text_True.setFont(new Font("Arial", Font.BOLD, Buttons.Button_True.getHeight() / 5));

        answer_text_True.setForeground(new Color(50, 50, 50));


        Button_True.add(answer_text_True);

        Windows.Window.add(Button_True);
    }

        public static void Button_False(){
        Button_False = new JPanel();

        Button_False.setBackground(new Color(255, 255, 0));

        Button_False.setBounds(25, Buttons.Button_True.getHeight() + Windows.question_box.getHeight() + 75, Windows.Window.getWidth() - 50, Windows.Window.getHeight() / 11 * 3 - 50);


        Button_False.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                option = 2;

                Button_True.setBackground(new Color(255, 0, 0));

                Button_False.setBackground(new Color(200, 200, 0));
            }
        });

        
        answer_text_False = new JLabel("<html><div style='text-align: center;'>False</div></html>", JLabel.CENTER);

        answer_text_False.setHorizontalAlignment(JLabel.CENTER);

        answer_text_False.setVerticalAlignment(JLabel.CENTER);

        Button_False.setLayout(new BorderLayout());

        answer_text_False.setFont(new Font("Arial", Font.BOLD, Buttons.Button_False.getHeight() / 5));

        answer_text_False.setForeground(new Color(50, 50, 50));


        Button_False.add(answer_text_False);

        Windows.Window.add(Button_False);
    }
}

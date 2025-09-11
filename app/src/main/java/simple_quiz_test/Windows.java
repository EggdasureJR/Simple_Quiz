package simple_quiz_test;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Windows {
    static JFrame Window = new JFrame("Simple Quiz");

    static JPanel question_box;

    static JLabel question_text;

    static JPanel submit_box;

    static JLabel submit_text;

    static JTextArea submit_text_area;


    static JPanel result;

    static JLabel result_text;


    public static void Window_setup(){
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Window.setSize(520, 700);

        Window.getContentPane().setBackground(new Color(150, 150, 150));

        Window.setLayout(null);

        Window.setVisible(true);

        
    }

    public static void Question(String question){
        question = "<html><div style='text-align: center;'>" + question + "</div></html>";

        question_box = new JPanel();

        question_box.setBackground(new Color(40, 40, 40));

        question_box.setBounds(25, 25, Windows.Window.getWidth() - 50, Windows.Window.getHeight() - Windows.Window.getHeight() / 3 * 2);


        question_text = new JLabel(question, JLabel.CENTER);

        question_text.setHorizontalAlignment(JLabel.CENTER);

        question_text.setVerticalAlignment(JLabel.CENTER);

        question_box.setLayout(new BorderLayout());

        question_text.setFont(new Font("Arial", Font.BOLD, Windows.question_box.getHeight() / 10));

        question_text.setForeground(new Color(245, 245, 245));


        submit_box = new JPanel();

        submit_box.setBackground(new Color(60, 60, 60));
        
        submit_box.setBounds(Windows.Window.getWidth() / 2 - (Windows.Window.getWidth() / 6), Windows.question_box.getHeight() + ((Windows.Window.getHeight() / 11 * 3 - 50) * 2) + 100, Windows.Window.getWidth() / 3, Windows.Window.getHeight() / 20);


        submit_box.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                if(Buttons.option != 0){
                    SimpleQuiz.clear();
                }
            }
        });

        
        submit_text = new JLabel("Submit", JLabel.CENTER);

        submit_text.setHorizontalAlignment(JLabel.CENTER);

        submit_text.setVerticalAlignment(JLabel.CENTER);

        submit_box.setLayout(new BorderLayout());

        submit_text.setFont(new Font("Arial", Font.BOLD, Windows.submit_box.getHeight() / 2));

        submit_text.setForeground(new Color(245, 245, 245));


        question_box.add(question_text, BorderLayout.CENTER);

        Window.add(question_box);

        submit_box.add(submit_text, BorderLayout.CENTER);

        Window.add(submit_box);
    }


    public static void results(){
        result = new JPanel();

        result.setBackground(new Color(60, 60, 60));

        result.setBounds(25, 25, Window.getWidth() - 50, Window.getHeight() - 100);


        result_text = new JLabel("<html><div style='text-align: center;'>You got " + SimpleQuiz.point_sum + "/" + SimpleQuiz.total_questions + ", that is " + SimpleQuiz.point_sum * 1.0 / SimpleQuiz.total_questions* 1.0 * 100 + "%</div></html>", JLabel.CENTER);

        result_text.setHorizontalAlignment(JLabel.CENTER);

        result_text.setVerticalAlignment(JLabel.CENTER);

        result.setLayout(new BorderLayout());

        result_text.setFont(new Font("Arial", Font.BOLD, Windows.Window.getHeight() / 20));

        result_text.setForeground(new Color(245, 245, 245));


        result.add(result_text, BorderLayout.CENTER);

        Window.add(result);
    }
}

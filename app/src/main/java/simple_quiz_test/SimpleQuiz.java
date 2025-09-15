package simple_quiz_test;

import java.awt.*;

import java.awt.event.*;

import javax.swing.JPanel;


public class SimpleQuiz {

    static int point_sum = 0;

    static int total_questions = 0;

    static Boolean answered = false;


    static Boolean question_4 = false;

    static Boolean question_bool = false;

    static Boolean results= false;
    public static void main(String[] args) {
        Windows.Window_setup();

        Questions.Quizzes();

        resize();

        for(int n = 1; n <= Questions.Test.size(); n++){
            try{
                questions_4(Questions.Test.get("Q_4-" + n).get(1), Questions.Test.get("Q_4-" + n).get(2), Questions.Test.get("Q_4-" + n).get(3), Questions.Test.get("Q_4-" + n).get(4), Questions.Test.get("Q_4-" + n).get(0));
                while(!answered){System.out.print("");}
                answered = false;

                if(Buttons.option == Integer.parseInt(Questions.Test.get("Q_4-" + n).get(5))){
                    point_sum++;
                }
            }

            catch(Exception e){
                question_bool(Questions.Test.get("Q_B-" + n).get(0));
                while(!answered){System.out.print("");}
                answered = false;

                if(Buttons.option == 1 && Questions.Test.get("Q_B-" + n).get(1).equals("true")){
                    point_sum++;
                }

                else if(Buttons.option == 2 && Questions.Test.get("Q_B-" + n).get(1).equals("false")){
                    point_sum++;
                }
            }

            total_questions++;
        } 

        results = true;
        
        Windows.results();
    }

    public static void questions_4(String answer_1, String answer_2, String answer_3, String answer_4, String question){   
        JPanel blank = new JPanel();

        blank.setBounds(0, 0, 0, 0);

        Windows.Question(question);

        Buttons.Button_1(answer_1);
        
        Buttons.Button_2(answer_2);

        Buttons.Button_3(answer_3);

        Buttons.Button_4(answer_4);

        question_bool = false;

        question_4 = true;
    }

    public static void question_bool(String question){
        JPanel blank = new JPanel();

        blank.setBounds(0, 0, 0, 0);

        Windows.Question(question);

        Buttons.Button_True();

        Buttons.Button_False();

        question_4 = false;

        question_bool = true;
    }

    public static void resize(){
                Windows.Window.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                if(results){
                    Windows.result.setBounds(25, 25, Windows.Window.getWidth() - 50, Windows.Window.getHeight() - 100);

                    Windows.result_text.setFont(new Font("Arial", Font.BOLD, Windows.Window.getHeight() / 20));
                }

                else if(question_4){
                    resize_variables_4();
                }

                else if(question_bool){
                    resize_variables_Bool();
                }
            }
        });
    }

    public static void resize_variables_4(){
                Windows.question_box.setBounds(25, 25, Windows.Window.getWidth() - 50, Windows.Window.getHeight() - Windows.Window.getHeight() / 3 * 2);

                Windows.question_text.setFont(new Font("Arial", Font.BOLD, Windows.question_box.getHeight() / 10));


                Windows.submit_box.setBounds(Windows.Window.getWidth() / 2 - (Windows.Window.getWidth() / 6), Windows.question_box.getHeight() + Buttons.Button_1.getHeight() + Buttons.Button_3.getHeight() + 100, Windows.Window.getWidth() / 3, Windows.Window.getHeight() / 20);

                Windows.submit_text.setFont(new Font("Arial", Font.BOLD, Windows.submit_box.getHeight() / 2));


                Buttons.Button_1.setBounds(25, Windows.question_box.getHeight() + 50, (int) (Windows.Window.getWidth() / 2 - 38), Windows.Window.getHeight() / 11 * 3 - 50);

                Buttons.answer_text_1.setFont(new Font("Arial", Font.BOLD, Buttons.Button_1.getHeight() /  5));

                Buttons.Button_2.setBounds(Buttons.Button_1.getWidth() + 50, Windows.question_box.getHeight() + 50, Windows.Window.getWidth() / 2 - 38, Windows.Window.getHeight() / 11 * 3 - 50);

                Buttons.answer_text_2.setFont(new Font("Arial", Font.BOLD, Buttons.Button_2.getHeight() / 5));

                Buttons.Button_3.setBounds(25,  Windows.question_box.getHeight() + Buttons.Button_1.getHeight() + 75, Windows.Window.getWidth() / 2 - 38, Windows.Window.getHeight() / 11 * 3 - 50);

                Buttons.answer_text_3.setFont(new Font("Arial", Font.BOLD, Buttons.Button_3.getHeight() / 5));

                Buttons.Button_4.setBounds(Buttons.Button_3.getWidth() + 50, Buttons.Button_1.getHeight() + Windows.question_box.getHeight() + 75, Windows.Window.getWidth() / 2 - 38, Windows.Window.getHeight() / 11 * 3 - 50);

                Buttons.answer_text_4.setFont(new Font("Arial", Font.BOLD, Buttons.Button_4.getHeight() / 5));
    }


    public static void resize_variables_Bool(){
                Windows.question_box.setBounds(25, 25, Windows.Window.getWidth() - 50, Windows.Window.getHeight() - Windows.Window.getHeight() / 3 * 2);

                Windows.question_text.setFont(new Font("Arial", Font.BOLD, Windows.question_box.getHeight() / 10));


                Windows.submit_box.setBounds(Windows.Window.getWidth() / 2 - (Windows.Window.getWidth() / 6), Windows.question_box.getHeight() + Buttons.Button_True.getHeight() + Buttons.Button_False.getHeight() + 100, Windows.Window.getWidth() / 3, Windows.Window.getHeight() / 20);

                Windows.submit_text.setFont(new Font("Arial", Font.BOLD, Windows.submit_box.getHeight() / 2));


                Buttons.Button_True.setBounds(25,  Windows.question_box.getHeight() + 50, Windows.Window.getWidth() - 50, Windows.Window.getHeight() / 11 * 3 - 50);

                Buttons.answer_text_True.setFont(new Font("Arial", Font.BOLD, Buttons.Button_True.getHeight() / 5));

                Buttons.Button_False.setBounds(25, Buttons.Button_True.getHeight() + Windows.question_box.getHeight() + 75, Windows.Window.getWidth() - 50, Windows.Window.getHeight() / 11 * 3 - 50);

                Buttons.answer_text_False.setFont(new Font("Arial", Font.BOLD, Buttons.Button_False.getHeight() / 5));
    }

    
    public static void clear(){
        answered = true;

        results = false;

        Windows.question_box.removeAll();
        Windows.question_box.revalidate();
        Windows.question_box.repaint();
        Windows.question_box.setVisible(false);
        Windows.Window.remove(Windows.question_box);

        Windows.submit_box.removeAll();
        Windows.submit_box.revalidate();
        Windows.submit_box.repaint();
        Windows.submit_box.setVisible(false);
        Windows.Window.remove(Windows.submit_box);

        if(question_4){
            Buttons.Button_1.removeAll();
            Buttons.Button_1.revalidate();
            Buttons.Button_1.repaint();
            Buttons.Button_1.setVisible(false);
            Windows.Window.remove(Buttons.Button_1);

            Buttons.Button_2.removeAll();
            Buttons.Button_2.revalidate();
            Buttons.Button_2.repaint();
            Buttons.Button_2.setVisible(false);
            Windows.Window.remove(Buttons.Button_2);

            Buttons.Button_3.removeAll();
            Buttons.Button_3.revalidate();
            Buttons.Button_3.repaint();
            Buttons.Button_3.setVisible(false);
            Windows.Window.remove(Buttons.Button_3);

            Buttons.Button_4.removeAll();
            Buttons.Button_4.revalidate();
            Buttons.Button_4.repaint();
            Buttons.Button_4.setVisible(false);
            Windows.Window.remove(Buttons.Button_4);
        }

        else if(question_bool){
            Buttons.Button_True.removeAll();
            Buttons.Button_True.revalidate();
            Buttons.Button_True.repaint();
            Buttons.Button_True.setVisible(false);
            Windows.Window.remove(Buttons.Button_True);

            Buttons.Button_False.removeAll();
            Buttons.Button_False.revalidate();
            Buttons.Button_False.repaint();
            Buttons.Button_False.setVisible(false);
            Windows.Window.remove(Buttons.Button_False);
        }
    }
}

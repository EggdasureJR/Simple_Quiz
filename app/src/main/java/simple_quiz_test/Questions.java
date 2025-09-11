package simple_quiz_test;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Questions {
    static int question_count = 0;

    static Dictionary<String, List<String>> Test = new Hashtable<>();

    static String test = "";

    public static void Quizzes(){
        JSONParser parser = new JSONParser();

        test = "example_test";

        try {
            FileReader reader = new FileReader("app/src/test/resources/test/" + test + ".json");

            Object obj = parser.parse(reader);

            JSONObject tests = (JSONObject) obj;

            String Tests = tests.toString();

            String correct_answer = "";

            Tests = Tests.substring(1, Tests.length());

            for(int n = 0; n < Tests.length() - 2; n++){
                if(Tests.substring(n, n + 2).equals("\\/")){
                    Tests = Tests.substring(0, n) + "/" + Tests.substring(n + 2, Tests.length());
                }
            }

            while(true){
                List<String> Question = new ArrayList<>();

                int old_length = Tests.length();
                try{
                    if(Tests.substring(3, 4).equals("4")){
                        String question_number = Tests.substring(1, 6);

                        Tests = Tests.substring(14, Tests.length());

                        for(int n = 1; n <= Tests.length(); n++){
                            if(Tests.substring(n, n + 1).equals("\"")){
                                Question.add(Tests.substring(0, n));

                                Tests = Tests.substring(n + 19, Tests.length());

                                break;
                            }
                        }

                        correct_answer = (Tests.substring(0, 1));

                        Tests = Tests.substring(9, Tests.length());

                        for(int n = 0; n < 4; n++){
                            for(int m = 0; m < Tests.length(); m++){
                                if(Tests.substring(m, m + 1).equals("\"")){
                                    Question.add(Tests.substring(0, m));

                                    if(n < 3){
                                        Tests = Tests.substring(m + 9, Tests.length());
                                    }

                                    else{
                                        Tests = Tests.substring(m + 3, Tests.length());
                                    }

                                    break;
                                }
                            }
                        }

                        Question.add(correct_answer);

                        Test.put(question_number, Question);
                    }
                }
                catch(Exception e){}
                    
                try{
                    if(Tests.substring(3, 4).equals("B")){
                        Question = new ArrayList<>();

                        String question_number = Tests.substring(1, 6);

                        Tests = Tests.substring(14, Tests.length());

                        for(int n = 0; n < Tests.length(); n++){
                            if(Tests.substring(n, n + 1).equals("\"")){
                                Question.add(Tests.substring(0, n));
                                
                                Tests = Tests.substring(n + 20, Tests.length());

                                break;
                            }   
                        }

                        if(Tests.substring(0, 1).equals("t")){
                            Question.add("true");

                            Tests = Tests.substring(7, Tests.length());
                        }

                        else{
                            Question.add("false");

                            Tests = Tests.substring(8, Tests.length());
                        }

                        Test.put(question_number, Question);
                    }
                }
                catch(Exception e){}

                try{
                    if(old_length == Tests.length()){
                        Tests = Tests.substring(1, Tests.length());
                    }
                }
                catch(Exception e){}


                if(Tests.length() == 0){
                        break;
                    }

            }
        }

        catch (Exception e) { 
        }
    }
}

import java.util.HashMap;

public class Interpreter {
    public boolean looping = false;
    public HashMap<String, String> globalVariables = new HashMap<String, String>();
    // globalVariables.put(a, b);
    // globalVariables.get(a);

    public static int interpret(String data){
        //if a comment
        if(data.startsWith("//")){
            System.out.println("comment");
            return 0;
        }
        //if an empty line
        if(data.equals("")){
            System.out.println("EMPTY");
            return 0;
        }
        String[] scriptWords = data.split(" "); //split sentence into array of words
        for(int i=0; i<scriptWords.length; i++){
            System.out.println(scriptWords[i]);
        }


        return 1;
    }
}
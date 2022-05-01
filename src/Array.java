import java.util.Stack;

public class Array {
    public static void main(String[] args) {
        String s="/home//foo/";
        String[] split = s.split("/");
        Stack<String> stack = new Stack<>();
        for(String s1:split)
            if(!s1.equals("")) {
                if(!s1.equals("..")&&!s1.equals("."))
                    stack.push(s1);
                else if(s1.equals(".")){}
                else
                    if(!stack.empty())
                        stack.pop();
            }
        StringBuilder str = new StringBuilder();
        for(String key: stack)
            str.append("/").append(key);
        System.out.println(str);
    }
}

class Solution {
    public String interpret(String command) {
        if(command.equals("Goal"))
            return command;
        String ch="";
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')'){
                    ch+="o";
                }else if(i<command.length()-1 && command.charAt(i+1)=='a'){
                    ch+='a';
                }
            }
            else if(command.charAt(i)==')' || command.charAt(i)=='a'){continue;}
            else
             ch+=command.charAt(i);
        }
        return ch;
    }
}
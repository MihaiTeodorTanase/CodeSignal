package CodeSignalTemplate;

public class VariableName {
    public static void main(String[] args) {
    String test = "var_1__Int";
        System.out.println(variableName(test));
    }
    static boolean variableName(String name) {
        for(int i = 0 ; i < name.length(); i++){
            if(Character.isDigit(name.charAt(0))){
                return false;
            }
            if(!Character.isLetterOrDigit(name.charAt(i)) && name.charAt(i)!='_'){
                return false;
            }
        }
        return true;
    }
}

public class Sign{
    private String message;
    private int width;

    public Sign(String mes, int wid){
        message = mes;
        width = wid;
    }

    public int numberOfLines(){
        return ((message.length()/width) + 1);
    }

    public String getLines(){
        if(message.length() < 1){
            return null;
        }
        String newStr = "";
        for(int i=0; i<message.length(); i++){
            if(i%width == 0 && i!=0){
                newStr += ";";
            }
            newStr += message.substring(i, i+1);
        }
        return newStr;
    }
}
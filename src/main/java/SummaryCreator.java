public class SummaryCreator{
    public String create(String text){
        String result;
        if(text.length() > 15){
            if(text.charAt(15) != ' '){

                result = text.substring(0, 15) + "...";
                return result;
            }
            if(text.charAt(15) == ' '){
                return text.substring(0, 15);
            }
        }
        return text;
    }
}

package org.example;

class Tanker{
    String serialNumber;
    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }
    public String getSerialNumber(){
        return serialNumber;
    }

    public static void main(String[] args){
        int count = 5200;
        String result = "";
        if(count >= 1000){
            for(int i = 1; (count/1000)>0; i++ ){
                result += "X";
                count -= 1000;
            }

            if(count >= 100){
                for(int i = 1; (count/100)> 0; i++){
                    result += "Y";
                    count -= 100;
                }
            }
            System.out.println("result = " + result);
        }

    }


}

class Shape {
    public final void printBaseInfo() {
        System.out.println("Very basic info");
    }
}

class Circle {
    //Так не можна – буде помилка компіляції
    public void printBaseInfo() {
        System.out.println("Overrided!");
    }
}
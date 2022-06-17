package amaya.task2;

public class Multiply {

    public static void main(String[] args) {
        for (String str : args) {
            splitString(str);
        }
    }
    private static void splitString(String myString) {
        String[] splitString = myString.split(",");
        int parse;
        int sum = 0;
        for (int i=0; i<splitString.length; i++){
            parse = Integer.parseInt(splitString[i].trim());
            sum = sum + parse;
            System.out.print(splitString[i] + ' ');
        }
        System.out.println(sum + " - incoming summ");
    }
}

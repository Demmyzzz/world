package amaya.task2;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Multiply {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter any text ");
        String anytext = in.nextLine();
        in.close();

        String[] param = getParam(anytext);
        String[] num = getNum(anytext);
//        "python3 main.py --poly=1,2,3,4,5 [-v]"
        int[] ppl = parsNum(num[0]);
        getAnswer(param[0], ppl);

    }

    private static void getAnswer(String s, int[] ppl) {
        switch (s) {
            case  ("--poly"):
            case  ("-poly"):
                int answer = 0;
                for (int i=0; i<ppl.length;i++){
                    answer = answer + ppl[i];
                }
                System.out.println(answer);
                break;
            default:
                System.out.println("nonono");
                break;
        }
    }

    private static int[] parsNum(String num) {
        int g = 0;
        char[] chars = num.toCharArray();
        int chartoint[] = new int[chars.length];
        for (int i=0;i<chars.length;i++){
            if (i % 2 != 0){
                chartoint[g] = Character.getNumericValue(chars[i]);
                g++;
            }
        }
        return chartoint;
    }
    private static String[] getParam(String desc) {
        int count = 0;
        String[] allMatches = new String[2];
        Matcher m = Pattern.compile("-+[A-Za-z]*|-[a-z]").matcher(desc);
        while (m.find()) {
            allMatches[count] = m.group();
            count++;
        }
        return allMatches;
    }
    private static String[] getNum(String desc) {
        int count = 0;
        String[] allMatches = new String[1];
        Matcher m = Pattern.compile("=(\\d.)+").matcher(desc);
        while (m.find()) {
            allMatches[count] = m.group();
            count++;
        }
        return allMatches;
    }


    }





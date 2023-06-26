package amaya.task2;

public class Parse{


    private String[] parts;

    public Parse(String line){

        parts = line.split(" ");

    }
    public String[] getParts(){
        return parts;
    }

}

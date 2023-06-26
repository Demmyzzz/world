package amaya.task5;

public class People {

    private String name = "KAPIBARA";
    private int wantlocation = (int) ( 1+Math.random() * 500 );
    private int currentFloor = (int) ( 1+Math.random() * 9 );

    public People(){
        this.name = name;
        this.currentFloor = currentFloor;
        this.wantlocation = wantlocation;
    }
    public String getName(){
        return this.name;
    }
    public int getcurrentFloor(){
        return this.currentFloor;
    }

    public int getWantlocation(){
        return this.wantlocation;
    }

    public void setWantlocation(int newlocation){
        this.wantlocation = newlocation;
    }

    @Override
    public String toString() {
        return name + " желает отправинтся на - " + wantlocation + " этаж из локации " + currentFloor + " этаж";
    }
    public String callElevator() {
        return name + " кастует призыв лифта на - " + currentFloor + " этаж ";
    }
}

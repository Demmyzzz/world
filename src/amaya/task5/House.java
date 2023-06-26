package amaya.task5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.SortedMap;

public class House {

    Holl holl1 = new Holl();
    Holl holl2 = new Holl();
    Holl holl3 = new Holl();
    People cappy = new People();
    public House(){

        holl1.setElevatorFloor(1);
        holl2.setElevatorFloor((int) ( 1+Math.random() * 9 ));
        holl3.setElevatorFloor((int) ( 1+Math.random() * 9));

        System.out.println(holl1.el.getLocation());
        System.out.println(holl2.el.getLocation());
        System.out.println(holl3.el.getLocation());

        System.out.println(cappy.toString());
        checkFloor(cappy.getWantlocation());
        System.out.println(cappy.callElevator());

        findShortCut();


    }

    private void findShortCut() {
        int[] currentlocation = {holl1.el.getLocation(), holl2.el.getLocation(), holl3.el.getLocation()};

        for (int i = 0 ; i<=2 ; i++){
            currentlocation[i] = Math.abs(cappy.getcurrentFloor() - currentlocation[i]);
            System.out.println(currentlocation[i]+"fff");

        }

        int min = Arrays.stream(currentlocation).min().getAsInt();
        System.out.println("Минимальное число: " + min);
    }

    private void checkFloor(int location) {
        if (location >= 10 || location <= 0){
            System.out.println("KAPIBARA не может отправится на этот этаж!!!");
            cappy.setWantlocation((int) ( 1+Math.random() * 9 ));
            System.out.println(cappy.toString());
            checkFloor(cappy.getWantlocation());
        }else{
            System.out.println("Желание KAPIBARA осуществимо. Приятного пути!!!");

        }
    }
}

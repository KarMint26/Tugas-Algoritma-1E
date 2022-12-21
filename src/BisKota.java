import java.util.ArrayList;

public class BisKota {
    public static void main(String[] args) {
        ArrayList<int[]> stopGo = new ArrayList<int[]>();
        stopGo.add(new int[] {10, 0});
        stopGo.add(new int[] {3, 5});
        stopGo.add(new int[] {2, 5});
        System.out.println(getPassenger(stopGo));
    }
    public static int getPassenger(ArrayList<int[]> bisKota){
        return (bisKota.get(0)[0] - bisKota.get(0)[1]) + (bisKota.get(1)[0] - bisKota.get(1)[1]) + (bisKota.get(2)[0] - bisKota.get(2)[1]);
    }
}

package task_02;

// Исправьте ошибки.
// Должно быть: вывод фруктов, потом овощей
public class Main {

    public static void main(String[] arg){

        Fruits fruits = new Fruits();
        fruits.start();
        try {
            fruits.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        showVeges(getVeges());
    }

    private static String[] getVeges() {
        return new String[]{"tomato", "cucumber", "carrot"};
    }

    private static void showVeges(String [] veges) {
        for (String veg : veges){
            System.out.println(veg);
        }
    }
}

package task_03;

// Вывод групп товаров.
// Исправьте ошибки.
public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = new ThreadGroup("Thread group");
        getFruits(group);

    }

    private static void getFruits(ThreadGroup group)throws InterruptedException {
        Fruits fruits = new Fruits(group, "\nFruits:");
        fruits.start();
        try {
            fruits.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        getVeges(group);/* метод ждет пока этот поток умрет, и подсоединяет другой поток **/
    }

    private static void getVeges(ThreadGroup group) throws InterruptedException {
        Veges veges = new Veges(group, "\nVeges:");
        veges.start();
        try {
            veges.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        getBerries(group);/* метод ждет пока этот поток умрет, и подсоединяет другой поток **/
    }

    private static void getBerries(ThreadGroup group) throws InterruptedException {
        Berries berries = new Berries(group, "\nBerries:");
        berries.start();
        try {
            berries.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        berries.interrupt();/* метод ждет пока этот поток умрет, и подсоединяет другой поток **/
    }
}

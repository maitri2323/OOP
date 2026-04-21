class SumThread extends Thread {
    int start, end;
    long sum = 0;

    SumThread(int s, int e) {
        start = s;
        end = e;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }

    long getSum() {
        return sum;
    }
}

public class SumApp {
    public static void main(String[] args) {
        SumThread t1 = new SumThread(1, 1000);
        SumThread t2 = new SumThread(1001, 2000);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
        }

        long total = t1.getSum() + t2.getSum();

        System.out.println("Total Sum: " + total);
        System.out.println("Maitri chauhan");
        System.out.println("250393107003");
    }
}
package uroki.thread;

public class PeopleQueue extends Thread {
    private String[] names;

    PeopleQueue(String... names) {
        this.names = names;
    }

    //очередь людей, который олжен пересмотреть hr
    @Override
    public void run() {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Обработаны документы: " + names[i]);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ignored) {
            }
        }
    }
}

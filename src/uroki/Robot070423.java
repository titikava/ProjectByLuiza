package uroki;

public class Robot070423 {
    int id;

    Robot070423(int id) {
        this.id = id;
        Brain b = new Brain();
        b.think();
    }

    private class Brain {
        public void think(){
            System.out.println(id + " is thinking");
        }
    }
}

package object;

public class Kletka {
    private String color;
    private int hight;
    private boolean isOpen;

    public Kletka() {
        color = "Red";
    }

    public Kletka(String c) {
        color = c;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int h) {
        if (h > 0) {
            this.hight = h;
        } else {
            System.out.println("Недопустимое значение");
        }
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean b) {
        this.isOpen = b;
    }

    public static void toBe(String name) {
        System.out.println(name + " есть");
    }

    public void sayHello(String name, String email) {
        System.out.println(name + " есть. С имейлом " + email);
    }


    public static void main(String[] args) {
        String kletkaName = "Витязь";
        toBe(kletkaName);
        String oi = "sad";
        toBe(oi);
    }
}






  /*    int a = 131;
        int b = 256498;
        int[] c = {0, 5, 7, 20, 50, 71};
        String[] s = {"A", "B", "C", "D"};

         if (b > a) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
        for (String t : s) {
            if (t != "Java") {
                System.out.println(t);
            }
        }
        for (int i = 0; i < s.length; i++) {
            if (s[i] != "Java") {
                System.out.println(s[i]);
            }
        }
        for (int t : c) {
            while (t < 20) {
                System.out.println(t);
                break;
            } */
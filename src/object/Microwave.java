package object;

public class Microwave {
    private String manufacturer;
    private int size;
    private boolean isWork;
    private String color;

    Microwave(){
        this.size = 750;
    }

    Microwave(String a, int b, String c){
        this.manufacturer = a;
        this.size = b;
        this.color = c;
    }
    public String getColor(){
        return color;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public void setManufacturer (String name) {
        switch (name) {
            case "LG":
            case "Samsung":
                this.manufacturer = name;
                break;
            default:
                System.out.println("Данный производитель не доступен в вашем регионе");
        }
    }

    public int getSize(){
        return size;
    }

    public void setSize (int size) {
        if (size>0 && size<1000) {
            this.size = size;
        } else {
            System.out.println("Неприемлемый размер");
        }
    }

    public boolean getIsWork(){
        return isWork;
    }

    public void setIsWork (boolean a) {
      this.isWork = a;
        if (isWork) {
            System.out.println("Состояние машины: включена");
        } else {
            System.out.println("Состояние машины: выключена");
        }
    }


    public static void mode(String name) {
        System.out.println("Установленный режим: " + name);
    }

    public static void time(int sec) {
        System.out.println("Установленное время приготовления: " + sec);
    }

   /* public static void onOrOff(boolean y) {
        if (isWork) {
            System.out.println("Состояние машины: включена");
        } else {
            System.out.println("Состояние машины: выключена");
        }
    }*/
}
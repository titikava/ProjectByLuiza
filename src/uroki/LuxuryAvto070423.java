package uroki;

import java.util.Objects;

public class LuxuryAvto070423 {
    private String model;
    private int year;
    private int price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LuxuryAvto070423 that = (LuxuryAvto070423) o;
        if (year != that.year) return false;
        if (price != that.price) return false;
        return model.equals(that.model);
    }

    @Override
    public int hashCode() {
        int result = model == null ? 0 : model.hashCode();
        //это все if else. Если model == null, то первое (0 в нашем случае), в противном случае model.hashCode();
        // if (model == null) { result = 0; } else { result = model.hashCode();}
        result = result + year;
        result = result + price;
        return result;
    }

    public LuxuryAvto070423(String model, int year, int price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }
}

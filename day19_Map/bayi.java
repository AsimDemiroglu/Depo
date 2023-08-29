package day19_Map;

public class bayi {
    String city;
    String town;
    int currentStock;
    boolean weekend;

    public bayi(String city, String town, int currentStock, boolean weekend) {
        this.city = city;
        this.town = town;
        this.currentStock = currentStock;
        this.weekend = weekend;
    }

    @Override
    public String toString() {
        return "bayi[" +
                "city='" + city + '\'' +
                ", town='" + town + '\'' +
                ", currentStock=" + currentStock +
                ", weekend=" + weekend +
                ']';
    }
}

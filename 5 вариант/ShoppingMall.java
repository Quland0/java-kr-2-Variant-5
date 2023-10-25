public class ShoppingMall {
    private String title;
    private String address;
    private int floors;
    private static boolean isCinema = true;

    public ShoppingMall(String title, String address, int floors, boolean isCinema) {
        this.title = title;
        this.address = address;
        this.floors = floors;
    }

    public static boolean isIsCinema() {
        return isCinema;
    }

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public int getFloors() {
        return floors;
    }
    public void display() {

    }

    @Override
    public String toString() {
        return "title: " + title + "\nAddress: " + address + "\nfloors: " + floors
                + "\nhave cinema: " + isCinema;
    }
}


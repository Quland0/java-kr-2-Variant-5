import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShoppingMall x = new ShoppingMall("Золотой Бабилон", "ул. Малиновского 225", 5, ShoppingMall.isIsCinema());
        System.out.println(x.toString());
        x.display();

//        List<Shop> shops = new ArrayList<>();
//        shops.add(new Shop(1, "детский мир", "магазин игрушек", 5));
//        shops.add(new Shop(2, "KFC", "fast health food", 15));
//        shops.add(new Shop(3, "Vapedon", "электронные сигареты", 3));
//        shops.add(new Shop(4, "DNS", "Электроника", 24));
//        shops.add(new Shop(5, "Спортмастер", "спорт товары", 17));
//
//        for (Shop shop : shops) {
//             shop.print();
//             System.out.println("-----------");
//         }

//        List<Employess> employesses = new ArrayList<>();
//        employesses.add(new Employess(1, "Клименко Олег", 10, true, "vapedon"));
//        employesses.add(new Employess(1337, "Костин Даниил", 55, true, "DNS"));
//        employesses.add(new Employess(3, "Юрасов Никита", 3, true, "KFC"));
//        employesses.add(new Employess(4, "Тен Аня", 14, false, "Спортмастер"));
//        employesses.add(new Employess(5, "Лозовой Александр", 99, true, "Спортмастер"));
//
//        for (Employess Employess : employesses) {
//            Employess.print();
//             System.out.println("-----------");
//         }
//    Toilet x = new Toilet("Золотой Бабилон", "ул. Малиновского 225", 5, ShoppingMall.isIsCinema(), 5, true, 3, true);
//    System.out.println(x.toString());
//    x.display();
//      Parking x = new Parking("Золотой Бабилон", "ул. Малиновского 225", 5, ShoppingMall.isIsCinema(), 120, true, 23);
//      System.out.println(x.toString());
//      x.display();
//        Event x = new Event("Золотой Бабилон", "ул. Малиновского 225", 5, ShoppingMall.isIsCinema(), "Вечерника", "День рождения ТЦ, всем по пиву", "24.11 22:00");
//        System.out.println(x.toString());
//        x.display();
    }
}

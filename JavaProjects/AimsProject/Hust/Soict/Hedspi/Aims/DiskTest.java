import Disc.*;
import Order.Order;
import Utils.MyDate;
import java.util.*;

public class DiskTest {
    public static void main(String[] args) {
        Order order = new Order();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("One Piece - Vua Hải Tặc", "Anime", "Cook Justin",90, 20f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Shingeki no Kyojin: The Final Season", "Anime", "Shishido Jun, Hayashi Yuuichirou",60, 20f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Jujutsu Kaisen", "Anime", "Park Seong-Hu", 70,20f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Boku no Hero Academia 5th Season", "Anime", " Nagasaki Kenji, Mukai Masahiro",80, 20f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Horimiya", "Anime", " Ishihama Masashi",50, 20f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Yakusoku no Neverland 2nd Season", "Anime", "Yamashita Hiroyuki",50, 20f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Naruto: Tòa tháp bị mất", "Anime", "Yamashita Hiroyuki",50, 20f);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("Naruto - Sức Mạnh Vĩ Thú", "Anime", "Yamashita Hiroyuki",50, 20f);
        DigitalVideoDisc dvd9 = new DigitalVideoDisc("Hunter X Hunter", "Anime", "Nakatani Toshio",50, 20f);
        DigitalVideoDisc dvd10 = new DigitalVideoDisc("Naruto Shippuuden", "Anime", "Yamashita Hiroyuki",50, 20f);
        DigitalVideoDisc dvd11 = new DigitalVideoDisc("Soul Worker: Your Destiny Awaits", "Anime", "Hamasaki Hiroshi, Takeuchi Hiroshi",50, 20f);

        DigitalVideoDisc[] disc = {dvd4, dvd5, dvd6,dvd7,dvd8,dvd9,dvd10};
        order.addDigitalVideoDisc(dvd1);
        order.addDigitalVideoDisc(dvd2, dvd3);
        order.addDigitalVideoDisc(disc);
       
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        int select;
        String searchn;
        do {
            System.out.println("1. Show order list."); 
            System.out.println("2. Search dvd by title."); 
            System.out.println("3. Lucky Item."); 
            System.out.println("4. Total Cost."); 
            System.out.println("5. Exit."); 
            System.out.print("You choose: "); 
            select=sc.nextInt();
            sc.nextLine();
            switch(select) {
                case 1:
                    order.show();
                    break;
                case 2:
                    
                    DigitalVideoDisc itemsOrdered[] = order.getdvdList();
                    int count = 0;
                    System.out.print("Type title to search: ");
                    searchn=sc.nextLine();
                    System.out.println("DVDs with  " + searchn + " : ");
                    for(int i = 0; i < itemsOrdered.length ; i++){
                        if(itemsOrdered[i].search(searchn) == true){
                            System.out.println(itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + " - " + itemsOrdered[i].getCost());
                            count++;
                        }
                    }
                    if(count == 0) System.out.println("No DVD has " + searchn);
                    break;
                case 3:
                    System.out.println("The lucky item : ");
                    order.getRandom();
                    System.out.println(order.getALuckyItem().getTitle() + " - " + order.getALuckyItem().getCategory() + " - " + order.getALuckyItem().getDirector() + " - " + order.getALuckyItem().getLength() + " - " + order.getALuckyItem().getCost());
                    break;
                case 4:
                    System.out.println("Total Cost: " + order.totalCost()); 
                    break;
                case 5:
                    System.out.println("Goodbye ^.^");
                    check = false;
                    break;
                default:
                    System.out.println("Wrong number, Try again !");
                    break;
            }
        } while(check);
    }
}
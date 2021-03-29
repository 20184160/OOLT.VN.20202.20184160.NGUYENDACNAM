import Disc.*;
import Order.Order;
import Utils.MyDate;

import java.util.*;


public class Aims {
    public static void main(String[] args)  {
        
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

        DigitalVideoDisc[] discs1 = {dvd7, dvd8, dvd9};
        DigitalVideoDisc[] discs2 = {dvd10, dvd11};
        Order order = new Order();
        order.addDigitalVideoDisc(dvd1);
        order.addDigitalVideoDisc(dvd2, dvd3);
        order.addDigitalVideoDisc(dvd4, dvd5);
        order.addDigitalVideoDisc(dvd6);
        order.addDigitalVideoDisc(discs1);
        order.addDigitalVideoDisc(discs2); 

        MyDate date = new MyDate("hai chin", "chin", "2020");

        Scanner sc = new Scanner(System.in);
        int select;
        int checkshow = 0;
        boolean stopvar = true;
        do{
            System.out.println("************* Menu Options ****************");
            date.print();
            System.out.println("*******************************************");
            System.out.println("1.Show Order ");
            System.out.println("2.Remove a DVD in Order");
            System.out.println("3.Total Cost");
            System.out.println("4.Exit");
            System.out.println("You choose : ");
            select=sc.nextInt();
            switch(select){
                case 1:
                order.show();
                checkshow++;
                break;
                case 2:
                if(checkshow == 0){
                    order.show();
                }
                System.out.println("Which DVD do you want to remove ?? Show the ID !");
                int rmvid = sc.nextInt();
                if(rmvid > 0 && rmvid <=10){
                    DigitalVideoDisc itemsOrdered[] = order.getdvdList();
                    order.removeDigitalvideoDisc(itemsOrdered[rmvid-1]);
                }else{
                    System.out.println("Id has to be from 1 to 10 !");
                }
                break;
                case 3:
                System.out.println("Your total cost is : "+ order.totalCost()+"$");
                break;
                case 4:
                System.out.println("Goodbye ^.^");
                stopvar = false;
                break;
                default:
                System.out.println("Wrong number ! Try again !");
                break;
            }
        }while(stopvar);
    
    }
}

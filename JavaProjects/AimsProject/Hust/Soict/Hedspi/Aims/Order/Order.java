package Order;
import Disc.*;
import java.lang.Math;

public class Order {
    public static final int MAXIMUM_IN_ORDER = 10;
    public static final int MAXIMUM_ORDERS = 5;
    public static int nbOrder;
    int dem = 0;
    int rand = 10;


    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAXIMUM_IN_ORDER];
    
    public DigitalVideoDisc[] getdvdList() {
        return itemsOrdered;
    }

    public Order(){
        nbOrder++;
    }
    
    public void alertOrder() {
        dem++;
        if(dem<MAXIMUM_IN_ORDER - 1){
            System.out.println("Added to Order !");
        }
        if(dem==MAXIMUM_IN_ORDER-1){
            System.out.println("Added to Order, Order is about to be full !");
        }
        if(dem==MAXIMUM_IN_ORDER){
            System.out.println("Added to Order, Order is full ! ");
        }
        if(dem>MAXIMUM_IN_ORDER){
            System.out.println(" Can't add to Order! Order was full !");
        }

    }

    public void addDigitalVideoDisc(DigitalVideoDisc Disc) {
        if(nbOrder<=MAXIMUM_ORDERS){
            if(dem <MAXIMUM_IN_ORDER){
                itemsOrdered[dem] = Disc;
                alertOrder();
            }else{
                alertOrder();
                dem--;
            }
        }
        else{
            System.out.println("Number of Orders is over the permission !");

        }
        
    }
    public void addDigitalVideoDisc(DigitalVideoDisc Disc1,DigitalVideoDisc Disc2) {
        if(nbOrder<=MAXIMUM_ORDERS){
            if(dem<MAXIMUM_IN_ORDER){
                itemsOrdered[dem] = Disc1;
                alertOrder();
            }else{
                alertOrder();
                dem--;
            }
            if(dem<=MAXIMUM_IN_ORDER){
                itemsOrdered[dem]=Disc2;
                alertOrder();
            }else{
                alertOrder();
                dem--;
            }
        } else{System.out.println("Number of Orders is over the permission !");}
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        if(nbOrder<=MAXIMUM_ORDERS){
            for(int i=0;i<dvdList.length;i++){
                if(dem<MAXIMUM_IN_ORDER){
                    itemsOrdered[dem]=dvdList[i];
                    System.out.println(  "DVD  added !");
                    dem++;
                }else{
                    alertOrder();
                    dem--;
                }
            }
        }else{
            System.out.println("Number of Orders is over the permission !");
        }
    }

    public void show() {
        for(int i =0;i<dem;i++){
            System.out.println(" ID " + (i+1)+":");
            System.out.println("Title : "+ itemsOrdered[i].getTitle());
            System.out.println("Category : "+itemsOrdered[i].getCategory());
            System.out.println("Director : "+itemsOrdered[i].getDirector());
            System.out.println("Duration : "+itemsOrdered[i].getLength()+" mins");
            System.out.println("Cost : "+itemsOrdered[i].getCost()+" $");
            System.out.println("*******************************************************");
        }
    }
    public float totalCost() {
        float total = 0;
        for(int i=0;i<dem;i++){
            total+=itemsOrdered[i].getCost();
        }
        if(rand!=10){
            total=total-getALuckyItem().getCost();
        }
        return total;
    }
    public void removeDigitalvideoDisc(DigitalVideoDisc disc) {
        for(int i=0;i<dem;i++){
            if(itemsOrdered[i]==disc){
                for(int j=i;j<dem-1;j++){
                    itemsOrdered[j]=itemsOrdered[j+1];
                }
                dem--;
                System.out.println("DVD has been removed !");
            }
        }
    }
    public DigitalVideoDisc getALuckyItem(){
        return itemsOrdered[rand];
    }
    public int getRandom(){
        int range = 10;
        rand = (int)(Math.random() * range) ;
        return rand;
    }




}

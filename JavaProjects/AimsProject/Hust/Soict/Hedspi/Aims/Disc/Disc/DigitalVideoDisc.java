package Disc;

public class DigitalVideoDisc{
    public String  title;
    private String  category;
    private String  director;
    private int     length;
    private float   cost;

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory(){
        return  category;
    }
    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public DigitalVideoDisc(String title,String category,String director,int length,float cost ){
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    public DigitalVideoDisc(String title,String category,String director,float cost){
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    } 
    public DigitalVideoDisc(String title,String category,float cost){
        this.title = title;
        this.category = category;
        this.cost = cost;
    } 
    public DigitalVideoDisc(String title,float cost){
        this.title = title;
        this.cost = cost;
    } 
    public DigitalVideoDisc(String title){
        this.title = title;
    } 
    public boolean search(String title){
        int count=0;
        String[] s1 = getTitle().split("\\s");
        String[] s2 = title.split("\\s");
        for(int i =0;i<s2.length;i++){
            for(int j=0;j<s1.length;j++){
                if(s1[j].equalsIgnoreCase(s2[i])){
                    count++;
                }
            }
        }
        if(count==s2.length){
            return true;
        }
        else return false;
    }
}
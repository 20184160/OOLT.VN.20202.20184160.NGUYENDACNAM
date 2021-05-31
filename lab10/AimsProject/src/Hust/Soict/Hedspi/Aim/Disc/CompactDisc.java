package Disc;
import java.util.ArrayList;

public class CompactDisc extends Disc implements playable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public int getLength(ArrayList<Track> tracks){
        int sumlength = 0;
        for(int i = 0 ; i < tracks.size() ; i++){
            sumlength += tracks.get(i).getLength();
        }
        super.length = sumlength;
        return super.length;
    }

    public void addTrack(Track track){
        if(tracks.contains(track)){
            System.out.println("Already exist");
        }
        else tracks.add(track);
    }

    public void removeTrack(Track track){
        if(tracks.contains(track)){
            tracks.remove(track);
        } else System.out.println("Does not exist");
    }

    public CompactDisc(){}

    public CompactDisc(String director, int length, String artist) {
        super.director = director;
        super.length = length;
        this.artist = artist;
    }

    public CompactDisc(int id, String title, String category, float cost) {
        super.id = id;
        super.title = title;
        super.category = category;
        super.cost = cost;
    }

    public CompactDisc(int id, String title, String category, float cost, String director, String artist) {
        super.id = id;
        super.title = title;
        super.category = category;
        super.cost = cost;
        super.director = director;
        this.artist = artist;
    }

    public CompactDisc(int id, String title, String category, float cost, String director, String artist,ArrayList<Track> tracks) {
        super.id = id;
        super.title = title;
        super.category = category;
        super.cost = cost;
        super.director = director;
        this.artist = artist;
        this.tracks = tracks;
    }

    @Override
    public void play() throws PlayerException{
        if(this.getLength() > 0) {
            java.util.Iterator iter = tracks.iterator();
            Track nextTrack;
            while(iter.hasNext()) {
                nextTrack = (Track) iter.next();
                try {
                    nextTrack.play();
                }catch(PlayerException e) {
                    System.out.println(e.getMessage());
                }
            }
        }else {
            throw new PlayerException("ERROR: CD length is non-positive!");
            }
    }

    @Override
    public String showInfo() {
        return "CD.ID: " + getId() + "- Title: " + getTitle() + ", Category: " + getCategory() + ", Director: " + getDirector() + ", Length: " + getLength() + ", Price: "+ getCost() + ", Artist: " + getArtist();
    }

}

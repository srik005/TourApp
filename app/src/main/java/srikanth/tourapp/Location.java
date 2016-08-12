package srikanth.tourapp;



public class Location {
    private  String location;
    private int img;

    public Location(String location, int img) {
        this.location = location;
        this.img = img;
    }
    public String getLocation(){
        return location;
    }

    public int getImg() {
        return img;
    }
}

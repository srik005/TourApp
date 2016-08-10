package srikanth.tourapp;



public class LocList {
    private  String location;
    private int img;

    public LocList(String location, int img) {
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

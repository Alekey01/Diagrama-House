public class BedRoom {

    private BedSize bedsize;
    private boolean tv;
    private int width;
    private int height;
    private String color;

    public BedRoom(){
    }

    public BedSize getBedsize() {
        return bedsize;
    }

    public void setBedsize(BedSize bedsize) {
        this.bedsize = bedsize;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

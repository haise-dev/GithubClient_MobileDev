package vn.edu.usth.mobilemid;

public class Item {
    private String title;
    private int iconResId;

    public Item(String title, int iconResId) {
        this.title = title;
        this.iconResId = iconResId;
    }

    public String getTitle() {
        return title;
    }

    public int getIconResId() {
        return iconResId;
    }
}

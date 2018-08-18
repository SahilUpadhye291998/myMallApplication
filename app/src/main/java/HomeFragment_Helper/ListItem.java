package HomeFragment_Helper;

public class ListItem {

    public ListItem(String head, String desc, String imageURL) {
        this.head = head;
        this.desc = desc;
        this.imageURL = imageURL;
    }

    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }

    public String getImageURL() {
        return imageURL;
    }

    private String head;
    private String desc;
    private String imageURL;
}

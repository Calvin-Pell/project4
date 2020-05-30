package mod;

public class Picture {
    //INSTANCE VARIABLES
    private String image;
    private String face;
    private String hairColor;
    private String clothes;

    //GETTERS
    public String getClothes() { return clothes; }
    public String getHairColor() { return hairColor; }
    public String getImage() { return image; }
    public String getFace() { return face; }
    public String getName() { return image.substring(0, image.length() - 4); }

    //CONSTRUCTOR
    public Picture (String imageName, String face, String hairColor, String clothes) {
        image = imageName;
        this.face = face;
        this.hairColor = hairColor;
        this.clothes = clothes;
    }

    /*
     *Replaces the picture with the eliminated version of that picture.
     */
    public void eliminate() {
        if(image.indexOf("Eliminated") < 0) {
            int end = image.indexOf(".jpg");
            image = image.substring(0, end) + "Eliminated.jpg";
        }
    }

}

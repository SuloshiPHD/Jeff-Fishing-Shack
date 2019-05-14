package screensframework;



public class Product {

    private String pCode;
    private String PName;
    private String pSize;
    private  int pUnitPrice;


    public Product(String pCode, String PName, String pSize, int pUnitPrice) {
        this.pCode = pCode;
        this.PName = PName;
        this.pSize = pSize;
        this.pUnitPrice = pUnitPrice;
    }


    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

    public String getpSize() {
        return pSize;
    }

    public void setpSize(String pSize) {
        this.pSize = pSize;
    }

    public int getpUnitPrice() {
        return pUnitPrice;
    }

    public void setpUnitPrice(int pUnitPrice) {
        this.pUnitPrice = pUnitPrice;
    }

}


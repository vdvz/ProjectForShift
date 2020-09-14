public abstract class Product {

    enum TYPE{
        LAPTOP,
        PC,
        HDD,
        MONITOR
    }
    protected TYPE type;
    private int Series;
    private float Price;
    private String Manufacturer;
    private int Quantity;

    public int getSeries(){
        return Series;
    }
    public float getPrice(){
        return Price;
    }
    public String getManufacturer(){
        return Manufacturer;
    }
    public int getQuantity(){
        return Quantity;
    }
    public void setSeries(int _series){
        Series = _series;
    }
    public void setPrice(float _price){
        Price = _price;
    }
    public void setManufacturer(String _manufacturer){
        Manufacturer = _manufacturer;
    }
    public void setQuantity(int _quantity){
        Quantity = _quantity;
    }

    Product(int _series, float _price, String _manufacturer, int _quantity){
        Series = _series;
        Price = _price;
        Manufacturer = _manufacturer;
        Quantity = _quantity;
    }

    Product(){
        Series = -1;
        Price = -1f;
        Manufacturer = "";
        Quantity = -1;
    }

    abstract String ToAddingSql();

}

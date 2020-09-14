public class HDD extends Product {

    private int capacity;
    HDD(){
        super();
        capacity = -1;
    }

    HDD(int _series, float _price, String _manufacturer, int _quantity, int _capacity){
        super(_series, _price, _manufacturer, _quantity);
        type = TYPE.HDD;
        capacity = _capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    String ToAddingSql() {
        return null;
    }

}

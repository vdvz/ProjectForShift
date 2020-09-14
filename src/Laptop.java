public class Laptop extends Product {

    private int LaptopSize;

    Laptop(){
        super();
        LaptopSize = -1;
    }

    Laptop(int _series, float _price, String _manufacturer, int _quantity, int _laptop_size) throws WrongArgumentException {
        super(_series, _price, _manufacturer, _quantity);
        type = TYPE.LAPTOP;
        if(_laptop_size!=13 && _laptop_size!=14 &&_laptop_size!=15 && _laptop_size!=17 ){
            throw new WrongArgumentException();
        }
        LaptopSize = _laptop_size;
    }

    public int getLaptopSize() {
        return LaptopSize;
    }

    public void setLaptopSize(int laptopSize) throws WrongArgumentException {
        if(laptopSize!=13 && laptopSize!=14 && laptopSize!=15 && laptopSize!=17 ){
            throw new WrongArgumentException();
        }
        LaptopSize = laptopSize;
    }

    @Override
    String ToAddingSql() {
        return null;
    }
}

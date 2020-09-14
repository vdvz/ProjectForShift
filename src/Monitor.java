public class Monitor extends Product{

    private int diagonal;

    Monitor(){
        super();
        diagonal = -1;
    }

    Monitor(int _series, float _price, String _manufacturer, int _quantity, int _diagonal) throws WrongArgumentException {
        super(_series, _price, _manufacturer, _quantity);
        type = TYPE.MONITOR;
        diagonal = _diagonal;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    String ToAddingSql() {
        return null;
    }
}

public class PC extends Product{

    enum FORM_FACTOR{
        DESKTOP,
        NETTOP,
        MONOBLOCK,
        NONE
    }

    private FORM_FACTOR FormFactor;

    PC(){
        super();
        FormFactor = FORM_FACTOR.NONE;
    }

    PC(int _series, float _price, String _manufacturer, int _quantity, FORM_FACTOR _formFactor){
        super(_series, _price, _manufacturer, _quantity);
        type = TYPE.PC;
        FormFactor = _formFactor;
    }

    public FORM_FACTOR getFormFactor() {
        return FormFactor;
    }

    public void setFormFactor(FORM_FACTOR formFactor) {
        FormFactor = formFactor;
    }


    @Override
    String ToAddingSql() {
        return null;
    }

}

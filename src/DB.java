import java.util.List;
import java.sql.*;

public class DB implements IDB {

    private static final String PRODUCT_DB_URL = ""; //TODO:!
    private static final String USER = "vadim";
    private static final String PW = "vizir";
    Connection ProductDB;

    DB(){
        try {
            ProductDB = DriverManager.getConnection(PRODUCT_DB_URL, USER, PW);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void AddProduct(Product _product){

    }

    @Override
    public void EditProduct(int id, Product _product) throws WrongArgumentException {
        Product changingProduct = GetById(id);

        String manufacturer = _product.getManufacturer();
        if(!manufacturer.equals("")){
            changingProduct.setManufacturer(manufacturer);
        }

        float price = _product.getPrice();
        if( price != -1f){
            changingProduct.setPrice(price);
        }

        int series = _product.getSeries();
        if( series != -1){
            changingProduct.setSeries(series);
        }

        int quantity = _product.getQuantity();
        if( quantity != -1){
            changingProduct.setQuantity(quantity);
        }

        switch (_product.type){
            case PC -> {
                PC pc = (PC)_product;
                PC.FORM_FACTOR form_factor = pc.getFormFactor();
                if(form_factor!= PC.FORM_FACTOR.NONE){
                    PC changing = (PC) changingProduct;
                    changing.setFormFactor(form_factor);
                }
            }
            case LAPTOP -> {
                Laptop laptop = (Laptop) _product;
                int laptopSize = laptop.getLaptopSize();
                if(laptopSize!=-1){
                    Laptop changing = (Laptop) changingProduct;
                    changing.setLaptopSize(laptopSize);
                }
            }
            case MONITOR -> {
                Monitor monitor = (Monitor) _product;
                int diagonal = monitor.getDiagonal();
                if(diagonal!=-1){
                    Monitor changing = (Monitor) changingProduct;
                    changing.setDiagonal(diagonal);
                }
            }
            case HDD -> {
                HDD hdd = (HDD) _product;
                int capacity = hdd.getCapacity();
                if(capacity!=-1){
                    HDD changing = (HDD) changingProduct;
                    changing.setCapacity(capacity);
                }
            }
        }

    }

    @Override
    public List<Product> FindAllByType(Product.TYPE type){
        return null;
    }

    @Override
    public Product GetById(int id){
        return null;
    }

    private String AskDB(String sql){
        return null;
    }

}

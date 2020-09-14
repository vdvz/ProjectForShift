import java.util.List;

public interface IDB {

    void AddProduct(Product product);

    void EditProduct(int id, Product product) throws WrongArgumentException;

    List<Product> FindAllByType(Product.TYPE type);

    Product GetById(int id);
}

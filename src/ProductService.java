import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();
// Logic to add product to the List
    public void addProduct(Product p){
        products.add(p);
    }
// Logic to get all the product from the list
    public List<Product> getProducts() {
        return products;
    }
    // Logic to get product by name from the list
  public Product getProduct(String arg){
      for (Product p: getProducts()) {
          if (p.getName().equals(arg)){
              return p;
          }
      }
      return null;
  }
    // Logic to get product by type from the list
  public void getProductByType(String arg){
        List<Product> list = new ArrayList<>();
      for (Product p: getProducts()) {
          if (p.getType().equals(arg)){
              System.out.println(p);
          }
      }
  }
    // Logic to get product with specific text from the list
  public void getProductByText(String txt){
      for (Product p: products) {
          if (p.getName().contains(txt) ||p.getType().contains(txt)|| p.getPlace().contains(txt)) {
              System.out.println(p);
          }
      }
  }


}

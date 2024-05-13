import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDB {

    Connection conn = null;

    public ProductDB() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/products","root","12345678");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void save(Product p){
        String query = "insert into product (name,type,place,warranty) values (?,?,?,?)";
        try {
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1,p.getName());
            st.setString(2,p.getType());
            st.setString(3,p.getPlace());
            st.setInt(4,p.getWarranty());
            st.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public List<Product> getAll() {
        List<Product> list = new ArrayList<>();
        String query = "select name,type,place,warranty from product";
        try {
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Product product = new Product();
                product.setName(rs.getString(1));
                product.setType(rs.getString(2));
                product.setPlace(rs.getString(3));
                product.setWarranty(rs.getInt(4));
                list.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;

    }
}

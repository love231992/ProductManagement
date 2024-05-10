public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();

//        Adding the products
        service.addProduct(new Product("Macbook","Laptop","Table",2022));
        service.addProduct(new Product("HP Envy","Laptop","Bag",2024));
        service.addProduct(new Product("Iphone","Smartphone","Bed",2023));
        service.addProduct(new Product("Airpods","Earphone","Table",2024));
        service.addProduct(new Product("Timberland","Shoes","Shoe Rack",2024));
        service.addProduct(new Product("Ipad","Tablet","Drawer",2022));
        service.addProduct(new Product("ABC","Heater","Chest",2023));
//      Getting the Products on the console
        for (Product p: service.getProducts()) {
            System.out.println(p);
        }

        System.out.println(service.getProduct("Macbook"));  // Get product by Name
        service.getProductByType("Laptop"); //Get product by Type
        service.getProductByText("Table");  // Get product by text
    }
}

package datatypes;

public class WrapperObjectDataTypes {
    Integer productID;
    String productName;
    Double productPrice;
    Double productRating;
    Boolean productAvailable;
    Integer stockQuantity;
    Double discountRate;
    public static void main(String[] args) {
        WrapperObjectDataTypes wrapperObjectDataTypes = new WrapperObjectDataTypes();
        wrapperObjectDataTypes.productID = 1;
        wrapperObjectDataTypes.productName = "Samsung";
        wrapperObjectDataTypes.productPrice = 29999.0;
        wrapperObjectDataTypes.productRating = 4.5;
        wrapperObjectDataTypes.productAvailable = true;
        wrapperObjectDataTypes.stockQuantity = 2000;
        wrapperObjectDataTypes.discountRate = 15.0;
        System.out.println("Product ID: " + wrapperObjectDataTypes.productID);
        System.out.println("Product Name: " + wrapperObjectDataTypes.productName);
        System.out.println("Product Price: " + wrapperObjectDataTypes.productPrice);
        System.out.println("Product Rating: " + wrapperObjectDataTypes.productRating);
        System.out.println("Product Available: " + wrapperObjectDataTypes.productAvailable);
        System.out.println("Stock Quantity: " + wrapperObjectDataTypes.stockQuantity);
        System.out.println("Discount Rate: " + wrapperObjectDataTypes.discountRate);
    }
}

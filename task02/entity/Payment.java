package by.epam.task02.entity;

public class Payment{
    private String type_Of_payment;
    Product product;
    
     public Payment(){
        
    }

    public Payment(String type_Of_payment){
        this.type_Of_payment = type_Of_payment;

    }

    public String getType_Of_payment(){
        return type_Of_payment;
    }

    public void setType_Of_payment(String type_Of_payment){
        this.type_Of_payment = type_Of_payment;
    }

    public void setProduct(Product product){
        this.product = product;
    }

    public Product getProduct(){
        return product;

    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Payment)) return false;

        Payment payment = (Payment)o;

        if(getType_Of_payment() != null ? !getType_Of_payment().equals(payment.getType_Of_payment()) : payment.getType_Of_payment() != null)
            return false;
        return getProduct() != null ? getProduct().equals(payment.getProduct()) : payment.getProduct() == null;
    }

    @Override
    public String toString(){
        return "Payment{" +
                "type_Of_payment='" + type_Of_payment + '\'' +
                '}';
    }

    @Override
    public int hashCode(){
        int result = getType_Of_payment() != null ? getType_Of_payment().hashCode() : 0;
        result = 31 * result + (getProduct() != null ? getProduct().hashCode() : 0);
        return result;
    }

    public static class Product{
        String productName;
        String manufacturer;
        double price;
        
        public Product(){
            
        }

        public Product(String productName, String manufacturer, double price){
            this.productName = productName;
            this.manufacturer = manufacturer;
            this.price = price;
        }

        public String getProductName(){
            return productName;
        }

        public void setProductName(String productName){
            this.productName = productName;
        }

        public String getManufacturer(){
            return manufacturer;
        }

        public void setManufacturer(String manufacturer){
            this.manufacturer = manufacturer;
        }

        public double getPrice(){
            return price;
        }

        public void setPrice(double price){
            this.price = price;

        }

        @Override
        public boolean equals(Object o){
            if(this == o) return true;
            if(!(o instanceof Product)) return false;
            Product product = (Product)o;
            if(Double.compare(product.getPrice(), getPrice()) != 0) return false;
            if(getProductName() != null ? !getProductName().equals(product.getProductName()) : product.getProductName() != null)
                return false;
            return getManufacturer() != null ? getManufacturer().equals(product.getManufacturer()) : product.getManufacturer() == null;
        }

        @Override
        public int hashCode(){
            int result;
            long temp;
            result = getProductName() != null ? getProductName().hashCode() : 0;
            result = 31 * result + (getManufacturer() != null ? getManufacturer().hashCode() : 0);
            temp = Double.doubleToLongBits(getPrice());
            result = 31 * result + (int)(temp ^ (temp >>> 32));
            return result;
        }

        @Override
        public String toString(){
            return "Product{" +
                    "productName='" + productName + '\'' +
                    ", manufacturer='" + manufacturer + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}

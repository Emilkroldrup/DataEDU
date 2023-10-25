package OOP;

public class Java_Classes {
    public static void main(String[] args) {
        Products v1 = new Products(1, "Product1", 10, 50.5);
        Products v2 = new Products(2, "Product2", 20, 60.5);
        Products v3 = new Products(3, "Product3", 30, 70.5);
        Products v4 = new Products(4, "Product4", 40, 80.5);
        Products v5 = new Products(5, "Product5", 50, 90.5);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
        System.out.println(" ");

        System.out.println("Before adding quantity: " + v1);
        v1.addQuantity(5);
        System.out.println("After adding quantity: " + v1);
        System.out.println(" ");

        System.out.println("Before removing quantity: " + v2);
        v2.removeQuantity(5);
        System.out.println("After removing quantity: " + v2);
        System.out.println(" ");

        System.out.println("Before changing price: " + v3);
        v3.newPrice(55.5);
        System.out.println("After changing price: " + v3);
        System.out.println(" ");

        System.out.println("Price for 5 units of v1: " + v1.price(5));
        System.out.println(" ");
        System.out.println("Discounted price for 25 units of v1: " + v1.discountPrice(25));
        System.out.println(" ");

        Products[] productTable = new Products[10];
        productTable[0] = v1;
        productTable[1] = v2;
        productTable[2] = v3;
        productTable[3] = v4;
        productTable[4] = v5;
        printProductTable(productTable);

    }
    public static class Products {
        private int productNr;
        private String productText;
        private int quantity;
        private double priceEach;

        // Constructor
        public Products(int productNr, String productText, int quantity, double priceEach) {
            this.productNr = productNr;
            this.productText = productText;
            this.quantity = quantity;
            this.priceEach = priceEach;
        }

        // Getters and Setters
        public int getProductNr() {
            return productNr;
        }

        public void setProductNr(int productNr) {
            this.productNr = productNr;
        }

        public String getProductText() {
            return productText;
        }

        public void setProductText(String productText) {
            this.productText = productText;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getPriceEach() {
            return priceEach;
        }

        public void setPriceEach(double priceEach) {
            this.priceEach = priceEach;
        }

        @Override
        public String toString() {
            return "Products [ProductNr=" + productNr + ", ProductText=" + productText + ", Quantity=" + quantity + ", PriceEach=" + priceEach + "]";
        }
        public void addQuantity(int amount) {
            this.quantity += amount;
        }
        public void removeQuantity(int amount) {
            this.quantity -= amount;
            if (this.quantity < 0) {
                this.quantity = 0; // Prevents negative quantity
            }
        }
        public void newPrice(double newPriceEach) {
            this.priceEach = newPriceEach;
        }
        public double price(int amount) {
            return this.priceEach * amount;
        }
        public double discountPrice(int amount) {
            double total = this.priceEach * amount;
            if (amount > 20) {
                total *= 0.85;  // Apply 15% discount
            }
            return total;
        }

    }

    public static void printProductTable(Products[] table) {
        for (Products product : table) {
            if (product != null) {
                System.out.println(product);
            }
        }
    }



















}

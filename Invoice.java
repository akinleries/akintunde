package ChapterFour;

public class Invoice {


        private double price;
        private String description;
        private int quantityOfItemPurchased;
        private String number;

        public Invoice(double price, String description, int quantityOfItemPurchased, String number){

            this.price = price;
            this.description = description;
            this.quantityOfItemPurchased = quantityOfItemPurchased;
            this.number = number;

        }


        public void setPrice(double price){
            if (price > 0)
            this.price = price;

        }
        public double getPrice(){

            return price;

        }
        public void description(String description){

            this.description = description;

        }

        public String getDescription(){

            return description;

        }

        public void setQuantityOfItemPurchased(int item){
            if (quantityOfItemPurchased > 0)
            quantityOfItemPurchased = item;

        }

        public int getQuantityOfItemPurchased(){

            return quantityOfItemPurchased;

        }

        public void setNumber(String number){

            this.number = number;

        }

        public String getNumber(){

            return number;

        }

        public double getInvoiceAmount(){
          double amount = getPrice() * getQuantityOfItemPurchased();

          return amount;


        }

    }


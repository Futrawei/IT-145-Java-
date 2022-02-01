public class ItemToPurchase {

    // Private variables
    private String itemName;
    private int itemPrice;
    private int itemQuantity;

    /**
     * The default constructor
     */
    public ItemToPurchase()
    {
        itemName     = "none";
        itemPrice    = 0;
        itemQuantity = 0;
    }


    public void setName(String nameOfItem)
    {
        itemName = nameOfItem;
    }

    public String getName()
    {
        return itemName;
    }

    public void setPrice(int priceOfItem)
    {
        itemPrice = priceOfItem;
    }

    public int getPrice()
    {
        return itemPrice;
    }

    public void setQuantity(int quantityOfItem)
    {
        itemQuantity = quantityOfItem;
    }

    public int getQuantity()
    {
        return itemQuantity;
    }

   
   public void printItemPurchase() {
      System.out.println(itemQuantity + " " + itemName + " $" + itemPrice +  
                         " = $" + (itemPrice * itemQuantity));
   }
}

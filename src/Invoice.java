
public class Invoice {
    private String invNumber;
    private Item[] itemList;
    private int itemCount;

    // constructor
    public Invoice(String invNumber, int itemNum) {
        // 1. Set instance variable invNumber
        this.invNumber = invNumber;
        // 2. Create an array of Item with number of elements specified by parameter itemNum
        itemList = new Item[itemNum];
        // 3. Set itemCount to 0, as there is no Item initially.
        itemCount = 0;
    }

    public String getInvNumber() {
        return invNumber;
    }

    //
    public Item[] getItemList() {
        return itemList;
    }

    public int getItemCount() {
        return itemCount;
    }

    public Item getItem(int index) {
        return itemList[index];
    }

    public void addItem(String productCode, double price, int quantity) {
        if (itemCount < itemList.length) {
            // create a new Item object
            Item item = new Item(productCode, price, quantity);
            // save item to appropriate element in itemList
            itemList[itemCount] = item;
            itemCount++;
        } else {
            System.out.println("Failed to add new item; max already");
        }
    }
}

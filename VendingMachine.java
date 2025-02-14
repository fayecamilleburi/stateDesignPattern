public class VendingMachine {
    private VendingMachineState idleState;
    private VendingMachineState itemSelectedState;
    private VendingMachineState dispensingState;
    private VendingMachineState outOfOrderState;

    private VendingMachineState currentState;
    private int balance;
    private int itemPrice;

    public VendingMachine(int itemPrice) {
        idleState = new IdleState();
        itemSelectedState = new ItemSelectedState();
        dispensingState = new DispensingState();
        outOfOrderState = new OutOfOrderState();

        currentState = idleState;
        this.itemPrice = itemPrice;
    }

    public void setState(VendingMachineState state) {
        currentState = state;
    }

    public void selectItem() {
        currentState.selectItem(this);
    }

    public void insertCoin(int amount) {
        currentState.insertCoin(this, amount);
    }

    public void dispenseItem() {
        currentState.dispenseItem(this);
    }

    public void setOutOfOrder() {
        currentState.setOutOfOrder(this);
    }

    public VendingMachineState getIdleState() {
        return idleState;
    }

    public VendingMachineState getItemSelectedState() {
        return itemSelectedState;
    }

    public VendingMachineState getDispensingState() {
        return dispensingState;
    }

    public VendingMachineState getOutOfOrderState() {
        return outOfOrderState;
    }

    public int getBalance() {
        return balance;
    }

    public void addBalance(int amount) {
        balance += amount;
    }

    public void deductBalance() {
        balance -= itemPrice;
    }

    public int getItemPrice() {
        return itemPrice;
    }
}

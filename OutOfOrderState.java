public class OutOfOrderState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vm) {
        System.out.println("Machine is out of order. Cannot select item.");
    }

    @Override
    public void insertCoin(VendingMachine vm, int amount) {
        System.out.println("Machine is out of order. Cannot insert coin.");
    }

    @Override
    public void dispenseItem(VendingMachine vm) {
        System.out.println("Machine is out of order. Cannot dispense item.");
    }

    @Override
    public void setOutOfOrder(VendingMachine vm) {
        System.out.println("Machine is already out of order.");
    }
}
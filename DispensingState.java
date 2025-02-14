public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vm) {
        System.out.println("Cannot select item while dispensing.");
    }

    @Override
    public void insertCoin(VendingMachine vm, int amount) {
        System.out.println("Cannot insert coin while dispensing.");
    }

    @Override
    public void dispenseItem(VendingMachine vm) {
        System.out.println("Dispensing item!");
    }

    @Override
    public void setOutOfOrder(VendingMachine vm) {
        System.out.println("Machine is now out of order.");
        vm.setState(vm.getOutOfOrderState());
    }
}
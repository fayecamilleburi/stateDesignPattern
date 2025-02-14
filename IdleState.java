public class IdleState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vm) {
        System.out.println("Item selected!");
        vm.setState(vm.getItemSelectedState());
    }

    @Override
    public void insertCoin(VendingMachine vm, int amount) {
        System.out.println("Cannot insert coin in Idle state.");
    }

    @Override
    public void dispenseItem(VendingMachine vm) {
        System.out.println("Cannot dispense item in Idle state.");
    }

    @Override
    public void setOutOfOrder(VendingMachine vm) {
        System.out.println("Machine is now out of order.");
        vm.setState(vm.getOutOfOrderState());
    }
}
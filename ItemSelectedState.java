public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vm) {
        System.out.println("Item selection is not allowed after selecting an item.");
    }

    @Override
    public void insertCoin(VendingMachine vm, int amount) {
        System.out.println("Coin inserted! Ready to dispense.");
        vm.addBalance(amount);
    }

    @Override
    public void dispenseItem(VendingMachine vm) {
        if (vm.getBalance() >= vm.getItemPrice()) {
            System.out.println("Item dispensed.");
            vm.setState(vm.getDispensingState());
            vm.deductBalance();
        } else {
            System.out.println("Insuffiecient balance! Please insert more coins.");
        }

    }

    @Override
    public void setOutOfOrder(VendingMachine vm) {
        System.out.println("Machine is now out of order.");
        vm.setState(vm.getOutOfOrderState());
    }
}
public class VendingMachineDemo {
    
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine(100);

        vm.selectItem();
        vm.insertCoin(50);
        vm.insertCoin(50);
        vm.dispenseItem();
        vm.setOutOfOrder();
    }
}
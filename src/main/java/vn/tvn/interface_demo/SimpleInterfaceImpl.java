package vn.tvn.interface_demo;

public class SimpleInterfaceImpl implements SimpleInterface{
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}

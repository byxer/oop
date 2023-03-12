package homework.hw2;

public class Human extends Buyer{
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setMakeOrder() {
        super.isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        super.isTakeOrder = true;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
}
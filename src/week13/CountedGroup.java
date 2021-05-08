package week13;

public class CountedGroup extends Group {
    private int count =0;
    @Override
    public void add() {
        count++;
        super.add();
    }
    @Override
    public void addAll(int amount) {
        this.count += amount;
        super.addAll(amount);
    }
    
    public void printCount() {
        System.out.println(count);
    }
}

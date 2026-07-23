package FinalTest_Book;

public class Test{
    public static void main(String[] args){
    Book book=new Book("987654321","Java");
    book.setPreviousPrice(65.50);
    book.setCurrentPrice(75.60);
    double percent=book.getChangePercent();
    System.out.println("ISBN是："+65.50);
    System.out.println("Java程序设计:"+75.60);
    System.out.printf("价格比变化百分比：%.2f%%",percent);



    }
}
class Book{
    private String symbol;
    private String name;
    private double previousPrice;
    private double currentPrice;
    public Book(String symbol,String name){
        this.symbol=symbol;
        this.name=name;
    }
    public void  setPreviousPrice( double previousPrice){
        this.previousPrice=previousPrice;
    }
    public void setCurrentPrice(double currentPrice){
        this.currentPrice=currentPrice;
    }
    public double getChangePercent(){
        return (currentPrice-previousPrice)/previousPrice*100;
    }

}
package XiangyuanMode;


import java.util.Random;

public class TrainTicket implements Ticket {
    public String from;//出发地
    public String to;//目的地
    public String bunk;//铺位
    public int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public void showTicketInfo(String bunk) {
        price=new Random().nextInt(300);
        System.out.println("购买 从"+from+"到"+to+"的"+bunk+"火车票，价格:"+price);
    }
}

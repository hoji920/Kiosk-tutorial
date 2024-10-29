import java.util.Scanner;

public class KioskProgram {
    private Integer menuNumber;
    private Integer amount;
    private Integer totalPrice;
    private Integer[] foorpPrice ={1000,1500,1000,2000};


    Scanner sc = new Scanner(System.in);

    public void intput_print(){
        System.out.println("[안내] 김천국밥에 오신걸 환영합니다.");
        System.out.println("---------------------");
        while(true) {
            System.out.println("[안내] 원하시는 메뉴의 번호를 입력하여 주세요.");
            System.out.println("1) 김밥(1000) 2) 참치김밥(1500) 3) 충무김밥(1000) 4) 김밥(2000) ");

            menuNumber = sc.nextInt();
            if(menuNumber<1 || menuNumber>4){
                System.out.println("메뉴에 포함된 번호를 입력하여 주세요");
            }else{
                break;
            }
        }

    }

    public void count(){
        System.out.println("[안내] 선택하신 메뉴의 수량을 입력하여 주세요.");
        System.out.println("(# 최대 주문 가능 수량 : 99)");
        amount = sc.nextInt();
        while(true){
            if(amount>100){
                System.out.println(amount + "개는 입력할 수 없습니다");
                System.out.println("수량 선택 화면으로 돌아갑니다");
            }else{
                break;
            }
        }

    }
    public void cost(){
        totalPrice = foorpPrice[menuNumber -1] * amount;
        //return totalPrice;
    }
    public void output_print( ){
        System.out.println("[안내]주문하신 메뉴의 총 금액은"+totalPrice+"원 입니다");
        System.out.println("[안내]이용해주셔서 감사합니다");
    }

}

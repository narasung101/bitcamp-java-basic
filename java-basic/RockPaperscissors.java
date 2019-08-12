import java.util.Scanner;
class RockPaperscissors{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("가위바위보 게임");
        System.out.println("1. 가위 2. 바위 3. 보");
        // 컴퓨터가 바위를 냈어요.
        int op = 0;
        op = scanner.nextInt();
        if(op==1){
            System.out.println("컴퓨터 승");
            if(op==2){
                System.out.println("컴퓨터 무승부");
                if(op==3){
                    System.out.println("컴퓨터 패배");
                }                
            }
        }        
    
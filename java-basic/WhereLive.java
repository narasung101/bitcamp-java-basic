import java.util.Scanner;
class WhereLive{
    public static void main(String[] args){
        System.out.println("어디에 사세요?");
        String live = "";
        Scanner scanner = new Scanner(System.in);
        live = scanner.next();
        System.out.println(String.format("저는 %s에 삽니다", live));
        
    }
}

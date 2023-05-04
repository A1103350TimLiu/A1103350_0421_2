import java.util.*;

public class A1103350_0421_2{
    public static void main(String[] argv) throws Exception{
        Scanner Date = new Scanner(System.in);
        System.out.println("請輸入日期:\n範例(YYYY/MM/DD or DD/MM/YYYY)");
        String date = Date.next();
        if(date.matches("[0-9]{4}/[0-1]{1}[0-9]{1}/[0-3]{1}[0-9]{1}")) {
            System.out.println(date);
        }else if(date.matches("[1-31]{1}/[1-12]{1}/[0-9]{4}")){
            System.out.println(date);
        }else{
            System.out.println("輸入錯誤");
        }


    }
}
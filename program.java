public class Program {
   	private int age;
  	private String sex;
public static String moneyPay(int age){
        if(age < 0){
            return "INPUT_KHONG_HOP_LE";
        }
        if(age < 5){
            return "MIEN_PHI_VE";
        }
        else if(age < 65){
            return "20$/VE";
        }
        else {
            return "10$/VE";
        }
   	   }
public static String hatGive(String sex) {
        if (sex.equals("Female")) {
            return "TANG_MU_HONG";
        } else {
            return "TANG_MU_XANH";
        }
    	}

public static String result(int age, String age){
        if (manyPay(age).equals("INPUT_KHONG_HOP_LE")) {
            return "INPUT_KHONG_HOP_LE";
        } else {
            return manyPay(age) + "&" + hatGive(sex);
        }
   	 }
}

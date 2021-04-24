package Bank;


public class bankTest {
    public static void main(String[] args) {
        bankTest bankTest = new bankTest();
        System.out.println(bankTest.getSumSubStr("1", "99").toString());
    }
    public String getSumSubStr(String s1,String s2){
        if (s1==null) return s2;
        if (s2==null) return s1;
        int res=Integer.valueOf(s1)+Integer.valueOf(s2);
        return String.valueOf(res);
//        Integer
    }
}

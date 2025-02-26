package day12;

public class AccountMain {
    public static void main(String[] args) {
     Account acc= new Account();
     acc.setAccno(1);
     acc.setName("Mrs Jeff");
     acc.setBal(99999.99);
     
     System.out.println(acc.getAccno());
     System.out.println(acc.getName());
     System.out.println(acc.getBal());
    }
}

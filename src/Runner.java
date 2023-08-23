public class Runner {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+375292147857","xiaomi redmi 13 pro", 200);
        Phone phone2 = new Phone("+375297167625", "iphone 13", 280);
        Phone phone3 = new Phone("+375336329475","honor 9 c", 340);

        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());

        phone1.receiveCall("Denis");
        phone2.receiveCall("Vlad");
        phone3.receiveCall("Artem");

        phone1.receiveCall("Denis",phone1.number);

        String src1 = phone1.getNumber();
        System.out.println(src1);
        String src2 = phone2.getNumber();
        System.out.println(src2);
        String src3 = phone1.getNumber();
        System.out.println(src3);

        phone1.sendMessage(phone1.number);
        phone2.sendMessage(phone2.number);
        phone3.sendMessage(phone3.number);
    }
}

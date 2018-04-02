package ee.khk.ikt;

public class Main {
    public static void main(String[] args) {
        ITelephone iTelephone = new DeskPhone( 1252367);
        iTelephone.powerOn();
        iTelephone.callPhone(346347347);
        iTelephone.answer();

    }
}

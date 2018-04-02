package ee.khk.ikt;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Doersn't have a power button");
    }

    @Override
    public void dial(int phoneNumber) {

    }

    @Override
    public void answer() {
            System.out.println("Answering the phone");
            isRinging = false;
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("trrrrr trrr trrr");
        }else {
            isRinging = false;
        }
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}

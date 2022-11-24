package lastTest.statusPattern;

public class StatusLess1000 extends Status{
    public StatusLess1000(MainWindow mainWindow) {
        super(mainWindow);
    }

    @Override
    public void addHundred() {
        mainWindow.balance += 100;
        mainWindow.setBalanceText();

        if(mainWindow.balance==1000){
            System.out.println("change status");

            mainWindow.setStatus(mainWindow.getStatusEqualOrMore1000());
            mainWindow.setMsgText("충분한 돈을 넣었습니다 음료를 선택하세요");


        }

    }

    @Override
    public void addFiveHundred() {
        mainWindow.balance += 500;
        mainWindow.setBalanceText();

        if(mainWindow.balance>=1000){
            mainWindow.setMsgText("충분한 돈을 넣었습니다 음료를 선택하세요");

            mainWindow.setStatus(mainWindow.getStatusEqualOrMore1000());

        }
        mainWindow.setBalanceText();

    }

    @Override
    public void addThousand() {
        mainWindow.balance += 1000;
        mainWindow.setBalanceText();

        if(mainWindow.balance>=1000){

            mainWindow.setMsgText("충분한 돈을 넣었습니다 음료를 선택하세요");

            mainWindow.setStatus(mainWindow.getStatusEqualOrMore1000());

        }
        mainWindow.setBalanceText();

    }

    @Override
    public void returnChanges() {
        mainWindow.setMsgText(""+mainWindow.balance+"원을 반환합니다");
        mainWindow.balance = 0;
        mainWindow.setBalanceText();
        mainWindow.setStatus(mainWindow.getStatusZero());
    }

    @Override
    public void selectBeverage() {
        mainWindow.setMsgText("충분한 돈을 넣어 주세용");
    }
}

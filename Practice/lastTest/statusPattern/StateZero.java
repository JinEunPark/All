package lastTest.statusPattern;

public class StateZero extends Status{

    public StateZero(MainWindow mainWindow) {
        super(mainWindow);
    }

    @Override
    public void addHundred() {
        mainWindow.balance += 100;
        mainWindow.setBalanceText();

        super.mainWindow.setStatus(mainWindow.getStatus500());
        mainWindow.setMsgText("");
        mainWindow.setBalanceText();

    }

    @Override
    public void addFiveHundred() {
        mainWindow.balance += 500;
        mainWindow.setBalanceText();

        super.mainWindow.setStatus(mainWindow.getStatus500());
        mainWindow.setBalanceText();
        mainWindow.setMsgText("");
    }

    @Override
    public void addThousand() {
        mainWindow.balance += 1000;
        mainWindow.setBalanceText();

        super.mainWindow.setStatus(mainWindow.getStatusEqualOrMore1000());
        mainWindow.setBalanceText();
        mainWindow.setMsgText("이미 충분한 돈이 투입되었습니다. 음료를 선택하세요");
    }

    @Override
    public void returnChanges() {
        mainWindow.setMsgText("돈을 넣은 후에 눌러주세요");

    }


    @Override
    public void selectBeverage() {
        mainWindow.setMsgText("돈을 넣은 후에 눌러주세요");

    }
}

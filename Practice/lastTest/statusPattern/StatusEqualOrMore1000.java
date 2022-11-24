package lastTest.statusPattern;

public class StatusEqualOrMore1000 extends Status{


    public StatusEqualOrMore1000(MainWindow mainWindow) {
        super(mainWindow);
    }

    @Override
    public void addHundred() {
        mainWindow.setMsgText("sex");

        mainWindow.balance += 100;
        mainWindow.setBalanceText();

        mainWindow.setMsgText("충분한 돈이 있습니다 음료를 선택해 주세요");
        mainWindow.setBalanceText();
    }

    @Override
    public void addFiveHundred() {

        mainWindow.balance += 500;
        mainWindow.setBalanceText();

        mainWindow.setMsgText("충분한 돈이 있습니다 음료를 선택해 주세요");
        mainWindow.setBalanceText();
    }

    @Override
    public void addThousand() {

        mainWindow.balance += 1000;
        mainWindow.setBalanceText();

        mainWindow.setMsgText("충분한 돈이 있습니다 음료를 선택해 주세요");
        mainWindow.setBalanceText();

    }

    @Override
    public void returnChanges() {

        mainWindow.setMsgText(""+mainWindow.balance+"원이 반환됩니다 잔돈을 확인하세용");
        mainWindow.balance = 0;
        mainWindow.setBalanceText();
        mainWindow.setStatus(mainWindow.getStatusZero());

    }

    @Override
    public void selectBeverage() {

        mainWindow.balance -= 1000;
        mainWindow.setBalanceText();
        mainWindow.setMsgText("\"음료가 반환 됬습니다 배출구를 확인하세요\"\n잔돈 "+mainWindow.balance+"원을 반환합니다 잔돈을 확인하세요");
        mainWindow.balance = 0;
        mainWindow.setBalanceText();
        mainWindow.setStatus(mainWindow.getStatusZero());

    }
}

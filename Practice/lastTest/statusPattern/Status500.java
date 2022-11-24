package lastTest.statusPattern;

public class Status500 extends Status{

    public Status500(MainWindow mainWindow) {
        super(mainWindow);
    }

    @Override
    public void addHundred() {
        mainWindow.balance += 100;
        mainWindow.setBalanceText();

        mainWindow.setStatus(mainWindow.getStatusLess1000());
        mainWindow.setMsgText("");
        mainWindow.setBalanceText();
    }

    @Override
    public void addFiveHundred() {
        mainWindow.balance += 500;
        mainWindow.setBalanceText();

        mainWindow.setStatus(mainWindow.getStatusEqualOrMore1000());
        mainWindow.setMsgText("이미 충분한 돈이 투입되었습니다. 음료를 선택하세요");
        mainWindow.setBalanceText();
    }

    @Override
    public void addThousand() {
        mainWindow.balance += 1000;
        mainWindow.setBalanceText();

        mainWindow.setStatus(mainWindow.getStatusEqualOrMore1000());
        mainWindow.setMsgText("이미 충분한 돈이 투입되었습니다. 음료를 선택하세요");
        mainWindow.setBalanceText();

    }

    @Override
    public void returnChanges() {
        mainWindow.setMsgText(""+mainWindow.balance+" 원을 반환 합니다");
        mainWindow.balance = 0;
        mainWindow.setStatus(mainWindow.getStatusZero());
        mainWindow.setBalanceText();
    }

    @Override
    public void selectBeverage() {
        mainWindow.setMsgText("돈을 1000원 이상 넣은후에 눌러 주세요");
//        mainWindow.setMsgText("음료를 내보냅니다 배출구를 확인하세요");
//        mainWindow.balance -= 1000;
//        mainWindow.setMsgText("거스름돈 "+mainWindow.balance+"원을 반환합니다");
//        mainWindow.balance = 0;
//        mainWindow.setBalanceText();
//        mainWindow.setStatus(mainWindow.getStatusZero());
    }
}

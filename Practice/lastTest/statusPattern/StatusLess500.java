package lastTest.statusPattern;

public class StatusLess500 extends Status{
    public StatusLess500(MainWindow mainWindow) {
        super(mainWindow);
    }

    @Override
    public void addHundred() {
        mainWindow.balance += 100;
        mainWindow.setBalanceText();

        if(mainWindow.balance == 500){
            mainWindow.setStatus(mainWindow.getStatus500());
        }
        mainWindow.setMsgText("");
        mainWindow.setBalanceText();
    }

    @Override
    public void addFiveHundred() {
        mainWindow.balance += 500;
        mainWindow.setBalanceText();


        if(mainWindow.balance >500 && mainWindow.balance < 1000){
            mainWindow.setStatus(mainWindow.getStatusLess1000());
        }
        mainWindow.setMsgText("");
        mainWindow.setBalanceText();
    }

    @Override
    public void addThousand() {
        mainWindow.balance += 1000;
        mainWindow.setMsgText("충분한 돈이 투입됨 음료를 고를 것");
        mainWindow.setStatus(mainWindow.getStatusEqualOrMore1000());
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
        mainWindow.setMsgText("돈을 1000원 이상 넣어 주세요");

    }
}

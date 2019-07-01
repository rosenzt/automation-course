package Elements.Question1;

import Elements.Question1.Canvas;

public class Main {
    public static void main(String[] args) {

        Canvas canvas = new Canvas();

        canvas.lunchSite();
        canvas.fillInvalidData();
        canvas.getErrorMessage();
        canvas.handleAllReadyExistingUser();
        canvas.handleForgottenPassWord();
        canvas.closeBrowser();

    }
}

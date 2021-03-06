package UI;

import UI.ResponseBuffer;

import java.util.List;
import java.util.TimerTask;

public class ResponseDaemon extends TimerTask {

    private ResponseBuffer responseBuffer;

    public ResponseDaemon(ResponseBuffer responseBuffer) {
        this.responseBuffer = responseBuffer;
    }

    @Override
    public void run() {
        List<String> responses = responseBuffer.getResponses();
        if(!responses.isEmpty()){
            System.out.println(String.join("\n", responses));
        }
    }
}

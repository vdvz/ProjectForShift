import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;

public class Handler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {

        if("POST".equals(exchange.getRequestMethod())){
            handlePOST(exchange);
        }




    }

    private void handlePOST(HttpExchange exchange){

    }



}

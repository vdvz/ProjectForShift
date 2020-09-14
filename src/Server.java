import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Server {

    int maximum_threads = 10;
    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(maximum_threads);

    private HttpServer server = null;
    private int port = 32000;

    public void Create() throws IOException {

        server = HttpServer.create(new InetSocketAddress("localhost", port), 0);
        server.createContext("/", new Handler());
        server.setExecutor(threadPoolExecutor);
    }

    public void ServerStart(){
        if(server!=null) server.start();
    }

    public void ServerStop(){ server.stop(1);}
}

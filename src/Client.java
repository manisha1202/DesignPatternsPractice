import handlers.BuildWallHandler;
import models.BuildWallRequest;
import models.WallType;

public class Client {
    public static void main(String[] args) {

        BuildWallRequest request = new BuildWallRequest(WallType.BRICK,10);
        BuildWallHandler handler=new BuildWallHandler();
        handler.handleRequest(request);
    }
}

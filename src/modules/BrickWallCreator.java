package modules;

import models.BuildWallRequest;
import models.WallType;

public class BrickWallCreator implements WallCreator {

    @Override
    public void buildWall(BuildWallRequest request) {
        for(int i=0;i<request.getLength();i++){
            System.out.print(request.getType().getSign());
        }
    }
}

package modules;

import models.BuildWallRequest;

public class StoneWallCreator implements WallCreator {

    @Override
    public void buildWall(BuildWallRequest request) {
        for(int i=0;i<request.getLength();i++){
            System.out.print(request.getType().getSign());
        }
    }
}

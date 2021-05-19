package controllers;

import factories.WallCreatorFactory;
import models.BuildWallRequest;
import modules.WallCreator;

import java.util.HashMap;

public class BuildWallController {

    private WallCreatorFactory wallCreatorFactory;
    public BuildWallController(WallCreatorFactory wallCreatorFactory){
        this.wallCreatorFactory = wallCreatorFactory;
    }


    public void executeRequest(BuildWallRequest request){
        WallCreator wallCreator = wallCreatorFactory.getWallCreator(request.getType());
        wallCreator.buildWall(request);
    }
}

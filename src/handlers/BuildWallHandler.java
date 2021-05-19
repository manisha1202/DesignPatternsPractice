package handlers;

import controllers.BuildWallController;
import factories.WallCreatorFactory;
import models.BuildWallRequest;
import models.WallType;
import modules.BrickWallCreator;
import modules.MetalWallCreator;
import modules.StoneWallCreator;
import modules.WallCreator;

import java.util.HashMap;
import java.util.Map;

public class BuildWallHandler {
    private BuildWallController buildwallcontroller;

    public BuildWallHandler() {
//        Map<WallType, WallCreator> map=new HashMap<>();
//        map.put(WallType.BRICK,new BrickWallCreator());
//        map.put(WallType.METAL,new MetalWallCreator());
//        map.put(WallType.STONE,new StoneWallCreator());
        WallCreatorFactory wallCreatorFactory= new WallCreatorFactory(new BrickWallCreator(),
                new MetalWallCreator(),new StoneWallCreator());
        this.buildwallcontroller=new BuildWallController(wallCreatorFactory);
    }
    public void handleRequest(BuildWallRequest request){
        buildwallcontroller.executeRequest(request);
    }


}

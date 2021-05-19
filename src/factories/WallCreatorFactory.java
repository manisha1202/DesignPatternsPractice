package factories;

import models.WallType;
import modules.BrickWallCreator;
import modules.MetalWallCreator;
import modules.StoneWallCreator;
import modules.WallCreator;

import java.util.HashMap;
import java.util.Map;

public class WallCreatorFactory {
//    private Map<WallType, WallCreator> wallCreatorMap;

    private BrickWallCreator brickWallCreator;
    private MetalWallCreator metalWallCreator;
    private StoneWallCreator stoneWallCreator;

//    public WallCreatorFactory(Map<WallType, WallCreator> wallCreatorMap){
//        this.wallCreatorMap = wallCreatorMap;
//    }

    public WallCreatorFactory(BrickWallCreator brickWallCreator, MetalWallCreator metalWallCreator, StoneWallCreator stoneWallCreator) {
        this.brickWallCreator = brickWallCreator;
        this.metalWallCreator = metalWallCreator;
        this.stoneWallCreator = stoneWallCreator;

    }

    public WallCreator getWallCreator(WallType wallType) {
//        if (wallCreatorMap.containsKey(wallType)) {
//            return wallCreatorMap.get(wallType);
//        } else {
//            throw new UnsupportedOperationException("Wall type not supported: " + wallType);
//        }
        if(wallType.equals(WallType.BRICK)){
            return brickWallCreator;
        }else if(wallType.equals(WallType.STONE)){
            return stoneWallCreator;
        }else if(wallType.equals(WallType.METAL)){
            return metalWallCreator;
        }
        throw new UnsupportedOperationException("Wall type : "+wallType+" not supported");
    }
}

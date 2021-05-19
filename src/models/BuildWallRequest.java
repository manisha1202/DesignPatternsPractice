package models;

//import lombok.Getter;
//import lombok.Setter;
//
//@Getter
//@Setter
public class BuildWallRequest {
    private WallType type;
    private int length;

    public BuildWallRequest() {
    }

    public BuildWallRequest(WallType type, int length) {
        this.type = type;
        this.length = length;
    }

    public WallType getType() {
        return type;
    }

    public void setType(WallType type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

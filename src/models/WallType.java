package models;

public enum WallType {
    BRICK("="),
    METAL("|"),
    STONE("+");

    private String sign;

    WallType(String sign){
        this.sign = sign;
    }

    public String getSign(){
        return sign;
    }
}

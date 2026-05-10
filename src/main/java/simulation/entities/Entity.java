package simulation.entities;

public abstract class Entity {


    private String spriteResourcePath;

    public abstract void makeMove();

    public String getSpriteResourcePath() {
        return spriteResourcePath;
    }

    public void setSpriteResourcePath(String spriteResourcePath) {
        this.spriteResourcePath = spriteResourcePath;
    }
}

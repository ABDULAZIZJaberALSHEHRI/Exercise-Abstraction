public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x,int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;

    }

    @Override
    public void moveDown() {
        y+=ySpeed;
        System.out.println("MoveDown: "+"y= "+y+" , "+"ySpeed= "+ySpeed);

    }

    @Override
    public void moveUp() {
        y-=ySpeed;
        System.out.println("MoveUp: "+"y= "+y+" , "+"ySpeed= "+ySpeed);
    }

    @Override
    public void moveLeft() {
        x-=xSpeed;
        System.out.println("MoveLeft: "+"x= "+x+" , "+"xSpeed= "+xSpeed);
    }

    @Override
    public void moveRight() {
        x+=xSpeed;
        System.out.println("MoveRight: "+"x= "+x+" , "+"xSpeed= "+xSpeed);
    }

    public String toString() {
        return String.format("MovablePoint (%1$d, %2$d) with xSpeed = %3$d and ySpeed = %4$d"
                , x, y, xSpeed, ySpeed);
    }
}

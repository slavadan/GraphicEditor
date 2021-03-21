public class Pencil extends Tool{

    @Override
    public void draw() {
        this.graphics.drawLine(oldX, oldY, currentX, currentY);
    }

    @Override
    public void draw(int oldX, int oldY, int currentX, int currentY) {

    }
}

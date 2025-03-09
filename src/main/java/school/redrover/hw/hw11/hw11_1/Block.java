package school.redrover.hw.hw11.hw11_1;

public class Block{

    private final int width;
    private final int length;
    private final int height;

    public Block(int[] block) {
        this.width = block[0];
        this.length = block[1];
        this.height = block[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return width * length * height;
    }

    public int getSurfaceArea() {
        return 2 * (width * length + width * height + length * height);
    }
}
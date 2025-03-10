package school.redrover.hw.hw12.p2.v1;

public final class Closet extends FurnitureForStorage {

    private final boolean clothesWithKey;
    private final boolean armoryCabinet;

    public Closet(String color, String material, int price, double volume,
                  int length, int width, int height, boolean clothesWithKey, boolean armoryCabinet) {

        super(color, material, price, volume, length, width, height);
        this.clothesWithKey = clothesWithKey;
        this.armoryCabinet = armoryCabinet;
    }

    @Override
    public boolean isClothesWithKey() {
        return clothesWithKey;
    }

    @Override
    public void organizeItems() {
        System.out.println("На полки можно разместить одежду либо хранить небольшие предметы");
    }

    @Override
    public boolean isArmored() {
        return isArmoryCabinet();
    }

    @Override
    public void howToUse() {
        if (isClothesWithKey() && isArmored()) {
            System.out.println("Шкаф подходит для хранения оружия");
        } else {
            System.out.println("Шкаф для одежды или бытовых нужд");
        }
    }

    @Override
    public void assemble() {
        System.out.println("Собирается каркас, прикручиваются двери и устанавливаются полки");
    }

    public boolean isArmoryCabinet() {
        return armoryCabinet;
    }
}

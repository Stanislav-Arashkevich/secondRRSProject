//package school.redrover.hw.hw11.hw11_1.Console_Fight;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Unit {
//
//    private final String heroName;
//
//    private int hp;
//    private int hpMax;
//
//    private final int attack;
//    private final int defence;
//    private boolean defStance;
//    private float critAttackChance;
//
//    private int fighterMoney;
//
//    private static Random rnd;
//    private static Scanner sc;
//
//    public Unit(String heroName, int hpMax, int attack, int defence) {
//
//        this.heroName = heroName;
//        this.hpMax = hpMax;
//        this.hp = this.hpMax;
//        this.attack = attack;
//        this.defence = defence;
//        this.critAttackChance = 0.5f;
//        this.fighterMoney = 1000;
//    }
//
//    public void attack(Unit target) {
//        int actualAttack = attack;
//
//        if (Math.random() <= critAttackChance) {
//            actualAttack += 2;
//        }
//
//        int resultedAttackAmount = target.takeDamage(actualAttack);
//        System.out.printf("персонаж %s нанес врагу %s %s ед. урона%n", heroName,
//                          target.heroName, resultedAttackAmount);
//        target.printInfo();
//    }
//
//    public void defenceStance() {
//        defStance = true;
//        System.out.println(this.getHeroName() + " защищается");
//    }
//
//    public void beginTurn() {
//        System.out.println();
//        System.out.println("Ход персонажа: " + this.getHeroName());
//        printInfo();
//        defStance = false;
//    }
//
//    public int takeDamage(int amount) {
//
//        int actualDefence = getDefence();
//
//        if (this.isDefStance()) {
//            actualDefence *= 1.5f;
//        }
//
//        amount -= actualDefence;
//
//        if (amount < 0) {
//            amount = 0;
//        }
//
//        hp -= amount;
//
//        return amount;
//    }
//
//    public void cure(int amount) {
//
//        hp += amount;
//
//        if (hp > hpMax) {
//            hp = hpMax;
//        }
//    }
//
//    public void printInfo() {
//
//        System.out.printf("""
//                 %s HP: %s/%s
//                 ATTACK: %s
//                 DEFENCE: %s
//
//                """, this.getHeroName(), this.getHp(), this.getHpMax(),
//                      this.getAttack(), this.getDefence()
//        );
//    }
//
//    // как-то нужно разделить, чтобы получилась проверка. Но у нас один конструктор
//    // для создания юнита.
//    public boolean isGameOver() {
//        if (this.getHp() <= 0) {
//            System.out.println("Монстр победил!");
//            return true;
//        }
//
//        if (monsterHP <= 0) {
//            System.out.println("Герой победил");
//            return true;
//        }
//
//        return false;
//    }
//
//    //Логика хода героя
//    public void fighterOneTurn() {
//        System.out.println("""
//                \nХод героя.
//                Выберите действие:
//                    1. Атака
//                    2. Защита
//                """);
//        int command = sc.nextInt();
//
//        if (command == 1) {
//            System.out.println("\nГерой атакует. Монстр " + monsterName +
//                    " получил " + this.getAttack() + " ед. урона");
//            monsterHP -= heroAttack;
//            if (rnd.nextInt(100) < 30) {
//                System.out.println("Герой вошел в раж и нанес ещё " + heroAttack +
//                        " ед. урона");
//                monsterAttack -= heroAttack;
//            }
//
//        } else if (command == 2) {
//            System.out.println("\nГерой " + heroName +
//                    " ушел в защиту и получил 1 ед. здоровья");
//            heroHP++;
//        } else {
//            System.out.println("\nВы пропускаете ход........");
//        }
//    }
//
//    //Логика хода монстра.
//    public void fighterTwoTurn() {
//        System.out.println("Ход монстра.");
//        var monsterCommand = rnd.nextInt(2);
//        if (monsterCommand == 0) {
//            System.out.println("Монстр атакует. Герой " + heroName +
//                    " получил " + monsterAttack + " ед. урона");
//            heroHP -= monsterAttack;
//        } else if (monsterCommand == 1) {
//            System.out.println("Монстр устал. Он решил выпить зелья");
//            monsterHP += 5;
//        }
//    }
//
//
//    // прикрутить ходы каждого в зависимости, кто ходит первый
//    // впилить ходы в declareWinner.
//    // допилить проверку isGameOver() в зависимости, кто ходит первым.
//    // раcкидать все по классам, чтоб не было грязно
//    // придумать(найти) графику (assets) для LibGDX --- сделать 2d игру.
//
//    private static void init() {
//        System.out.print("Введите имя героя, HP, силу атаки, уровень защиты: ");
//        Unit fighterOne = new Unit(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
//
//        System.out.print("Введите имя монстра, HP, силу атаки, уровень защиты: ");
//        Unit fighterTwo = new Unit(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
//    }
//
//    public String getHeroName() {
//        return heroName;
//    }
//
//    public int getHp() {
//        return hp;
//    }
//
//    public int getHpMax() {
//        return hpMax;
//    }
//
//    public int getAttack() {
//        return attack;
//    }
//
//    public int getDefence() {
//        return defence;
//    }
//
//    public boolean isDefStance() {
//        return defStance;
//    }
//
//    public float getCritAttackChance() {
//        return critAttackChance;
//    }
//
//    public int getFighterMoney() {
//        return fighterMoney;
//    }
//}
//
///*
//    public static void main(String[] args) {
//        init();
//
//        System.out.println("Игра началась");
//        System.out.println("\nГерой " + heroName +
//                " вошел в темный лес и увидел монстра по имени " + monsterName +
//                ". Деваться некуда, придется драться.\n");
//        System.out.println("Бой начался!");
//
//        while (true) {
//
//            heroTurn();
//            if (isGameOver()) {
//                break;
//            }
//            printStatistic();
//
//            monsterTurn();
//            if (isGameOver()) {
//                break;
//            }
//            printStatistic();
//        }
//
//        System.out.println("\nИгра окончена");
//    }
//
//        public static void main(String[] args) {
//
//        Unit hero = new Unit("Jack", 30, 4, 2);
//        Unit monster = new Unit("Goblin", 20, 5, 1);
//
//        hero.defenceStance();
//        hero.beginTurn();
//        hero.attack(monster);
//
//        monster.beginTurn();
//        monster.attack(hero);
//
//        System.out.println();
//        hero.defenceStance();
//        System.out.println("Герой идет по подземелью, наступает в какаху и \"подрывается\", получив "
//                            + hero.takeDamage((int) (Math.random() * 11)) + " ед. урона");
//        hero.printInfo();
//        System.out.println("Затем он немного \"отмылся\", получив + 4 ед. здоровья");
//        hero.cure(4);
//        hero.printInfo();
//    }
// */
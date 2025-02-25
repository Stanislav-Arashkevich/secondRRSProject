package school.redrover.cw.cw8;

public class OOP {

    public static void main(String[] args) {


        Book borodino = new Book("123456789", "Borodino", new String[]{"M.U. Lermontov"}, 350);
//        borodino.setIsdn("123456789");
//        borodino.setTitle("Borodino");
//        borodino.setAuthor("M.U. Lermontov");
//        borodino.setNoOfPAges(350);

        System.out.println(borodino.makeCatalogCard());

        Book onegin = new Book("9876543210", "Evgeniy Onegin", new String[]{"A.S. Pushkin"}, 430);
        System.out.println(onegin.makeCatalogCard());

        Book.setBorder("++++++++++++++++++++++++++++++++");
        System.out.println(borodino.makeCatalogCard());
        System.out.println(onegin.makeCatalogCard());
        System.out.println(onegin.isValid());

    }

//    public static String makeCatalogCard(Book b) {
//
//        return  "--------------------------------\n" +
//                    b.makeCatalogCard() +
//                "\n--------------------------------";
//    }
}
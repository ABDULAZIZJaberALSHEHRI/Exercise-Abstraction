//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("================ Question '1' ================\n");
        System.out.println("================ Books ================");
        Book book1 = new Book("one cursed rose.",50,"Rebecca zenatti.");
        System.out.println("Book name: "+book1.getName());
        System.out.println("Author: "+ book1.getAuthor());
        System.out.println("Price: "+book1.getPrice());
        System.out.println("Price after discount: "+book1.getDiscount());

        Book book2 = new Book("Born of Gilded Mountains.",37,"Amanda Dykes.");
        System.out.println("\nBook name: "+book2.getName());
        System.out.println("Author: "+ book2.getAuthor());
        System.out.println("Price: "+book2.getPrice());
        System.out.println("Price after discount: "+book2.getDiscount());

        Book book3 = new Book("Introduce to java.",78,"Y. Daniel Liang.");
        System.out.println("\nBook name: "+book3.getName());
        System.out.println("Author: "+ book3.getAuthor());
        System.out.println("Price: "+book3.getPrice());
        System.out.println("Price after discount: "+book3.getDiscount());


        System.out.println("\n================ Movies ================");
        Movie movie1 = new Movie("The Shawshank Redemption",102, "Frank Darabont");
        System.out.println("Movie name: "+movie1.getName());
        System.out.println("Movie director: "+movie1.getDirector());
        System.out.println("Movie price: "+movie1.getPrice());
        System.out.println("Price after discount: "+movie1.getDiscount());

        Movie movie2 = new Movie("The Godfather",122, "Francis Ford Coppola");
        System.out.println("\nMovie name: "+ movie2.getName());
        System.out.println("Movie director: "+ movie2.getDirector());
        System.out.println("Movie price: "+ movie2.getPrice());
        System.out.println("Price after discount: "+ movie2.getDiscount());

        Movie movie3 = new Movie("Forrest Gump",89, "Robert Zemeckis");
        System.out.println("\nMovie name: "+ movie3.getName());
        System.out.println("Movie director: "+ movie3.getDirector());
        System.out.println("Movie price: "+ movie3.getPrice());
        System.out.println("Price after discount: "+ movie3.getDiscount());

        System.out.println("\n================ Question '2' ================");
        System.out.println("====== Example '1'=======");
        MovablePoint movablePoint1 = new MovablePoint(10,10,10,10);
        movablePoint1.moveUp();
        movablePoint1.moveDown();
        movablePoint1.moveLeft();
        movablePoint1.moveRight();
        System.out.println(movablePoint1.toString());

        System.out.println("\n====== Example '2'=======");
        MovablePoint movablePoint2 = new MovablePoint(7,4,100,180);
        movablePoint2.moveUp();
        movablePoint2.moveDown();
        movablePoint2.moveLeft();
        movablePoint2.moveRight();
        System.out.println(movablePoint2.toString());

        System.out.println("\n====== Example '3'=======");
        MovablePoint movablePoint3 = new MovablePoint(18,34,79,65);
        movablePoint3.moveUp();
        movablePoint3.moveDown();
        movablePoint3.moveLeft();
        movablePoint3.moveRight();
        System.out.println(movablePoint3.toString());
    }
}
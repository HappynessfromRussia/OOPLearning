public class Main {
    public static void main(String[] args) {
        Rect rect = new Rect(); // объявление переменной класса рект
        rect.height = 10;
        rect.width = 15;
        rect.nameOfRect = "I am rect";

        Rect rect1 = new Rect();
        rect1.height = 5;
        rect1.width = 25;
        rect1.nameOfRect = "I am rect1";

        Rect rect3 = new Rect();
        rect3.height = 1;
        rect3.width = 2;
        rect3.nameOfRect = "I am rect3";

//        System.out.println(rect ==  rect1);
//        System.out.println(rect1);
//        rect1 = rect;
//        System.out.println(rect == rect1);
//        System.out.println(rect1);

//        System.out.println(rect.getArea());
//        System.out.println(rect1.getArea());
//        System.out.println(rect3.getArea());
//
//        rect3.maignify(1.5 );
//        System.out.println(rect3.getArea());

//        Point point1 = new Point();
//        Point point2 = new Point();
//
//        point1.input();
//        System.out.println(point1);
//
//        point2.input();
//        System.out.println(point2);
//
//        System.out.println(point1.getDinstance(point2));
//
//        System.out.println("Start moving the point 1");
//        point1.move(100,120);
//        System.out.println(point1);
//        System.out.println(point1.getDinstance(point2));

        Double number = Double.valueOf(10.0);
        double numberCopy = number.doubleValue();
        number.toString();
        String a = "156";
        Integer integer = Integer.parseInt(a);
        int c = integer; // автораспаковка
        integer = c; // автоупаковка
    }
}
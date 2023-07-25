package polymorphism;

public class Coords<T extends TwoD> {

    T[] cords;

    Coords(T[] o) {
        cords = o;
    }

    void showXY(Coords<T> c) {
        System.out.println("Coordinate of X Y:");
        for (int i = 0; i < c.cords.length; i++) {
            System.out.println(c.cords[i].x + " " + c.cords[i].y);
        }
    }

    static void showXYZ(Coords<? extends TreeD> c) {
        System.out.println("Coordinate of X Y Z:");
        for (int i = 0; i < c.cords.length; i++) {
            System.out.println(c.cords[i].x + " " + c.cords[i].y + " " + c.cords[i].z);
        }
    }

//    static void showAll(Coords<? super FourD> c) { restriction to base class only
    static void showAll(Coords<? extends FourD> c) {
        System.out.println("Coordinate of X Y Z T:");
        for (int i = 0; i < c.cords.length; i++) {
            System.out.println(c.cords[i].x + " " + c.cords[i].y + " " + c.cords[i].z + " " + c.cords[i].t);
        }
    }


    public static void main(String[] args) {
        FourD[] fd = {
                new FourD(1, 2, 3, 4),
                new FourD(-2, 4, 8, 22),
                new FourD(0, -24, 33, 49),

        };

        Coords<TwoD> twoDCoords = new Coords<>(fd);
        System.out.println("Contain of twoDCoords:");
        twoDCoords.showXY(twoDCoords);

        Coords<FourD> fourDCoords = new Coords<>(fd);
        System.out.println("Contain of fourDCoords:");
        fourDCoords.showXY(fourDCoords);
        showXYZ(fourDCoords);
        showAll(fourDCoords);


    }
}

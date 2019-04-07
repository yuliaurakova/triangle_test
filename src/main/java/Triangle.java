public class Triangle {
    public boolean TheRealTriangle(int side1, int side2, int side3) {
        return side3 < (side1 + side2) && side2 < (side1 + side3) && side1 < (side2 + side3);
    }
}

class Lab1 {
    public static void main(String[] args) {
        Point3d a = new Point3d(1, 2, 3);
        Point3d b = new Point3d(1, 2, 3);
        Point3d c = new Point3d(3, 5, 6);

        //Проверка на совпадение координат точек
        if (a.compare(b) || a.compare(c) || b.compare(c)) {
            System.out.println("Одна из точек совпадает с другой!");
            return;
        }

        double area = computeArea(a, b, c);
        if (area == 0) {
            System.out.println("Площадь равна 0");
            return;
        }

        System.out.println(area);
    }



    //Площадь треугольника по формуле Герона
    public static double computeArea(Point3d a, Point3d b, Point3d c) {
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        double ac = a.distanceTo(c);
        double p = (ab + bc + ac) / 2;
        return Math.sqrt(p*(p-ab)*(p-bc)*(p-ac));
    }
}

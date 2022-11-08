//Класс трёхмерной точки наследуемый от двумерной
public class Point3d extends Point2d {
    //Объявляем переменную координат привантно
    private double zCoord;
    //Конструктор класса.
    Point3d(double x, double y, double z) {
        super(x, y);
        zCoord = z;
    }

    //Перегрузка конструктора
    Point3d(){
        this(0.0, 0.0, 0.0);
    }

    public double getZ() {
        return zCoord;
    }
    public void setZ(double z) {
        zCoord = z;
    }
    //Сравнивает объект с другим объектом, по значению
    public boolean compare(Point3d point){
        return (this.getX() == point.getX() && this.getY() == point.getY() && zCoord == point.getZ());
    }
    //Возвращает расстояние между двумя точками
    public double distanceTo(Point3d point){
        return Math.sqrt(Math.pow(this.getX() - point.getX(), 2) + Math.pow(this.getY() - point.getY(), 2) + Math.pow(zCoord - point.getZ(), 2));
    }
}
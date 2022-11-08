public class Vectors {
    public static class Vector { // class Vector
        private double x,y,z;
        public Vector(double x, double y, double z) {//конструктор с параметрами в виде списка координат x, y, z
            this.x = x;
            this.y = y;
            this.z = z;
        }
        public double len() {// длина вектора
            return Math.sqrt(x * x + y * y + z * z);
        }
        public double scalar_pro(Vector vector) {// скалярное произведение
            return x * vector.x + y * vector.y + z * vector.z;
        }
        public Vector vector_pro(Vector vector) {// векторное произведение
            return new Vector(
                    y * vector.z - z * vector.y,
                    z * vector.x - x * vector.z,
                    x * vector.y - y * vector.x);
        }
        public double cos(Vector vector) {//угол между векторами (или косинус угла):
            return scalar_pro(vector) / (len() * vector.len());
        }
        public Vector plus(Vector vector) {//метод для суммы
            return new Vector( x + vector.x,y + vector.y,z + vector.z);
        }
        public Vector minus(Vector vector) {//метод для разницы
            return new Vector(x - vector.x,y - vector.y,z - vector.z);
        }
        public static Vector[] massRand(int n){//статический метод
            Vector[] vectors = new Vector[n];
            for(int i = 0; i < n; i++){//проходимся по массиву
                vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
            }
            return vectors;
        }
        public String toString() {
            return "Вектор{" +"x:" + x +", y:" + y +", z:" + z +'}';
        }
    }
    public static void main(String[] args) {
        Vector[] vectors = Vector.massRand(3);
        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
        System.out.println(vectors[0].len());
        System.out.println(vectors[0].scalar_pro(vectors[1]));
        System.out.println(vectors[0].vector_pro(vectors[1]));
        System.out.println(vectors[0].cos(vectors[1]));
        System.out.println(vectors[0].plus(vectors[1]));
        System.out.println(vectors[0].minus(vectors[1]));
    }
}
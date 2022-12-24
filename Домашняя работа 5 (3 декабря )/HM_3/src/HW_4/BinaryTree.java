package HW_4;
public class BinaryTree<V extends Comparable<V>> {
    public static void main(String[] args) {
        BinaryTree<Integer> host = new BinaryTree<>();




        System.out.println(host.add(3));
        System.out.println(host.add(1));
        System.out.println(host.add(5));
        System.out.println(host.add(2));
        System.out.println(host.add(4));
        System.out.println(host.add(0));
        System.out.println(host.add(1));


        System.out.println();




        System.out.println(host.getVal(0));
        System.out.println(host.getVal(1));
        System.out.println(host.getVal(2));
        System.out.println(host.getVal(3));
        System.out.println(host.getVal(4));
        System.out.println(host.getVal(5));
        System.out.println(host.getVal(11));
    }

    V value = null;
    BinaryTree<V> right = null;
    BinaryTree<V> left = null;
    public BinaryTree(V value) {
        this.value = value;
    }
    public BinaryTree() {
    }

    public boolean add(V v) {
        boolean result = false;
        if (value == null) {
            value = v;
            result = true;
        } else {
            if (v.compareTo(value) > 0) {
                if (right == null) {
                    BinaryTree<V> node = new BinaryTree<>(v);
                    this.right = node;
                    result = true;
                } else {
                    result = right.add(v);
                }
            }
            if (v.compareTo(value) < 0) {
                if (left == null) {
                    this.left = new BinaryTree<>(v);
                    result = true;
                } else {
                    result = left.add(v);
                }
            }
        }
        return result;
    }
    public boolean getVal(V v) {
        boolean result = false;
        if (this.value.compareTo(v) == 0) {
            result = true;
        } else if (this.value.compareTo(v) < 0) {
            if (this.right != null) {
                result = right.getVal(v);
            }
        } else if (this.value.compareTo(v) > 0) {
            if (this.left != null) {
                result = left.getVal(v);
            }
        }
        return result;
    }
}
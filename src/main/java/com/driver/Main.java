package com.driver;

public class Main {
    public static class Product {
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        int p1 = p.product(4, 6);
        int p2 = p.product(4, 6, 8);
        double p3 = p.product(4.4, 6.6);
    }
}
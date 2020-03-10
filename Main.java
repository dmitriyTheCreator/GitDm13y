package com.company.dima.litvinenko;

import com.company.dima.litvinenko.vector.*;

import static com.company.dima.litvinenko.vector.Vector.feedback;

public class Main {

    public static void main(String[] args) {
        Vector vector = new Vector(1,1,1);
        Vector vector1 = new Vector(2,2,8);
        System.out.println(vector.length());
        System.out.println(vector.scalarProduct(vector1));
        System.out.println(vector.crossProduct(vector1));
        System.out.println(vector.cos(vector1));
        System.out.println(vector.sum(vector1));
        System.out.println(vector.diff(vector1));
        Vector[] vectors = Vector.feedback(10);
        for (int i = 0; i < 10; i++) {
            System.out.println(vectors[i]);
        }
    }
}

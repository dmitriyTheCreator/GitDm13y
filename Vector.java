package com.company.dima.litvinenko.vector;

import static java.lang.Math.*;
import static java.lang.Math.random;

public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length(){
        return sqrt((pow(x, 2) + pow(y, 2) + pow(z, 2)));
    }

    public double scalarProduct(Vector vector){
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector crossProduct(Vector vector){
        double x1 = y * vector.z - z * vector.y;
        double y1 = z * vector.x - x * vector.z;
        double z1 = x * vector.y - y * vector.x;
        return new Vector(x1,y1,z1);
    }

    public double cos(Vector vector){
        return scalarProduct(vector) / (length() * vector.length());
    }

    public Vector sum(Vector vector){
        double x1 = x + vector.x;
        double y1 = y + vector.y;
        double z1 = z + vector.z;
        return new Vector(x1,y1,z1);
    }

    public Vector diff(Vector vector){
        double x1 = x - vector.x;
        double y1 = y - vector.y;
        double z1 = z - vector.z;
        return new Vector(x1,y1,z1);
    }

    public static Vector[] feedback(int N){
        Vector[] vectors = new Vector[N];
        for (int i = 0; i < N; i++) {
            vectors[i] = new Vector(random(), random(), random());
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "" + x +
                ", " + y +
                ", " + z +
                '}';
    }
}
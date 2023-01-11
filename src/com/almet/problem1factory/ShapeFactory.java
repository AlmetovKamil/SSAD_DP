package com.almet.problem1factory;

public class ShapeFactory {
    enum ShapeType {
        CIRCLE, SQUARE, RECTANGLE;
    }

    public Shape createShape(ShapeType type) {
        switch (type) {
            case CIRCLE: return new Circle();
            case SQUARE: return new Square();
            case RECTANGLE: return new Rectangle();
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }
}

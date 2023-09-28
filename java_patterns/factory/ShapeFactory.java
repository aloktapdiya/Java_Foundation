package java_patterns.factory;

public class ShapeFactory {

    //To acquire an object of type shape, use the getShape method.

    public Shape getShape(String shapeType){

        if(shapeType == null){

            return null;

        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){

            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){

            return new Rectangle();



        } else if(shapeType.equalsIgnoreCase("SQUARE")){

            return new Square();

        }

        return null;

    }

}

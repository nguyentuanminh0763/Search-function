package Controller;

import Common.Library;
import Model.Element;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        element.setSizeArray(library.getIntData("Enter number of array: ", 1, 100));
        element.setArray(library.createArray(element.getSizeArray()));
        new SearchProgramming(element).run();
    }
}

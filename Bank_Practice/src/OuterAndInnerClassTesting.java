//Outer class Starts here
public class OuterAndInnerClassTesting {

    public void display() {
        System.out.println("<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
        System.out.println("Here is the normal class");

        // Accessing to the inner class!
        TestingInnerClass testingInnerClass = new TestingInnerClass();
        System.out.println("Accessing to the inner class from outer class!!!");
        testingInnerClass.displayInfo();
    }

    /// Inner class starts from here
    public class TestingInnerClass {
        public TestingInnerClass() {
        }

        public void displayInfo() {
            System.out.println("It is printing from the inner class!");
        }
    }

}

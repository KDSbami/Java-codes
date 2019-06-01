public class super_advance_test {
    static class Child extends Parent{
        class DeeplyNested {
            public void method() {
                Child.super.overriden();
            }
        }

        public void overriden() {
            System.out.println("child");
        }
    }
     class Parent {
        public void overriden() {
            System.out.println("parent");
        }
    }
    public static void main(String args[]) {
        Child child = new Child();
        Child.DeeplyNested deep = child.new DeeplyNested();
        deep.method();
    }
}
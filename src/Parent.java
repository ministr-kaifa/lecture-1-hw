public class Parent {
  static {
    System.out.println("Parent:static 1");
  }

  static {
    System.out.println("Parent:static 2");
  }

  {
    System.out.println("Parent:instance 1");
  }

  {
    System.out.println("Parent:instance 2");
  }

  private String name;

  public Parent() {
    System.out.println("Parent:constructor");
  }

  public Parent(String name) {
    System.out.println("Parent:name-constructor");
    this.name = name;
  }

}

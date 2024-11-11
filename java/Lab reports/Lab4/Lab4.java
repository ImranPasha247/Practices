
    public class Lab4 {
        public static void main(String[] args) {
            SampleClass person1 = new SampleClass("Imran Pasha","E241005");
            SampleClass person2 = person1;
                    person2.name = "Moinul";
                    person2.id = "E241031";
            System.out.println("Person 1 Details:");
            person1.displayInfo();
            System.out.println("\nPerson 2 Details:");
            person2.displayInfo();
                }
    }
    class SampleClass {
        String name;
        String id;
    SampleClass(String name, String id) {
            this.name = name;
            this.id = id;
        }
    void displayInfo() {
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
        }
    }


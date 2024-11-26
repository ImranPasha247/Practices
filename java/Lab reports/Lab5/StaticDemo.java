class ThisExample {
    int value; // Instance variable

    // Constructor using 'this' keyword to differentiate parameter from instance variable
    ThisExample(int value) {
        this.value = value;
    }

    // Method to display the value
    void displayValue() {
        System.out.println("Value: " + this.value);
    }

    // Method to compare the instance variable with another value
    void compareValue(int anotherValue) {
        if (this.value == anotherValue) {
            System.out.println("The values are equal.");
        } else {
            System.out.println("The values are not equal.");
        }
    }
}

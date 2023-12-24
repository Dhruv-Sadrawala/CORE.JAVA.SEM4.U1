class LengthConverter {
    private double feet;

    public LengthConverter(double feet) {
        this.feet = feet;
    }
    public LengthConverter(LengthConverter original) {
        this.feet = original.feet;
    }
    public double convertToCentimeters() {
        return feet * 30.48; // 1 foot = 30.48 centimeters
    }

    public static void main(String[] args) {

        LengthConverter originalLength = new LengthConverter(5.0);

        LengthConverter convertedLength = new LengthConverter(originalLength);

        System.out.println("Length in feet before conversion: " + originalLength.feet);
        System.out.println("Length in centimeters after conversion: " + convertedLength.convertToCentimeters());
    }
}

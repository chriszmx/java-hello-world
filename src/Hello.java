public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Chris");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore <= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        } else {
            System.out.println("This car is not domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        // Step 1
        double doubleVar = 20.00;
        //step 2
        double secondDoubleVar = 80.00;
        // Step 3
        double stepThreeResult = (doubleVar + secondDoubleVar) * 100.00;
        System.out.println("Result of step 3: " + stepThreeResult);
        //Step 4
        double stepFourResult = stepThreeResult % 40.00;
        System.out.println("Step Four Result: " + stepFourResult);
        // Step 5
        boolean stepFiveBoo = stepFourResult == 0.00;
        // Step 6
        System.out.println(stepFiveBoo);
        // Step 7
        if (!stepFiveBoo) {
            System.out.println("got some remainder");
        }

    }
}

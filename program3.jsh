int[] prices = {12, 34, 56}; // Strawberry, Chocolate, Vanilla prices (based on student number format)
int conePrice = 100;

while (true) {
    System.out.println("Would you like (v)anilla, (c)hocolate or (s)trawberry?");
    String flavour = System.console().readLine().toLowerCase();

    // Check for invalid flavor
    if (!"v".equals(flavour) && !"c".equals(flavour) && !"s".equals(flavour)) {
        System.out.println("We don't have that flavour.");
        continue;
    }

    System.out.println("How many scoops would you like?");
    int scoops = Integer.parseInt(System.console().readLine());

    // Check for invalid scoop counts
    if (scoops < 1) {
        System.out.println("We don't sell just a cone.");
        continue;
    } else if (scoops > 3) {
        System.out.println("That's too many scoops to fit in a cone.");
        continue;
    }

    // Determine the price per scoop based on chosen flavor
    int pricePerScoop = prices["v".equals(flavour) ? 2 : "c".equals(flavour) ? 1 : 0];
    int totalCost = conePrice + (pricePerScoop * scoops);
    
    // Calculate pounds and pence
    int pounds = totalCost / 100;
    int pence = totalCost % 100;
    
    // Print the total price formatted in pounds and pence
    System.out.println("That will be " + pounds + "." + String.format("%02d", pence) + " please.");
}


package CRM_Project;

public class SalesLead {
    public static void main(String[] args) {
        short leadId = 9182;
        String leadName = "Nishitha Ingilala";
        byte leadAge = 20;
        char leadGender = 'F';
        String leadEmail = "nishithaingilala30@gmail.com";
        long leadPhone = 6301073808L;
        String leadStatus = "contacted";
        boolean isPurchased = false;
        String leadSource = "social media";
        String leadDescription = "This is a potential lead";
        // printing the values
        System.out.println("Lead ID: " + leadId);
        System.out.println("Lead Name: " + leadName);
        System.out.println(" Lead Age: " + leadAge);
        System.out.println("Lead Gender: " + leadGender);
        System.out.println("Lead Email: " + leadEmail);
        System.out.println("Lead Phone: " + leadPhone);
        System.out.println("Lead Status: " + leadStatus);
        System.out.println("Is Purchased: " + isPurchased);
        System.out.println("Lead Source: " + leadSource);
        System.out.println("Lead Description: " + leadDescription);

    }

}
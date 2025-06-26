package CRM_Project;



public class Ticket {
    public static void main(String[] args) {
        int ticketId = 546442;
        int customerId = 5644458;
        String issueType = "Billing";
        String issueDescription = "Payment failed";
        char status = 'N'; // N for New, P for Pending, R for Resolved, C
        byte priority = 2;
        float customerRated = 3.5f;
        boolean isOpen = true;
        String customerNotes = "Customer is not satisfied with the service";
        // printing the values
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Issue Type: " + issueType);
        System.out.println("Issue Description: " + issueDescription);
        System.out.println("Status: " + status);
        System.out.println("Priority: " + priority);
        System.out.println("Customer Rated: " + customerRated);
        System.out.println("Is Open: " + isOpen);
        System.out.println("Customer Notes: " + customerNotes);
    }
}
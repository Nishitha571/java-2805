public class Form{
    public static void main(String[] args) {
        System.out.println("*****************************************");
        System.out.println("Application for college Admission test");
        System.out.println('\n');
            
        boolean isFirstYear = true;
        boolean isTransferee = false;
        boolean isReturnee = false;

        String lastname="Ingilala";
        String firstname="Nishitha";   
        String middlename="";
        String complete_address="Kavali, Andhra Pradesh, India";
        String date_of_birth="20-08-2004";
        String birthplace="Kavali, Andhra Pradesh, India";
        String citizenship="Indian";
        char sex='F';
        char civil_status='S';
        long contact_number=6301073808L;
        String religion="Hindu";
        String spouseName = "";
        String spouseNumber = null;
        boolean isPWD = false;

        String fathers_name="Ramesh Ingilala";
        String occupation="Artist";
        long fathers_contact_number=7075225010L;

        String mothers_name="Manjula Ingilala";
        String Occupation="Homemaker";
        long mothers_contact_number=9581945304L;

        System.out.println("Is First Year: " +isFirstYear);
        System.out.println("Is Transferee: " +isTransferee);
        System.out.println("Is Returnee: " +isReturnee);
        System.out.println("Last name is: " +lastname);
        System.out.println("First name is: " +firstname);
        System.out.println("Middle name is: " +middlename);
        System.out.println("Address is: " +complete_address);
        System.out.println("Date of birth is: " +date_of_birth);
        System.out.println("Birth place is : " +birthplace);
        System.out.println("Citizenship is: " +citizenship);
        System.out.println("Gender is: " +sex);
        System.out.println("Civil status is: " +civil_status);
       
        System.out.println("Contact number is: " +contact_number);
        System.out.println("Religion is: " +religion);
        System.out.println("Spouse name is: " +spouseName);
        System.out.println("Spouse number is : " +spouseNumber);
        System.out.println("Is PWD: " +isPWD);
        System.out.println('\n');

        System.out.println("Father name is: " +fathers_name);
        System.out.println("Father occupation is: " +occupation);
        System.out.println("Father Contact number is: " +fathers_contact_number);
        System.out.println('\n');

        System.out.println("Mother name is: " +mothers_name);
        System.out.println("Mother occupation is: " +Occupation);
        System.out.println("Mother Contact number is: " +mothers_contact_number);
        System.out.println('\n');

        System.out.println("*****************************************");

    }
}
// This code is a simple Java program that simulates a college admission form.
// It collects personal information about the applicant, including their name, address, date of birth
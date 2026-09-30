public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // Naming

        // Which are valid variable names and which are not?
        // Try to determine what is valid and what is not without uncommenting the code.
        // If something is not valid, write a comment explaining why it is not valid.

        // Example:
        // int myVariable; // Valid
        // int %myVariable; // Not Valid, starts with a special character.


        // int 1stNumber;       // Invalid, starts with a number

        // int firstNumber;     // Valid

        // int tryThisNumber;   // Valid

        // int _myNumber;       // Valid, but not recommended (starts with underscore)

        // int int;             // Invalid, "int" is a reserved java keyword

        // int _number_;        // Valid, but not recommended (starts with underscore)

        // int i;               // Valid, but not recommended without any context

        // int number1;         // Valid

        // int .product;        // Invalid, special character
        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Naming convention

        // Which are recommended variable names and which are not?

        // Example:
        // int myVariable; // recommended
        // int _myVariable; // not recommended, starts with a special character
        // int g; // not recommended, depending on the context, it can make sense. E.g. in the context of gravitational acceleration

        int number1;                        // recommended
        int speed;                          // recommended
        int JustANUmber;                    // not recommended, starts with an upper case letter
        int justAnotherNumber;              // recommended
        int _weather;                       // not recommended, starts with a special character
        int _Id;                            // not recommended, starts with a special character
        int $Money;                         // not recommended, starts with a special character
        int moneyinthebankaccount;          // not recommended, no camelCase
        int aLotOfmoneyonbankAccount;       // not recommended, camelCase not consistently adhered to
        int circumstanceEarthInKM;          // recommended
        int circumstanceEarth_KM;           // recommended
        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Declaration and initialization of variables

        // Add the appropriate data type before the variable name, so, that it becomes a valid declaration and initialization.
        // (Variable names are in german to not reveal the result)

        float meineGleitkommaZahl = 23.5f;

        byte meineSehrKleineGanzzahl = 50;
        // byte. Could also very well be int or float, but we don't need to reserve more memory

        char meinUnicodeZeichen = '\u003D';

        short meineKleineGanzzahl = 200;
        // short. Could also very well be int, but we don't need to reserve more memory.
        // byte however would not work as the value range of byte only goes up to 128

        char meinBuchstabe = 'B';

        float meineNegativeGleitkommaZahl = -14.612f;
        // the "f" after the number already reveals the datatype

        double meineGrosseGleitkommaZahl = 50.1234567890123d;
        // the "d" after the number already reveals the datatype

        boolean meinWahrheitswert1 = false;
        // true or false is always a boolean

        int meineNormaleGanzzahl = 50_000;
        // int is the smallest possible data type for this number

        long meineGrosseGanzzahl = 123_456_789_012_345L;
        // the ‘L’ after the number already reveals the data type

        boolean meinWahrheitswert2 = true;
        // true or false is always a boolean
        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Keyword final

        // Based on the variable name/value, decide if the keyword "final" is suitable or not.
        // If it is suitable, apply the recommended naming convention for variables with the "final" keyword.
        // Write -why- you decided to either mark it as final or not.


        int moneyInBankAccount = 100_000;
        // Not final, the value can change (hopefully increasing!)

        short MY_BIRTHYEAR = 2001;
        // final, this will not change

        byte AMOUNT_OF_MONTHS = 12;
        // final. Attention: Can change, but unlikely

        float gravityForce = 9.81f;
        // final or not final, depending on the situation.
        // Definitely not final for precise calculations, as the value can change slightly based on the measured position on the earth.
        // But can be final for simple calculations like in games etc.

        byte AMOUNT_OF_MINUTES_PER_HOUR = 60;
        // final, won't change

        short AMOUNT_OF_SECONDS_PER_HOUR = 3600;
        // final or not final, depending on the situation.
        // There are so called leapseconds(Schaltsekunden)
        // For very precise calculations not final, otherwise final

        float PI = 3.14159f;
        // final, won't change
        // Careful: The data type must be considered. If several decimal places are desired, double should be preferred to float

        short amountOfStudents = 167;
        // Not final, can change over the course of a year
        //--------------------------------------------------------------------------------------------------------------
    }
}
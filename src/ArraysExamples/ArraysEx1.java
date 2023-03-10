package ArraysExamples;

public class ArraysEx1 {
    public static void main(String[] args){


        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


//        1. find out the first index number of "Gloves"
        int indexNo=-1;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves"))
            {
                indexNo=i;
                break;
            }
        }
        System.out.println("First index number of \"Gloves\" : "+indexNo);


//        2. find out if "iPad" is contained in the item list
        boolean result = false;
        for (String item : items) {

            if (item.equals("iPad")) {
                result = true;
                break;
            }
        }
        System.out.println("Arrays contains \"iPad\" : "+result);


        for (int i = 0; i < items.length; i++) {

            System.out.println(items[i]+"-"+prices[i]+"-"+itemIDs[i]);

        }



    }
}



//Given the following arrays:
//        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
//        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
//        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
//
//
//        1. find out the first index number of "Gloves"
//
//        2. find out if "iPad" is contained in the item list
//
//        3. Print the report of each shopping item
//            name - price - #ID
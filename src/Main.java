import model.Product;

public class Main
{
    public static void main(String[] args) {
        String original = "Vaibhav";
        String reversed = "";

//        StringBuilder reversed = new StringBuilder(original).reverse();
        //SringBuilder is a better way to reverse string especially when using long strings

        for (int i = original.length()-1 ; i>=0; i--)
        {
//            System.out.println(original.charAt(i));
            reversed += original.charAt(i);
        }
//
////        System.out.println("OG string " +original);
//       System.out.println("Reversed string " +reversed);


        Product product = new Product("Vaibhav's model.Product");
        System.out.println("Calling model.Product object: " +product.getName());



    }
}


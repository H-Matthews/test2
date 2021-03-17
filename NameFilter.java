import java.lang.*;
import java.util.ArrayList;

public class NameFilter
{
    // productFound will be flagged to true if the product is found in the ProductCatalogue stored in the database
    private boolean productFound;


    public boolean validProductName(String inputName)
    {
        for(Product product: product.getProductCatalogue())
        {
            if(product.getProductName().compareTo(inputName) == 0)
            {
                productFound = true;
            }
            else
            {
                productFound = false;
            }
        }
        return productFound;
    }


    public Product retrieveByName(String inputName)
    {
        // getProductCatalogue()
        Product p = null;

        if(validProductName(inputName) == true)
        {
            for(Product product: product.getProductCatalogue())
            {
                if(product.getProductName().compareTo(inputName) == 0)
                {
                    p = product;
                    break;
                }
            }
        }

       return p.clone();

    }


}


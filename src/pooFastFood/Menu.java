
package pooFastFood;

import java.util.ArrayList;
import java.util.List;

public class Menu {
   private List<IFastFood> Items; 
   public Menu(){
       Items = new ArrayList<>();
   }

    public List<IFastFood> getItems() {
        return Items;
    }

    public void setItems(List<IFastFood> Items) {
        this.Items = Items;
    }
   
}

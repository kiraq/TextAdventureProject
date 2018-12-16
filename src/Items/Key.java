package Items;

import People.Person;

public class Key implements Item{

    @Override
    public void addtoInventory(Person person) {
        for(int i = 0; i < person.getInventory().length; i++){
            if(person.getInventory()[i] == null){
                person.getInventory()[i] = "Key";
                break;
            }
        }
    }

}

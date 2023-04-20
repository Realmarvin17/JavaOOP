package seminar5.Phonebook;

import java.util.ArrayList;

//rename class
public class AddressBook {
    ArrayList<Phonebook> pb=new ArrayList<>();

    //rename class
    public void Addressable(){
        pb.add(new Phonebook("Медведев Дмитрий Анатольевич","+79057777777","Санкт-Петербург"));
        pb.add(new Phonebook("Путин Владимир Владимирович","+79058888888","Москва"));
    }

    public void showAddressBook(ArrayList<Phonebook> phonebook){
        for(Phonebook i:phonebook){
            System.out.println(i.getName()+" "+i.getPhone()+" "+i.getCity());
        }
    }
}
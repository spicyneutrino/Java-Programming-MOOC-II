import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    ArrayList<Person> people = new ArrayList<>();

    public void add(Person personToAdd) {
        this.people.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        for (Person personToAdd : peopleToAdd) {
            this.people.add(personToAdd);
        }
    }

    public void print() {
        people.forEach(person -> System.out.println(person));
    }

    public void print(Education education){
        // this.people.stream()
        // .map(person ->person.getEducation())
        // .filter(edu->edu.equals(education))
        // .forEach(edu->System.out.println(edu));

        Iterator<Person>iterator = this.people.iterator();

        while (iterator.hasNext()){
            Person currentPerson = iterator.next();
            if (education.equals(currentPerson.getEducation())){
                System.out.println(currentPerson);
            }
        }
    }

    public void fire(Education education){
        Iterator<Person>iterator = this.people.iterator();

        while (iterator.hasNext()){
            Person currentPerson = iterator.next();
            if (education.equals(currentPerson.getEducation())){
                iterator.remove();
            }
        }
    }
}

public class Student extends Person {
    private int studyCredits=0;

    public Student(String name, String address) {
        super(name, address);
    }

    public void study(){
        this.studyCredits++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + this.credits();
    }

    public int credits(){
        return this.studyCredits;
    }
    
    
}

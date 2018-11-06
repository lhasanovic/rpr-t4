package ba.unsa.etf.rpr.tutorijal1;

public class Student {
   private String firstName;
    private String lastName;
    private int index;
    private int numberOfECTSPoints=0;

    public Student(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumberOfECTSPoints() {
        return numberOfECTSPoints;}

        public int increasePoints(int a){
        return 0;
        }
    public int decreasePoints(int a){
        return 0;
    }
    public String toString(){
        String no="meee";
        return no;
    }

}

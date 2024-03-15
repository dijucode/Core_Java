class CollegeData {
    public static void main(String[] args) {
        CollegeData c = new CollegeData();
        Student d = c.getData();
        System.out.println(d.id +" -- "+d.name +" -- "+d.age +" -- "+d.gender );

    }
    Student getData(){
        Student s = new Student();
        s.age = 30;
        s.id = 101;
        s.name = "Ashok";
        s.gender = 'M';
        return s;
    }
}
class Student{

    int id;
    String name;
    char gender;
    int age;
}


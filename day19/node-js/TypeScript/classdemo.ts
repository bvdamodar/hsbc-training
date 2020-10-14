
class Emp {

    private empId: Number;
    private name: String;
    private city: String;
    private salary: Number;

    constructor(empId: Number, name: String, city: String, salary: Number) {
        this.empId = empId;
        this.name = name;
        this.city = city;
        this.salary = salary;
    }

    // public getDetails() {
    //     console.log("Employee(Emp): " + this.empId + " " + this.name + " " + this.city + " " + this.salary);
    // }

    public getDetails(): String {
        return ("Employee(Emp): " + this.empId + " " + this.name + " " + this.city + " " + this.salary);
    }

}

class Trainee extends Emp {

    // if grade is public in constructor, no need to define it as private outside
    //private grade:String;

    //in this constructor, 1st 4 varialbes can be declared private also
    constructor(empId: Number, name: String, city: String, salary: Number,public grade: String) {
        super(empId, name, city, salary);
        this.grade = grade;
    }
    
    public getDetails() {
        return super.getDetails() + " "+ this.grade;
    }

}

var emp: Emp = new Emp(100, "Ram", "Vizag", 55000);
// emp.getDetails();
console.log(emp.getDetails());


var trainee = new Trainee(101, "Raj", "Goa", 40000, "A");
console.log(trainee.getDetails());
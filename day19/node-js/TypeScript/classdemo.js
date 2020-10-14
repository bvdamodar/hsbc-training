var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Emp = /** @class */ (function () {
    function Emp(empId, name, city, salary) {
        this.empId = empId;
        this.name = name;
        this.city = city;
        this.salary = salary;
    }
    // public getDetails() {
    //     console.log("Employee(Emp): " + this.empId + " " + this.name + " " + this.city + " " + this.salary);
    // }
    Emp.prototype.getDetails = function () {
        return ("Employee(Emp): " + this.empId + " " + this.name + " " + this.city + " " + this.salary);
    };
    return Emp;
}());
var Trainee = /** @class */ (function (_super) {
    __extends(Trainee, _super);
    //private grade:String;
    function Trainee(empId, name, city, salary, grade) {
        var _this = _super.call(this, empId, name, city, salary) || this;
        _this.grade = grade;
        _this.grade = grade;
        return _this;
    }
    Trainee.prototype.getDetails = function () {
        return _super.prototype.getDetails.call(this) + " " + this.grade;
    };
    return Trainee;
}(Emp));
var emp = new Emp(100, "Ram", "Vizag", 55000);
// emp.getDetails();
console.log(emp.getDetails());
var trainee = new Trainee(101, "Raj", "Goa", 40000, "A");
console.log(trainee.getDetails());
